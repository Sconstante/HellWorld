package Main;

import Archivo.archivo;
import Control.mouse;
import Control.teclado;
import Mapa.gestionMapas;
import Mapa.mapaCargado;
import entes.armaCuerpo;
import entes.criaturas.enemigo;
import entes.criaturas.gestionPlayer;
import entes.criaturas.player;
import graficos.MenuInferior;
import graficos.Pantalla;
import graficos.Sprite;
import graficos.interfaz;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.File;
import java.text.AttributedCharacterIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class main extends Canvas implements Runnable {

    private static final int ANCHO = 800;
    private static final int ALTO = 544;
    public static volatile boolean funcionamiento = false;
    private static final String NOMBRE = "Hell World";

    private static int aps = 0;
    private static int fps = 0;

    ////Interfaz
    /////Start
    ///
    public static gestionMapas mapas;
    private static JFrame ventana;

    private static Thread hilo;
    private static teclado tecla;
    private static mouse raton;
    private static Pantalla pantalla;
    public static mapaCargado mapa;
    private static player player;
    public enemigo[] enemigos;
    public static armaCuerpo arma;
    private static MenuInferior menu;

    private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);

    private static int[] pixeles = ((DataBufferInt) imagen.getRaster().getDataBuffer()).getData();

    // private static final ImageIcon icono = new ImageIcon(game.class.getResource("recursos/logoo.jpg"));
    //private static ImageIcon img = new ImageIcon("/recursos/prueba.png");
    ////////////mapas
    private String mapa1 = "/mapas/Pruebax.png";
    private static archivo archivo;
    public static gestionPlayer gestionPlayer;
    public static interfaz interfaz;

    ////////////
    public main() {
        setPreferredSize(new Dimension(ANCHO, ALTO));

        pantalla = new Pantalla(ANCHO, ALTO);
        //mapa= new mapaGenerado(8,8);//tiles del mapa

        tecla = new teclado();
        addKeyListener(tecla);
        raton = new mouse(this);
        addMouseListener(raton);
        mapa = new mapaCargado(tecla);
        player = new player(mapa, tecla, Sprite.caballero1_1d, 200, 200);
        enemigos = new enemigo[6];

        for (int i = 0; i < 6; i++) {
            enemigos[i] = new enemigo(this.mapa, this.tecla, Sprite.enemigo1_1d, 0, 0, this.player, 0.025, this.raton, this);
        }
        arma = new armaCuerpo(mapa, tecla, Sprite.arma, 96, 96, this.player, raton, enemigos);

        mapas = new gestionMapas(player, mapa, tecla, raton, this);
        menu = new MenuInferior(player, mapa, raton, tecla, Sprite.barra, 0, 448, pantalla);
        gestionPlayer = new gestionPlayer(mapa, tecla, player, raton, arma);
        archivo = new archivo(player);

        //gestionPlayer.tipoPersonaje(8);
        ventana = new JFrame(NOMBRE);
        interfaz = new interfaz(archivo, ventana, this, gestionPlayer, player);

        //ventana.setUndecorated(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        //ventana.setIconImage(icono.getImage());
        setCursor(raton.obtenerCursor());

    }

    public static void main(String[] args) {
        main juego = new main();
        //juego.iniciar();  
    }

    public synchronized void iniciar() {
        interfaz.pausa.setVisible(true);
        funcionamiento = true;
        hilo = new Thread(this, "Graficos");
        hilo.start();

    }

    public synchronized void detener() {
        interfaz.pausa.setVisible(false);
        funcionamiento = false;
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void actualizar() {
        tecla.actualizar();
        mapas.actualizar();

        raton.actualizar(this);
        for (int i = 0; i < 6; i++) {
            enemigos[i].actualizar();
        }
        player.actualizar();
        menu.actualizar();
        arma.actualizar();

        raton.reiniciarClick();

        aps++;
        //System.out.println(player.obtenx() + "," + player.obteny());
    }

    private void mostrar() {

        BufferStrategy estrategia = getBufferStrategy();

        if (estrategia == null) {
            createBufferStrategy(3);
            return;
        }

        pantalla.limpiar();
        mapa.mostrar(player.obtenx() - pantalla.tamaAncho() / 2 + player.obtenSprite().size / 2, player.obteny() - (pantalla.tamaAlto() - 96) / 2 + player.obtenSprite().size / 2, pantalla);
        for (int i = 0; i < 6; i++) {
            enemigos[i].mostrar(pantalla);
        }
        player.mostrar(pantalla);
        arma.mostrar(pantalla);
        player.mostrar2(pantalla);
        menu.mostrar(pantalla);
        //pantalla.draw(x,y);

        System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
        /*for(int i=0;i<pixeles.length;i++){
            pixeles[i]=pantalla.pixeles[i];
        }*/
        Graphics g = estrategia.getDrawGraphics();

        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);

        /* g.setColor(new Color(243, 212, 39));
        g.setFont(new Font("Impact",Font.PLAIN,30));
        g.drawString(""+player.dinero, 20, 50);*/
        g.dispose();

        //System.out.println(player.obtenx()+","+player.obteny());/////AQUIIIIII(X,Y)
        estrategia.show();

        fps++;

    }

    @Override
    public void run() {

        final int NS_SEG = 1000000000;
        final byte APS_OBJ = 60;
        final double NS_ACT = NS_SEG / APS_OBJ;
        long refact = System.nanoTime();
        long refcont = System.nanoTime();
        double time_trans;
        double delta = 0;

        requestFocus();//te pone dentro de la pestaña cuando se ejecuta

        while (funcionamiento) {
            final long inibucle = System.nanoTime();
            time_trans = inibucle - refact;
            refact = inibucle;
            delta += time_trans / NS_ACT;
            while (delta >= 1) {
                actualizar();
                delta--;
            }
            mostrar();
            if (System.nanoTime() - refcont > NS_SEG) {
                ventana.setTitle(NOMBRE + " | APS: " + aps + " | FPS: " + fps);
                //System.out.println(fps);
                aps = 0;
                fps = 0;
                refcont = System.nanoTime();
            }
        }

    }
}
