package graficos;

import Archivo.archivo;
import Main.main;
import entes.criaturas.gestionPlayer;
import entes.criaturas.player;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class interfaz {

    private static int precio = 0;
    private static JPanel titulo;
    private static JLabel start;
    private boolean ventanaCompra = false;
    /////Menu
    private static JPanel Menu;
    private static JLabel nuevoJuego;
    private static JLabel continuar;
    private static JLabel creditos;
    //////Crear Personaje
    private static JPanel crearPersonaje;
    private static JLabel caballero;
    private static JLabel mago;
    private static JLabel bestia;
    private static JLabel salirCrearPersonaje;
    private static JTextField nombrePersonaje;
    private static int personaje = 0;
    private static JLabel crear;
    private static JLabel caballeroText;
    private static JLabel magoText;
    private static JLabel bestiaText;
    private static JLabel eligePersonaje;
    private static JLabel eligeNombre;
    ///////Continuar partida
    private static JPanel continuarPartida;
    private static JLabel salircontinuarPartida;
    private static JLabel personaje1;
    private static JLabel personaje2;
    private static JLabel personaje3;
    private static JLabel nombre1;
    private static JLabel nombre2;
    private static JLabel nombre3;
    private static JLabel borrar1;
    private static JLabel borrar2;
    private static JLabel borrar3;
    ///////Validar Jugadores LLenos
    private static JPanel continuarPartidaA;
    private static JLabel salircontinuarPartidaA;
    private static JLabel personaje1A;
    private static JLabel personaje2A;
    private static JLabel personaje3A;
    private static JLabel nombre1A;
    private static JLabel nombre2A;
    private static JLabel nombre3A;
    private static JLabel borrar1A;
    private static JLabel borrar2A;
    private static JLabel borrar3A;

    ///////Pausa
    private static JPanel menuPausa;
    private static JLabel continuarPausa;
    private static JLabel volverALMenu;
    private static JLabel irAlLobby;
    private static JLabel xSalir;

    ////
    public static JPanel inventario;
    private static JPanel elije;
    //
    private static JLabel elijeTraje;
    private static JLabel elijeArma;
    private static JLabel elijeSalida;
    //
    private static JPanel trajes;
    //
    private static JLabel trajeMago1;
    private static JLabel trajeMago2;
    private static JLabel trajeMago3;
    private static JLabel trajeCaballero1;
    private static JLabel trajeCaballero2;
    private static JLabel trajeCaballero3;
    private static JLabel trajeBestia1;
    private static JLabel trajeBestia2;
    private static JLabel trajeBestia3;
    private static JLabel trajeSalida;
    private static JLabel trajeAtras;
    //
    private static JPanel armas;
    private static JLabel armaActual1;
    private static JLabel armaActual2;
    private static JLabel armaActual3;
    private static JLabel arma1;
    private static JLabel arma2;
    private static JLabel arma3;
    private static JLabel arma4;
    private static JLabel arma6;
    private static JLabel arma5;
    private static JLabel arma7;
    private static JLabel arma8;
    private static JLabel arma9;
    private static JLabel arma10;
    private static JLabel arma11;
    private static JLabel arma12;
    private static JLabel armaCambio1;
    private static JLabel armaCambio2;
    private static JLabel cambio;
    private static JLabel armaSalida;
    private static JLabel armaAtras;

    /////tienda
    public static JPanel tienda;
    private static JPanel elijeTienda;

    private static JLabel elijeTrajeTienda;
    private static JLabel elijeArmaTienda;
    private static JLabel elijeSalidaTienda;

    private static JPanel trajesTienda;
    private static JLabel trajeMago1Tienda;
    private static JLabel trajeMago2Tienda;
    private static JLabel trajeMago3Tienda;
    private static JLabel trajeCaballero1Tienda;
    private static JLabel trajeCaballero2Tienda;
    private static JLabel trajeCaballero3Tienda;
    private static JLabel trajeBestia1Tienda;
    private static JLabel trajeBestia2Tienda;
    private static JLabel trajeBestia3Tienda;
    private static JLabel trajeSalidaTienda;
    private static JLabel trajeAtrasTienda;
    private static JLabel dinero;
    private static JLabel logoDinero;

    private static JPanel armasTienda;
    private static JLabel arma1Tienda;
    private static JLabel arma2Tienda;
    private static JLabel arma3Tienda;
    private static JLabel arma4Tienda;
    private static JLabel arma5Tienda;
    private static JLabel arma6Tienda;
    private static JLabel arma7Tienda;
    private static JLabel arma8Tienda;
    private static JLabel arma9Tienda;
    private static JLabel arma10Tienda;
    private static JLabel arma11Tienda;
    private static JLabel arma12Tienda;
    private static JLabel armasSalidaTienda;
    private static JLabel armasAtrasTienda;
    public static JLabel dinero2;
    private static JLabel dinero3;
    private static JLabel logoDinero2;
    private static JLabel dinero4;
    private static JLabel dinero5;

    public static JPanel compra2;
    private static JLabel aceptar2;
    private static JLabel rechazar2;
    private static JLabel salir2;
    private static JLabel infoCompra_2;
    private static JLabel infoCompra2_2;
    private static JLabel infoCompra3_2;

//////
    public static JPanel compra;
    private static JLabel aceptar;
    private static JLabel rechazar;
    private static JLabel salir;
    private static JLabel infoCompra;
    private static JLabel infoCompra2;
    private static JLabel infoCompra3;

    /////Pausa
    public static JPanel pausa;
    private static JLabel pausa1;

    private static archivo archivo;
    private static JFrame ventana;
    private static main game;
    private static player player;
    private static gestionPlayer gestionPlayer;

    public interfaz(archivo archivo, JFrame ventana, main game, gestionPlayer gestionPlayer, player player) {
        this.game = game;
        this.ventana = ventana;
        this.archivo = archivo;
        this.gestionPlayer = gestionPlayer;
        this.player = player;
        Inicializar();
        interfaz();
    }

    private void Inicializar() {
        titulo = new JPanel();
        titulo.setVisible(false);
        Menu = new JPanel();
        crearPersonaje = new JPanel();
        menuPausa = new JPanel();
        continuarPartida = new JPanel();
        continuarPartidaA = new JPanel();
        elijeTienda = new JPanel();
        elije = new JPanel();
        trajes = new JPanel();
        trajesTienda = new JPanel();
        armasTienda = new JPanel();
        armas = new JPanel();
        inventario = new JPanel();
        tienda = new JPanel();
        start = new JLabel("Inicio", SwingConstants.CENTER);//
        nuevoJuego = new JLabel("NUEVA PARTIDA", SwingConstants.CENTER);//
        continuar = new JLabel("CARGAR PARTIDA", SwingConstants.CENTER);//
        creditos = new JLabel("CREDITOS", SwingConstants.CENTER);//
        caballero = new JLabel();
        mago = new JLabel();
        bestia = new JLabel();
        salirCrearPersonaje = new JLabel();
        caballeroText = new JLabel("CABALLERO", SwingConstants.CENTER);
        magoText = new JLabel("HECHICERO", SwingConstants.CENTER);
        bestiaText = new JLabel("BESTIA", SwingConstants.CENTER);
        eligePersonaje = new JLabel("Elige tu tipo de personaje", SwingConstants.CENTER);
        nombrePersonaje = new JTextField();
        eligeNombre = new JLabel("APODO", SwingConstants.LEFT);
        crear = new JLabel("EMPEZAR", SwingConstants.CENTER);
        pausa = new JPanel();
        pausa1 = new JLabel();
        continuarPausa = new JLabel("CONTINUAR", SwingConstants.CENTER);
        irAlLobby = new JLabel("LOBBY", SwingConstants.CENTER);
        xSalir = new JLabel("X", SwingConstants.CENTER);
        volverALMenu = new JLabel("MENU PRINCIPAL", SwingConstants.CENTER);
        salircontinuarPartida = new JLabel();
        personaje1 = new JLabel();
        personaje2 = new JLabel();
        personaje3 = new JLabel();
        nombre1 = new JLabel("", SwingConstants.CENTER);
        nombre2 = new JLabel("", SwingConstants.CENTER);
        nombre3 = new JLabel("", SwingConstants.CENTER);
        borrar1 = new JLabel();
        borrar2 = new JLabel();
        borrar3 = new JLabel();
        salircontinuarPartidaA = new JLabel();
        personaje1A = new JLabel();
        personaje2A = new JLabel();
        personaje3A = new JLabel();
        nombre1A = new JLabel("", SwingConstants.CENTER);
        nombre2A = new JLabel("", SwingConstants.CENTER);
        nombre3A = new JLabel("", SwingConstants.CENTER);
        borrar1A = new JLabel();
        borrar2A = new JLabel();
        borrar3A = new JLabel();
        elijeArma = new JLabel();
        elijeTraje = new JLabel();
        elijeSalida = new JLabel();
        trajeMago1 = new JLabel();
        trajeMago2 = new JLabel();
        trajeMago3 = new JLabel();
        trajeCaballero1 = new JLabel();
        trajeCaballero2 = new JLabel();
        trajeCaballero3 = new JLabel();
        trajeBestia1 = new JLabel();
        trajeBestia2 = new JLabel();
        trajeBestia3 = new JLabel();
        trajeSalida = new JLabel();
        trajeAtras = new JLabel();

        trajeMago1Tienda = new JLabel();
        trajeMago2Tienda = new JLabel();
        trajeMago3Tienda = new JLabel();
        trajeCaballero1Tienda = new JLabel();
        trajeCaballero2Tienda = new JLabel();
        trajeCaballero3Tienda = new JLabel();
        trajeBestia1Tienda = new JLabel();
        trajeBestia2Tienda = new JLabel();
        trajeBestia3Tienda = new JLabel();
        trajeSalidaTienda = new JLabel();
        trajeAtrasTienda = new JLabel();

        arma1Tienda = new JLabel();
        arma2Tienda = new JLabel();
        arma3Tienda = new JLabel();
        arma4Tienda = new JLabel();
        arma5Tienda = new JLabel();
        arma6Tienda = new JLabel();
        arma7Tienda = new JLabel();
        arma8Tienda = new JLabel();
        arma9Tienda = new JLabel();
        arma10Tienda = new JLabel();
        arma11Tienda = new JLabel();
        arma12Tienda = new JLabel();
        armasSalidaTienda = new JLabel();
        armasAtrasTienda = new JLabel();
        dinero2 = new JLabel("", SwingConstants.CENTER);
        dinero5 = new JLabel();
        logoDinero2 = new JLabel();
        dinero3 = new JLabel();
        dinero4 = new JLabel();

        armaActual1 = new JLabel();
        armaActual2 = new JLabel();
        armaActual3 = new JLabel();
        arma1 = new JLabel();
        arma2 = new JLabel();
        arma3 = new JLabel();
        arma4 = new JLabel();
        arma6 = new JLabel();
        arma5 = new JLabel();
        arma7 = new JLabel();
        arma8 = new JLabel();
        arma9 = new JLabel();
        arma10 = new JLabel();
        arma11 = new JLabel();
        arma12 = new JLabel();
        armaCambio1 = new JLabel();
        armaCambio2 = new JLabel();
        cambio = new JLabel();
        armaSalida = new JLabel();
        armaAtras = new JLabel();

        dinero = new JLabel();
        logoDinero = new JLabel();

        elijeArmaTienda = new JLabel();
        elijeTrajeTienda = new JLabel();
        elijeSalidaTienda = new JLabel();

        compra = new JPanel();
        aceptar = new JLabel();
        rechazar = new JLabel();
        salir = new JLabel();
        infoCompra = new JLabel();
        infoCompra2 = new JLabel();
        infoCompra3 = new JLabel("", SwingConstants.CENTER);

        compra2 = new JPanel();
        aceptar2 = new JLabel();
        rechazar2 = new JLabel();
        salir2 = new JLabel();
        infoCompra_2 = new JLabel();
        infoCompra2_2 = new JLabel();
        infoCompra3_2 = new JLabel("", SwingConstants.CENTER);

    }
    private int tiendaSelect = 0;

    private void personaje(int n, JLabel per) {
        switch (n) {
            case 1:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCaballero.png")));
                break;
            case 2:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniMago.png")));
                break;
            case 3:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniBestia.png")));
                break;
            case 4:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCaballero2.png")));
                break;
            case 5:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniMago2.png")));
                break;
            case 6:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniBestia2.png")));
                break;
            case 7:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCaballero3.png")));
                break;
            case 8:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniMago3.png")));
                break;
            case 9:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniBestia3.png")));
                break;
            default:
                per.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
        }

    }

    private void interfaz() {

        titulo.setLayout(null);
        ventana.add(titulo);
        Menu.setLayout(null);
        ventana.add(Menu);
        crearPersonaje.setLayout(null);
        ventana.add(crearPersonaje);
        pausa.setLayout(null);
        ventana.add(pausa);
        menuPausa.setLayout(null);
        ventana.add(menuPausa);
        continuarPartida.setLayout(null);
        ventana.add(continuarPartida);
        continuarPartidaA.setLayout(null);
        ventana.add(continuarPartidaA);
        inventario.setLayout(null);
        ventana.add(inventario);
        elije.setLayout(null);
        inventario.add(elije);
        elije.setVisible(false);
        trajes.setLayout(null);
        inventario.add(trajes);
        armas.setLayout(null);
        inventario.add(armas);

        tienda.setLayout(null);
        ventana.add(tienda);
        elijeTienda.setLayout(null);
        tienda.add(elijeTienda);
        //elijeTienda.setVisible(false);
        trajesTienda.setLayout(null);
        tienda.add(trajesTienda);
        tienda.setVisible(false);
        compra.setLayout(null);
        trajesTienda.add(compra);

        armasTienda.setLayout(null);
        tienda.add(armasTienda);
        compra2.setLayout(null);
        armasTienda.add(compra2);
        dinero5.setText("" + player.dinero);
        dinero2.setText("" + player.dinero);
        dinero3.setIcon(new ImageIcon(getClass().getResource("/recursos/monedas_1.png")));

        Menu.setBounds(0, 0, 810, 544);
        Menu.setBackground(new Color(48, 0, 0));
        titulo.setBounds(0, 0, 810, 544);
        titulo.setBackground(new Color(226, 118, 40));
        crearPersonaje.setBounds(0, 0, 810, 544);
        crearPersonaje.setBackground(new Color(48, 0, 0));
        pausa.setBounds(748, 20, 32, 32);
        pausa.setBackground(new Color(255, 0, 0));
        pausa.setVisible(false);
        menuPausa.setBounds(0, 0, 810, 544);
        menuPausa.setBackground(new Color(48, 0, 0));
        menuPausa.setVisible(false);
        inventario.setBounds(0, 0, 810, 544);
        inventario.setBackground(new Color(48, 0, 0));
        elije.setBounds(0, 0, 810, 544);
        elije.setBackground(new Color(48, 0, 0));
        trajes.setBounds(0, 0, 810, 544);
        trajes.setBackground(new Color(48, 0, 0));
        armas.setBounds(0, 0, 810, 544);
        armas.setBackground(new Color(48, 0, 0));

        tienda.setBounds(0, 0, 810, 544);
        tienda.setBackground(new Color(48, 0, 0));
        elijeTienda.setBounds(0, 0, 810, 544);
        elijeTienda.setBackground(new Color(48, 0, 0));
        trajesTienda.setBounds(0, 0, 810, 544);
        trajesTienda.setBackground(new Color(48, 0, 0));
        armasTienda.setBounds(0, 0, 810, 544);
        armasTienda.setBackground(new Color(48, 0, 0));

        crearPersonaje.setVisible(false);
        continuarPartida.setBounds(0, 0, 810, 544);
        continuarPartida.setBackground(new Color(48, 0, 0));
        continuarPartida.setVisible(false);
        continuarPartidaA.setBounds(0, 0, 810, 544);
        continuarPartidaA.setBackground(new Color(48, 0, 0));
        continuarPartidaA.setVisible(false);

        compra.setBounds(250, 200, 300, 195);
        compra.setBackground(Color.GRAY);
        compra.setVisible(false);

        aceptar.setLayout(null);
        compra.add(aceptar);
        aceptar.setBounds(170, 143, 80, 32);
        aceptar.setOpaque(true);
        aceptar.setLayout(null);
        aceptar.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        aceptar.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (player.dinero - precio >= 0) {
                    player.trajes[tiendaSelect] = true;
                    compra.setVisible(false);
                    ventanaCompra = false;
                    player.dinero = player.dinero - precio;
                    dinero.setText("" + player.dinero);
                    trajesTienda();
                }
            }
        });

        rechazar.setLayout(null);
        compra.add(rechazar);
        rechazar.setBounds(50, 143, 80, 32);
        rechazar.setOpaque(true);
        rechazar.setLayout(null);
        rechazar.setBackground(Color.red); //cambia color fondo jlabel
        rechazar.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                compra.setVisible(false);
                ventanaCompra = false;
            }
        });

        infoCompra.setLayout(null);
        compra.add(infoCompra);
        infoCompra.setBounds(40, 30, 100, 100);
        infoCompra.setOpaque(true);
        infoCompra.setLayout(null);
        infoCompra.setBackground(Color.white); //cambia color fondo jlabel

        infoCompra2.setLayout(null);
        compra.add(infoCompra2);
        infoCompra2.setBounds(150, 30, 140, 50);
        infoCompra2.setOpaque(false);
        infoCompra2.setLayout(null);
        infoCompra2.setBackground(Color.white); //cambia color fondo jlabel
        infoCompra2.setText("Confirmar compra");

        infoCompra3.setLayout(null);
        compra.add(infoCompra3);
        infoCompra3.setBounds(150, 30, 104, 100);
        infoCompra3.setOpaque(false);
        infoCompra3.setLayout(null);
        infoCompra3.setBackground(Color.white); //cambia color fondo jlabel
        infoCompra3.setFont(new Font("arial", 1, 20));
        infoCompra3.setText(precio + "$");
        infoCompra3.setForeground(new Color(254, 168, 50));

        salir.setLayout(null);
        compra.add(salir);
        salir.setBounds(270, 10, 20, 20);
        salir.setOpaque(true);
        salir.setLayout(null);
        salir.setBackground(Color.white);
        salir.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar2.png")));
        salir.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                compra.setVisible(false);
                ventanaCompra = false;
            }
        });

        compra2.setBounds(250, 200, 300, 195);
        compra2.setBackground(Color.GRAY);
        compra2.setVisible(false);

        aceptar2.setLayout(null);
        compra2.add(aceptar2);
        aceptar2.setBounds(170, 143, 80, 32);
        aceptar2.setOpaque(true);
        aceptar2.setLayout(null);
        aceptar2.setBackground(new Color(48, 144, 25)); //cambia color fondo jlabel
        aceptar2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (player.dinero - precio >= 0) {
                    player.armas[tiendaSelect] = true;
                    compra2.setVisible(false);
                    ventanaCompra = false;
                    player.dinero = player.dinero - precio;
                    dinero2.setText("" + player.dinero);
                    dinero5.setText("" + player.dinero);
                    armasTienda();
                }
            }
        });

        rechazar2.setLayout(null);
        compra2.add(rechazar2);
        rechazar2.setBounds(50, 143, 80, 32);
        rechazar2.setOpaque(true);
        rechazar2.setLayout(null);
        rechazar2.setBackground(Color.red); //cambia color fondo jlabel
        rechazar2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                compra2.setVisible(false);
                ventanaCompra = false;
            }
        });

        infoCompra_2.setLayout(null);
        compra2.add(infoCompra_2);
        infoCompra_2.setBounds(50, 30, 80, 80);
        infoCompra_2.setOpaque(true);
        infoCompra_2.setLayout(null);
        infoCompra_2.setBackground(Color.white); //cambia color fondo jlabel

        infoCompra2_2.setLayout(null);
        compra2.add(infoCompra2_2);
        infoCompra2_2.setBounds(150, 30, 140, 50);
        infoCompra2_2.setOpaque(false);
        infoCompra2_2.setLayout(null);
        infoCompra2_2.setBackground(Color.white); //cambia color fondo jlabel
        infoCompra2_2.setText("Confirmar compra");

        infoCompra3_2.setLayout(null);
        compra2.add(infoCompra3_2);
        infoCompra3_2.setBounds(150, 30, 104, 100);
        infoCompra3_2.setOpaque(false);
        infoCompra3_2.setLayout(null);
        infoCompra3_2.setBackground(Color.white); //cambia color fondo jlabel
        infoCompra3_2.setFont(new Font("arial", 1, 20));
        infoCompra3_2.setText(precio + "$");
        infoCompra3_2.setForeground(new Color(254, 168, 50));

        salir2.setLayout(null);
        compra2.add(salir2);
        salir2.setBounds(270, 10, 20, 20);
        salir2.setOpaque(true);
        salir2.setLayout(null);
        salir2.setBackground(Color.white);
        salir2.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar2.png")));
        salir2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                compra2.setVisible(false);
                ventanaCompra = false;
            }
        });

        game.arma.ArmaSelec();
        armaActual1.setLayout(null);
        armas.add(armaActual1);
        armaActual1.setBounds(130, 70, 80, 80);
        armaActual1.setOpaque(true);
        armaActual1.setLayout(null);
        armaActual1.setBackground(Color.white); //cambia color fondo jlabel
        armaActual1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                armasEnUso2();
                armaSeleccionadaEnUso = 1;
                armasEnUso4();
                armasEnUso1(player.porteArmas[0], armaCambio1);
            }
        });
        armaActual2.setLayout(null);
        armas.add(armaActual2);
        armaActual2.setBounds(220, 70, 80, 80);
        armaActual2.setOpaque(true);
        armaActual2.setLayout(null);
        armaActual2.setBackground(Color.white); //cambia color fondo jlabel

        armaActual2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                armasEnUso2();
                armaSeleccionadaEnUso = 2;
                armasEnUso4();
                armasEnUso1(player.porteArmas[1], armaCambio1);
            }
        });
        armaActual3.setLayout(null);
        armas.add(armaActual3);
        armaActual3.setBounds(310, 70, 80, 80);
        armaActual3.setOpaque(true);
        armaActual3.setLayout(null);
        armaActual3.setBackground(Color.white); //cambia color fondo jlabel
        armaActual3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  

                armasEnUso2();
                armaSeleccionadaEnUso = 3;
                armasEnUso4();
                armasEnUso1(player.porteArmas[2], armaCambio1);
            }
        });
//438, 590 armavacia2

        armaCambio1.setLayout(null);
        armas.add(armaCambio1);
        armaCambio1.setBounds(438, 70, 80, 80);
        armaCambio1.setOpaque(true);
        armaCambio1.setLayout(null);
        armaCambio1.setBackground(Color.white);
        armaCambio1.setIcon(new ImageIcon(getClass().getResource("/recursos/armavacia2.png")));

        armaCambio2.setLayout(null);
        armas.add(armaCambio2);
        armaCambio2.setBounds(590, 70, 80, 80);
        armaCambio2.setOpaque(true);
        armaCambio2.setLayout(null);
        armaCambio2.setBackground(Color.white);
        armaCambio2.setIcon(new ImageIcon(getClass().getResource("/recursos/armavacia1.png")));

        cambio.setLayout(null);
        armas.add(cambio);
        cambio.setBounds(518, 74, 72, 72);
        cambio.setOpaque(false);
        cambio.setLayout(null);
        cambio.setBackground(Color.white);
        cambio.setIcon(new ImageIcon(getClass().getResource("/recursos/cambio.png")));
        cambio.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                if (armaSeleccionada != 0 && armaSeleccionadaEnUso != 0) {
                    int aux = armaSeleccionada;
                    int aux2 = player.porteArmas[armaSeleccionadaEnUso - 1];
                    int aux3 = armaSeleccionadaEnUso;
                    armaSeleccionada = aux2;
                    player.porteArmas[armaSeleccionadaEnUso - 1] = aux;

                    ordenArmas();
                    armaSeleccionada = aux2;
                    actualizarSeleccion();
                    armasEnUso5(armaSeleccionada, armaCambio2);

                    armasEnUso2();
                    armaSeleccionadaEnUso = aux3;
                    armasEnUso4();
                    armasEnUso1(player.porteArmas[aux3 - 1], armaCambio1);

                    game.arma.ArmaSelec();
                }

            }
        });

        arma1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 1;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 2;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 3;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma4.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 4;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma5.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 5;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma6.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 6;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma7.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 7;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma8.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 8;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma9.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 9;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma10.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 10;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma11.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 11;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });
        arma12.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                ordenArmas();
                armaSeleccionada = 12;
                actualizarSeleccion();
                armasEnUso5(armaSeleccionada, armaCambio2);
            }
        });

        armaSalida.setLayout(null);
        armas.add(armaSalida);
        armaSalida.setBounds(740, 20, 40, 40);
        armaSalida.setOpaque(false);
        armaSalida.setLayout(null);
        armaSalida.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        armaSalida.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar.png")));
        armaSalida.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK   

                elije.setVisible(true);
                armas.setVisible(false);
                game.detener();
                game.iniciar();
                pausa.setVisible(true);
                inventario.setVisible(false);

            }
        });

        armaAtras.setLayout(null);
        armas.add(armaAtras);
        armaAtras.setBounds(20, 20, 50, 32);
        armaAtras.setOpaque(false);
        armaAtras.setLayout(null);
        armaAtras.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        armaAtras.setIcon(new ImageIcon(getClass().getResource("/recursos/salir.png")));
        armaAtras.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     
                elije.setVisible(true);
                armas.setVisible(false);

            }
        });

        trajeCaballero1.setLayout(null);
        trajes.add(trajeCaballero1);
        trajeCaballero1.setBounds(150, 136, 100, 100);
        trajeCaballero1.setOpaque(true);
        trajeCaballero1.setLayout(null);
        trajeCaballero1.setBackground(Color.white); //cambia color fondo jlabel
        trajeCaballero1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1.png")));
        trajeCaballero1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[0] == true) {
                    game.gestionPlayer.tipoPersonaje(1);
                    player.trajeActual = 1;
                    trajes2();
                }
            }
        });

        trajeCaballero2.setLayout(null);
        trajes.add(trajeCaballero2);
        trajeCaballero2.setBounds(350, 136, 100, 100);
        trajeCaballero2.setOpaque(true);
        trajeCaballero2.setLayout(null);
        trajeCaballero2.setBackground(Color.white); //cambia color fondo jlabel
        trajeCaballero2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2.png")));
        trajeCaballero2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[3] == true) {
                    game.gestionPlayer.tipoPersonaje(4);
                    player.trajeActual = 4;
                    trajes2();
                }
            }
        });

        trajeCaballero3.setLayout(null);
        trajes.add(trajeCaballero3);
        trajeCaballero3.setBounds(550, 136, 100, 100);
        trajeCaballero3.setOpaque(true);
        trajeCaballero3.setLayout(null);
        trajeCaballero3.setBackground(Color.white); //cambia color fondo jlabel
        trajeCaballero3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3.png")));
        trajeCaballero3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[6] == true) {
                    game.gestionPlayer.tipoPersonaje(7);
                    player.trajeActual = 7;
                    trajes2();
                }
            }
        });

        trajeMago1.setLayout(null);
        trajes.add(trajeMago1);
        trajeMago1.setBounds(150, 272, 100, 100);
        trajeMago1.setOpaque(true);
        trajeMago1.setLayout(null);
        trajeMago1.setBackground(Color.white); //cambia color fondo jlabel
        trajeMago1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1.png")));
        trajeMago1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[1] == true) {
                    game.gestionPlayer.tipoPersonaje(2);
                    player.trajeActual = 2;
                    trajes2();
                }
            }
        });
        // trajeMago1.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton.png")));
        trajeMago2.setLayout(null);
        trajes.add(trajeMago2);
        trajeMago2.setBounds(350, 272, 100, 100);
        trajeMago2.setOpaque(true);
        trajeMago2.setLayout(null);
        trajeMago2.setBackground(Color.white); //cambia color fondo jlabel
        trajeMago2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2.png")));
        trajeMago2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[4] == true) {
                    game.gestionPlayer.tipoPersonaje(5);
                    player.trajeActual = 5;
                    trajes2();
                }
            }
        });

        trajeMago3.setLayout(null);
        trajes.add(trajeMago3);
        trajeMago3.setBounds(550, 272, 100, 100);
        trajeMago3.setOpaque(true);
        trajeMago3.setLayout(null);
        trajeMago3.setBackground(Color.white); //cambia color fondo jlabel
        trajeMago3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3.png")));
        trajeMago3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[7] == true) {
                    game.gestionPlayer.tipoPersonaje(8);
                    player.trajeActual = 8;
                    trajes2();
                }
            }
        });

        trajeBestia1.setLayout(null);
        trajes.add(trajeBestia1);
        trajeBestia1.setBounds(150, 408, 100, 100);
        trajeBestia1.setOpaque(true);
        trajeBestia1.setLayout(null);
        trajeBestia1.setBackground(Color.white); //cambia color fondo jlabel
        trajeBestia1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1.png")));
        trajeBestia1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[2] == true) {
                    game.gestionPlayer.tipoPersonaje(3);
                    player.trajeActual = 3;
                    trajes2();
                }
            }
        });

        trajeBestia2.setLayout(null);
        trajes.add(trajeBestia2);
        trajeBestia2.setBounds(350, 408, 100, 100);
        trajeBestia2.setOpaque(true);
        trajeBestia2.setLayout(null);
        trajeBestia2.setBackground(Color.white); //cambia color fondo jlabel
        trajeBestia2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2.png")));
        trajeBestia2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[5] == true) {
                    game.gestionPlayer.tipoPersonaje(6);
                    player.trajeActual = 6;
                    trajes2();
                }
            }
        });

        trajeBestia3.setLayout(null);
        trajes.add(trajeBestia3);
        trajeBestia3.setBounds(550, 408, 100, 100);
        trajeBestia3.setOpaque(true);
        trajeBestia3.setLayout(null);
        trajeBestia3.setBackground(Color.white); //cambia color fondo jlabel
        trajeBestia3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3.png")));
        trajeBestia3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[8] == true) {
                    game.gestionPlayer.tipoPersonaje(9);
                    player.trajeActual = 9;
                    trajes2();
                }
            }
        });
        arma1Tienda.setLayout(null);
        armasTienda.add(arma1Tienda);
        arma1Tienda.setBounds(130, 190, 80, 80);
        arma1Tienda.setOpaque(true);
        arma1Tienda.setLayout(null);
        arma1Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b1.png")));
        arma1Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[0] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 80;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 0;
                    tiendaTrajes2(1);
                    ventanaCompra = true;
                }
            }
        });
        arma2Tienda.setLayout(null);
        armasTienda.add(arma2Tienda);
        arma2Tienda.setBounds(282, 190, 80, 80);
        arma2Tienda.setOpaque(true);
        arma2Tienda.setLayout(null);
        arma2Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b1.png")));
        arma2Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[1] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 160;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 1;
                    tiendaTrajes2(2);
                    ventanaCompra = true;
                }
            }
        });
        arma3Tienda.setLayout(null);
        armasTienda.add(arma3Tienda);
        arma3Tienda.setBounds(438, 190, 80, 80);
        arma3Tienda.setOpaque(true);
        arma3Tienda.setLayout(null);
        arma3Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b1.png")));
        arma3Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[2] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 540;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 2;
                    tiendaTrajes2(3);
                    ventanaCompra = true;
                }
            }
        });
        arma4Tienda.setLayout(null);
        armasTienda.add(arma4Tienda);
        arma4Tienda.setBounds(590, 190, 80, 80);
        arma4Tienda.setOpaque(true);
        arma4Tienda.setLayout(null);
        arma4Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma4Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b1.png")));
        arma4Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[3] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 900;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 3;
                    tiendaTrajes2(4);
                    ventanaCompra = true;
                }
            }
        });
        arma5Tienda.setLayout(null);
        armasTienda.add(arma5Tienda);
        arma5Tienda.setBounds(130, 300, 80, 80);
        arma5Tienda.setOpaque(true);
        arma5Tienda.setLayout(null);
        arma5Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma5Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b1.png")));
        arma5Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[4] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 270;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 4;
                    tiendaTrajes2(5);
                    ventanaCompra = true;
                }
            }
        });
        arma6Tienda.setLayout(null);
        armasTienda.add(arma6Tienda);
        arma6Tienda.setBounds(282, 300, 80, 80);
        arma6Tienda.setOpaque(true);
        arma6Tienda.setLayout(null);
        arma6Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma6Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b1.png")));
        arma6Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[5] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 80;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 5;
                    tiendaTrajes2(6);
                    ventanaCompra = true;
                }
            }
        });
        arma7Tienda.setLayout(null);
        armasTienda.add(arma7Tienda);
        arma7Tienda.setBounds(438, 300, 80, 80);
        arma7Tienda.setOpaque(true);
        arma7Tienda.setLayout(null);
        arma7Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma7Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b1.png")));
        arma7Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[6] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 1500;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 6;
                    tiendaTrajes2(7);
                    ventanaCompra = true;
                }
            }
        });
        arma8Tienda.setLayout(null);
        armasTienda.add(arma8Tienda);
        arma8Tienda.setBounds(590, 300, 80, 80);
        arma8Tienda.setOpaque(true);
        arma8Tienda.setLayout(null);
        arma8Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma8Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b1.png")));
        arma8Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[7] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 80;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 7;
                    tiendaTrajes2(8);
                    ventanaCompra = true;
                }
            }
        });
        arma9Tienda.setLayout(null);
        armasTienda.add(arma9Tienda);
        arma9Tienda.setBounds(130, 410, 80, 80);
        arma9Tienda.setOpaque(true);
        arma9Tienda.setLayout(null);
        arma9Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma9Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b1.png")));
        arma9Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[8] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 720;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 8;
                    tiendaTrajes2(9);
                    ventanaCompra = true;
                }
            }
        });
        arma10Tienda.setLayout(null);
        armasTienda.add(arma10Tienda);
        arma10Tienda.setBounds(282, 410, 80, 80);
        arma10Tienda.setOpaque(true);
        arma10Tienda.setLayout(null);
        arma10Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma10Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b1.png")));
        arma10Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[9] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 380;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 9;
                    tiendaTrajes2(10);
                    ventanaCompra = true;
                }
            }
        });
        arma11Tienda.setLayout(null);
        armasTienda.add(arma11Tienda);
        arma11Tienda.setBounds(438, 410, 80, 80);
        arma11Tienda.setOpaque(true);
        arma11Tienda.setLayout(null);
        arma11Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma11Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b1.png")));
        arma11Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[10] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 470;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 10;
                    tiendaTrajes2(11);
                    ventanaCompra = true;
                }
            }
        });
        arma12Tienda.setLayout(null);
        armasTienda.add(arma12Tienda);
        arma12Tienda.setBounds(590, 410, 80, 80);
        arma12Tienda.setOpaque(true);
        arma12Tienda.setLayout(null);
        arma12Tienda.setBackground(Color.white); //cambia color fondo jlabel
        arma12Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b1.png")));
        arma12Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.armas[11] == false && ventanaCompra == false) {
                    compra2.setVisible(true);
                    precio = 1200;
                    infoCompra3_2.setText(precio + "$");
                    tiendaSelect = 11;
                    tiendaTrajes2(12);
                    ventanaCompra = true;
                }
            }
        });

        trajeCaballero1Tienda.setLayout(null);
        trajesTienda.add(trajeCaballero1Tienda);
        trajeCaballero1Tienda.setBounds(150, 136, 100, 100);
        trajeCaballero1Tienda.setOpaque(true);
        trajeCaballero1Tienda.setLayout(null);
        trajeCaballero1Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeCaballero1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1.png")));
        trajeCaballero1Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[0] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 500;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 0;
                    tiendaTrajes(1);
                    ventanaCompra = true;
                }
            }
        });

        trajeCaballero2Tienda.setLayout(null);
        trajesTienda.add(trajeCaballero2Tienda);
        trajeCaballero2Tienda.setBounds(350, 136, 100, 100);
        trajeCaballero2Tienda.setOpaque(true);
        trajeCaballero2Tienda.setLayout(null);
        trajeCaballero2Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeCaballero2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2.png")));
        trajeCaballero2Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[3] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 900;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 3;
                    tiendaTrajes(4);
                    ventanaCompra = true;
                }
            }
        });

        trajeCaballero3Tienda.setLayout(null);
        trajesTienda.add(trajeCaballero3Tienda);
        trajeCaballero3Tienda.setBounds(550, 136, 100, 100);
        trajeCaballero3Tienda.setOpaque(true);
        trajeCaballero3Tienda.setLayout(null);
        trajeCaballero3Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeCaballero3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3.png")));
        trajeCaballero3Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                if (player.trajes[6] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 1300;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 6;
                    tiendaTrajes(7);
                    ventanaCompra = true;
                }

            }
        });

        trajeMago1Tienda.setLayout(null);
        trajesTienda.add(trajeMago1Tienda);
        trajeMago1Tienda.setBounds(150, 272, 100, 100);
        trajeMago1Tienda.setOpaque(true);
        trajeMago1Tienda.setLayout(null);
        trajeMago1Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeMago1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1.png")));
        trajeMago1Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[1] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 500;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 1;
                    tiendaTrajes(2);
                    ventanaCompra = true;
                }
            }
        });
        // trajeMago1.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton.png")));
        trajeMago2Tienda.setLayout(null);
        trajesTienda.add(trajeMago2Tienda);
        trajeMago2Tienda.setBounds(350, 272, 100, 100);
        trajeMago2Tienda.setOpaque(true);
        trajeMago2Tienda.setLayout(null);
        trajeMago2Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeMago2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2.png")));
        trajeMago2Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[4] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 1100;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 4;
                    tiendaTrajes(5);
                    ventanaCompra = true;
                }
            }
        });

        trajeMago3Tienda.setLayout(null);
        trajesTienda.add(trajeMago3Tienda);
        trajeMago3Tienda.setBounds(550, 272, 100, 100);
        trajeMago3Tienda.setOpaque(true);
        trajeMago3Tienda.setLayout(null);
        trajeMago3Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeMago3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3.png")));
        trajeMago3Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[7] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 1700;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 7;
                    tiendaTrajes(8);
                    ventanaCompra = true;
                }
            }
        });

        trajeBestia1Tienda.setLayout(null);
        trajesTienda.add(trajeBestia1Tienda);
        trajeBestia1Tienda.setBounds(150, 408, 100, 100);
        trajeBestia1Tienda.setOpaque(true);
        trajeBestia1Tienda.setLayout(null);
        trajeBestia1Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeBestia1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1.png")));
        trajeBestia1Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[2] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 500;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 2;
                    tiendaTrajes(3);
                    ventanaCompra = true;
                }
            }
        });

        trajeBestia2Tienda.setLayout(null);
        trajesTienda.add(trajeBestia2Tienda);
        trajeBestia2Tienda.setBounds(350, 408, 100, 100);
        trajeBestia2Tienda.setOpaque(true);
        trajeBestia2Tienda.setLayout(null);
        trajeBestia2Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeBestia2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2.png")));
        trajeBestia2Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[5] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 1300;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 5;
                    tiendaTrajes(6);
                    ventanaCompra = true;
                }
            }
        });

        trajeBestia3Tienda.setLayout(null);
        trajesTienda.add(trajeBestia3Tienda);
        trajeBestia3Tienda.setBounds(550, 408, 100, 100);
        trajeBestia3Tienda.setOpaque(true);
        trajeBestia3Tienda.setLayout(null);
        trajeBestia3Tienda.setBackground(Color.white); //cambia color fondo jlabel
        trajeBestia3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3.png")));
        trajeBestia3Tienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                if (player.trajes[8] == false && ventanaCompra == false) {
                    compra.setVisible(true);
                    precio = 2000;
                    infoCompra3.setText(precio + "$");
                    tiendaSelect = 8;
                    tiendaTrajes(9);
                    ventanaCompra = true;
                }
            }
        });

        elijeArma.setLayout(null);
        elije.add(elijeArma);
        elijeArma.setBounds(125, 170, 210, 210);
        elijeArma.setOpaque(false);
        elijeArma.setLayout(null);
        elijeArma.setBackground(Color.white); //cambia color fondo jlabel
        elijeArma.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton.png")));

        elijeArma.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeArma.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton2.png")));
            }
        });
        elijeArma.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeArma.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton.png")));

            }
        });
        elijeArma.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                ordenArmas();
                armasEnUso2();
                //System.out.println("perro");
                armas.setVisible(true);
                //System.out.println("perro2");
                elije.setVisible(false);
                //System.out.println("perro3");
                armaCambio1.setIcon(new ImageIcon(getClass().getResource("/recursos/armavacia2.png")));
                armaCambio2.setIcon(new ImageIcon(getClass().getResource("/recursos/armavacia1.png")));

            }
        });
        elijeArmaTienda.setLayout(null);
        elijeTienda.add(elijeArmaTienda);
        elijeArmaTienda.setBounds(125, 170, 210, 210);
        elijeArmaTienda.setOpaque(false);
        elijeArmaTienda.setLayout(null);
        elijeArmaTienda.setBackground(Color.white); //cambia color fondo jlabel
        elijeArmaTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton.png")));

        elijeArmaTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeArmaTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton2.png")));
            }
        });
        elijeArmaTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeArmaTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/espadaBoton.png")));

            }
        });
        elijeArmaTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                armasTienda.setVisible(true);
                elijeTienda.setVisible(false);
                trajesTienda.setVisible(false);
                dinero2.setText("" + player.dinero);
                dinero5.setText("" + player.dinero);
                dinero.setText("" + player.dinero);
            }
        });

        elijeTraje.setLayout(null);
        elije.add(elijeTraje);
        elijeTraje.setBounds(465, 170, 210, 210);
        elijeTraje.setOpaque(false);
        elijeTraje.setLayout(null);
        elijeTraje.setBackground(Color.white); //cambia color fondo jlabel
        elijeTraje.setIcon(new ImageIcon(getClass().getResource("/recursos/armaduraBoton.png")));

        elijeTraje.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeTraje.setIcon(new ImageIcon(getClass().getResource("/recursos/armaduraBoton2.png")));
            }
        });
        elijeTraje.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeTraje.setIcon(new ImageIcon(getClass().getResource("/recursos/armaduraBoton.png")));

            }
        });
        elijeTraje.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                trajes.setVisible(true);
                elije.setVisible(false);

            }
        });

        elijeTrajeTienda.setLayout(null);
        elijeTienda.add(elijeTrajeTienda);
        elijeTrajeTienda.setBounds(465, 170, 210, 210);
        elijeTrajeTienda.setOpaque(false);
        elijeTrajeTienda.setLayout(null);
        elijeTrajeTienda.setBackground(Color.white); //cambia color fondo jlabel
        elijeTrajeTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/armaduraBoton.png")));

        elijeTrajeTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeTrajeTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/armaduraBoton2.png")));
            }
        });
        elijeTrajeTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                elijeTrajeTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/armaduraBoton.png")));

            }
        });
        elijeTrajeTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                trajesTienda.setVisible(true);
                elijeTienda.setVisible(false);
                armasTienda.setVisible(false);
                dinero2.setText("" + player.dinero);
                dinero5.setText("" + player.dinero);
                dinero.setText("" + player.dinero);
            }
        });

        elijeSalida.setLayout(null);
        elije.add(elijeSalida);
        elijeSalida.setBounds(740, 20, 40, 40);
        elijeSalida.setOpaque(false);
        elijeSalida.setLayout(null);
        elijeSalida.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        elijeSalida.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar.png")));
        elijeSalida.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseClicked(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK 
                //System.out.println(player.partidaCargada);

                //game.funcionamiento=true;
                game.detener();
                game.iniciar();
                pausa.setVisible(true);
                inventario.setVisible(false);
            }
        });

        elijeSalidaTienda.setLayout(null);
        elijeTienda.add(elijeSalidaTienda);
        elijeSalidaTienda.setBounds(740, 20, 40, 40);
        elijeSalidaTienda.setOpaque(false);
        elijeSalidaTienda.setLayout(null);
        elijeSalidaTienda.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        elijeSalidaTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar.png")));
        elijeSalidaTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseClicked(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     
                //archivo.ActualizarDatos();
                //game.funcionamiento=true;
                game.detener();
                game.iniciar();
                pausa.setVisible(true);
                tienda.setVisible(false);
                dinero2.setText("" + player.dinero);
                dinero5.setText("" + player.dinero);
                dinero.setText("" + player.dinero);
            }
        });

        trajeSalida.setLayout(null);
        trajes.add(trajeSalida);
        trajeSalida.setBounds(740, 20, 40, 40);
        trajeSalida.setOpaque(false);
        trajeSalida.setLayout(null);
        trajeSalida.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        trajeSalida.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar.png")));
        trajeSalida.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK   

                elije.setVisible(true);
                trajes.setVisible(false);
                game.detener();
                game.iniciar();
                pausa.setVisible(true);
                inventario.setVisible(false);

            }
        });

        trajeSalidaTienda.setLayout(null);
        trajesTienda.add(trajeSalidaTienda);
        trajeSalidaTienda.setBounds(740, 20, 40, 40);
        trajeSalidaTienda.setOpaque(false);
        trajeSalidaTienda.setLayout(null);
        trajeSalidaTienda.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        trajeSalidaTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar.png")));
        trajeSalidaTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK   

                elijeTienda.setVisible(true);
                trajesTienda.setVisible(false);
                game.detener();
                game.iniciar();
                pausa.setVisible(true);
                tienda.setVisible(false);
                compra.setVisible(false);
                ventanaCompra = false;
                dinero2.setText("" + player.dinero);
                dinero5.setText("" + player.dinero);
                dinero.setText("" + player.dinero);
            }
        });
        armasSalidaTienda.setLayout(null);
        armasTienda.add(armasSalidaTienda);
        armasSalidaTienda.setBounds(740, 20, 40, 40);
        armasSalidaTienda.setOpaque(false);
        armasSalidaTienda.setLayout(null);
        armasSalidaTienda.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        armasSalidaTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/borrar.png")));
        armasSalidaTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK   

                elijeTienda.setVisible(true);
                armasTienda.setVisible(false);
                game.detener();
                game.iniciar();
                pausa.setVisible(true);
                tienda.setVisible(false);
                compra.setVisible(false);
                ventanaCompra = false;
                dinero2.setText("" + player.dinero);
                dinero.setText("" + player.dinero);
            }
        });

        trajeAtras.setLayout(null);
        trajes.add(trajeAtras);
        trajeAtras.setBounds(20, 20, 50, 32);
        trajeAtras.setOpaque(false);
        trajeAtras.setLayout(null);
        trajeAtras.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        trajeAtras.setIcon(new ImageIcon(getClass().getResource("/recursos/salir.png")));
        trajeAtras.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     
                elije.setVisible(true);
                trajes.setVisible(false);

            }
        });
        trajeAtrasTienda.setLayout(null);
        trajesTienda.add(trajeAtrasTienda);
        trajeAtrasTienda.setBounds(20, 20, 50, 32);
        trajeAtrasTienda.setOpaque(false);
        trajeAtrasTienda.setLayout(null);
        trajeAtrasTienda.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        trajeAtrasTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/salir.png")));
        trajeAtrasTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     
                elijeTienda.setVisible(true);
                trajesTienda.setVisible(false);
                compra.setVisible(false);
                ventanaCompra = false;
                dinero2.setText("" + player.dinero);
                dinero.setText("" + player.dinero);
            }
        });

        armasAtrasTienda.setLayout(null);
        armasTienda.add(armasAtrasTienda);
        armasAtrasTienda.setBounds(20, 20, 50, 32);
        armasAtrasTienda.setOpaque(false);
        armasAtrasTienda.setLayout(null);
        armasAtrasTienda.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        armasAtrasTienda.setIcon(new ImageIcon(getClass().getResource("/recursos/salir.png")));
        armasAtrasTienda.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     
                elijeTienda.setVisible(true);
                armasTienda.setVisible(false);
                compra.setVisible(false);
                ventanaCompra = false;
                dinero2.setText("" + player.dinero);
                dinero.setText("" + player.dinero);
            }
        });
        logoDinero.setLayout(null);
        trajesTienda.add(logoDinero);
        logoDinero.setBounds(90, 20, 32, 32);
        logoDinero.setOpaque(false);
        logoDinero.setLayout(null);
        logoDinero.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        logoDinero.setIcon(new ImageIcon(getClass().getResource("/recursos/coin2.png")));

        dinero.setLayout(null);
        trajesTienda.add(dinero);
        dinero.setBounds(132, 20, 80, 32);
        dinero.setOpaque(false);
        dinero.setLayout(null);
        dinero.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        dinero.setFont(new Font("arial", 1, 26));
        dinero.setText("" + player.dinero);
        dinero.setForeground(new Color(254, 168, 50));

        logoDinero2.setLayout(null);
        armasTienda.add(logoDinero2);
        logoDinero2.setBounds(90, 20, 32, 32);
        logoDinero2.setOpaque(false);
        logoDinero2.setLayout(null);
        logoDinero2.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        logoDinero2.setIcon(new ImageIcon(getClass().getResource("/recursos/coin2.png")));

        dinero2.setLayout(null);
        ventana.add(dinero2);//armasTienda
        dinero2.setBounds(92, 20, 100, 36);
        dinero2.setOpaque(false);
        dinero2.setLayout(null);
        dinero2.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        dinero2.setFont(new Font("arial", 1, 26));
        dinero2.setText("" + player.dinero);
        dinero2.setForeground(new Color(254, 168, 50));

        dinero5.setLayout(null);
        armasTienda.add(dinero5);//armasTienda
        dinero5.setBounds(132, 20, 80, 32);
        dinero5.setOpaque(false);
        dinero5.setLayout(null);
        dinero5.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        dinero5.setFont(new Font("arial", 1, 26));
        dinero5.setText("" + player.dinero);
        dinero5.setForeground(new Color(254, 168, 50));

        dinero3.setLayout(null);
        ventana.add(dinero3);//armasTienda
        dinero3.setBounds(92, 20, 100, 36);
        dinero3.setOpaque(false);
        dinero3.setLayout(null);
        dinero3.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        dinero3.setFont(new Font("arial", 1, 26));
        dinero3.setForeground(new Color(254, 168, 50));

        dinero4.setLayout(null);
        ventana.add(dinero4);//armasTienda
        dinero4.setBounds(58, 20, 34, 36);
        dinero4.setOpaque(false);
        dinero4.setLayout(null);
        dinero4.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        dinero4.setFont(new Font("arial", 1, 26));
        dinero4.setForeground(new Color(254, 168, 50));
        dinero4.setIcon(new ImageIcon(getClass().getResource("/recursos/monedas_2.png")));

        //
        trajes.setVisible(false);
        elije.setVisible(true);
        inventario.setVisible(false);

        start.setLayout(null);
        titulo.add(start);
        start.setBounds(0, 0, 810, 544);
        start.setOpaque(false);
        start.setLayout(null);
        start.setBackground(Color.white); //cambia color fondo jlabel
        start.setIcon(new ImageIcon(getClass().getResource("/recursos/titulo.png")));
        start.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                Menu.setVisible(true);
                titulo.setVisible(false);
                crearPersonaje.setVisible(false);

                //detener();
            }
        });

        nuevoJuego.setLayout(null);
        Menu.add(nuevoJuego);
        nuevoJuego.setFont(new Font("century gothic", 1, 30));
        nuevoJuego.setBorder(BorderFactory.createLineBorder(Color.black));
        nuevoJuego.setBounds(250, 230, 300, 60);
        nuevoJuego.setOpaque(true);
        nuevoJuego.setLayout(null);
        nuevoJuego.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        nuevoJuego.setForeground(Color.white);
        nuevoJuego.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                nuevoJuego.setBackground(new Color(175, 58, 19));
                nuevoJuego.setForeground(new Color(210, 210, 210));
            }
        });
        nuevoJuego.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                nuevoJuego.setBackground(new Color(223, 70, 18));
                nuevoJuego.setForeground(Color.white);
            }
        });
        nuevoJuego.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                crearPersonaje.setVisible(true);
                Menu.setVisible(false);

            }
        });

        continuar.setLayout(null);
        Menu.add(continuar);
        continuar.setFont(new Font("century gothic", 1, 30));
        continuar.setBorder(BorderFactory.createLineBorder(Color.black));
        continuar.setBounds(250, 310, 300, 60);
        continuar.setOpaque(true);
        continuar.setLayout(null);
        continuar.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        continuar.setForeground(Color.white);
        continuar.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                continuar.setBackground(new Color(175, 58, 19));
                continuar.setForeground(new Color(210, 210, 210));
            }
        });
        continuar.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                continuar.setBackground(new Color(223, 70, 18));
                continuar.setForeground(Color.white);
            }
        });
        continuar.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                File file1 = new File("C:\\user", "Personaje1.txt");
                File file2 = new File("C:\\user", "Personaje2.txt");
                File file3 = new File("C:\\user", "Personaje3.txt");
                if (file1.exists()) {
                    archivo.cargarPersonaje(1);
                    nombre1.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje1);
                } else {
                    nombre1.setText("");
                    personaje1.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file2.exists()) {
                    archivo.cargarPersonaje(2);
                    nombre2.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje2);
                } else {
                    nombre2.setText("");
                    personaje2.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file3.exists()) {
                    archivo.cargarPersonaje(3);
                    nombre3.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje3);
                } else {
                    nombre3.setText("");
                    personaje3.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                continuarPartida.setVisible(true);
                Menu.setVisible(false);
            }
        });

        creditos.setLayout(null);
        Menu.add(creditos);
        creditos.setFont(new Font("century gothic", 1, 30));
        creditos.setBorder(BorderFactory.createLineBorder(Color.black));
        creditos.setBounds(250, 390, 300, 60);
        creditos.setOpaque(true);
        creditos.setLayout(null);
        creditos.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        creditos.setForeground(Color.white);
        creditos.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                creditos.setBackground(new Color(175, 58, 19));
                creditos.setForeground(new Color(210, 210, 210));
            }
        });
        creditos.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                creditos.setBackground(new Color(223, 70, 18));
                creditos.setForeground(Color.white);
            }
        });
        creditos.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

            }
        });

        caballero.setLayout(null);
        crearPersonaje.add(caballero);
        caballero.setBounds(125, 120, 150, 150);
        caballero.setOpaque(false);
        caballero.setLayout(null);
        caballero.setBackground(Color.white); //cambia color fondo jlabel
        caballero.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeCaballero1.png")));

        caballero.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                personaje = 1;
                for (int i = 0; i < 12; i++) {
                    player.armas[i] = false;
                }
                player.armas[0] = true;
                for (int i = 0; i < 9; i++) {
                    player.trajes[i] = false;
                }
                player.trajes[0] = true;
                player.porteArmas[0] = 1;
                player.porteArmas[1] = 0;
                player.porteArmas[2] = 0;
                player.trajeActual = 1;
                player.armaActual = 1;
                bestia.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeBestia1.png")));
                mago.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeMago1.png")));
                caballero.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeCaballero2.png")));
            }
        });

        mago.setLayout(null);
        crearPersonaje.add(mago);
        mago.setBounds(325, 120, 150, 150);
        mago.setOpaque(false);
        mago.setLayout(null);
        mago.setBackground(Color.white); //cambia color fondo jlabel
        mago.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeMago1.png")));

        mago.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                personaje = 2;
                for (int i = 0; i < 12; i++) {
                    player.armas[i] = false;
                }
                player.armas[7] = true;
                for (int i = 0; i < 9; i++) {
                    player.trajes[i] = false;
                }
                player.trajes[1] = true;
                player.porteArmas[0] = 8;
                player.porteArmas[1] = 0;
                player.porteArmas[2] = 0;
                player.trajeActual = 2;
                player.armaActual = 8;
                bestia.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeBestia1.png")));
                caballero.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeCaballero1.png")));
                mago.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeMago2.png")));
            }
        });

        bestia.setLayout(null);
        crearPersonaje.add(bestia);
        bestia.setBounds(525, 120, 150, 150);
        bestia.setOpaque(false);
        bestia.setLayout(null);
        bestia.setBackground(Color.white); //cambia color fondo jlabel
        bestia.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeBestia1.png")));

        bestia.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                personaje = 3;
                for (int i = 0; i < 12; i++) {
                    player.armas[i] = false;
                }
                player.armas[5] = true;
                for (int i = 0; i < 9; i++) {
                    player.trajes[i] = false;
                }
                player.trajes[2] = true;
                player.porteArmas[0] = 6;
                player.porteArmas[1] = 0;
                player.porteArmas[2] = 0;
                player.trajeActual = 3;
                player.armaActual = 6;
                bestia.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeBestia2.png")));
                caballero.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeCaballero1.png")));
                mago.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeMago1.png")));
            }
        });

        salirCrearPersonaje.setLayout(null);
        crearPersonaje.add(salirCrearPersonaje);
        salirCrearPersonaje.setBounds(10, 10, 50, 32);
        salirCrearPersonaje.setOpaque(false);
        salirCrearPersonaje.setLayout(null);
        salirCrearPersonaje.setBackground(Color.white); //cambia color fondo jlabel
        salirCrearPersonaje.setIcon(new ImageIcon(getClass().getResource("/recursos/salir.png")));

        salirCrearPersonaje.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                personaje = 0;
                nombrePersonaje.setText("");
                mago.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeMago1.png")));
                caballero.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeCaballero1.png")));
                bestia.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeBestia1.png")));
                Menu.setVisible(true);
                crearPersonaje.setVisible(false);
            }
        });

        caballeroText.setLayout(null);
        crearPersonaje.add(caballeroText);
        caballeroText.setBounds(125, 270, 150, 30);
        caballeroText.setOpaque(false);
        caballeroText.setLayout(null);
        caballeroText.setBackground(Color.white); //cambia color fondo jlabel 
        caballeroText.setFont(new Font("century gothic", 1, 20));
        //caballeroText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        caballeroText.setForeground(Color.white);

        magoText.setLayout(null);
        crearPersonaje.add(magoText);
        magoText.setBounds(325, 270, 150, 30);
        magoText.setOpaque(false);
        magoText.setLayout(null);
        magoText.setBackground(Color.white); //cambia color fondo jlabel 
        magoText.setFont(new Font("century gothic", 1, 20));
        //caballeroText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        magoText.setForeground(Color.white);

        bestiaText.setLayout(null);
        crearPersonaje.add(bestiaText);
        bestiaText.setBounds(525, 270, 150, 30);
        bestiaText.setOpaque(false);
        bestiaText.setLayout(null);
        bestiaText.setBackground(Color.white); //cambia color fondo jlabel 
        bestiaText.setFont(new Font("century gothic", 1, 20));
        //caballeroText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        bestiaText.setForeground(Color.white);

        eligePersonaje.setLayout(null);
        crearPersonaje.add(eligePersonaje);
        eligePersonaje.setBounds(135, 30, 525, 50);
        eligePersonaje.setOpaque(false);
        eligePersonaje.setLayout(null);
        eligePersonaje.setBackground(Color.white); //cambia color fondo jlabel 
        eligePersonaje.setFont(new Font("century gothic", 1, 30));
        //caballeroText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        eligePersonaje.setForeground(Color.white);

        eligeNombre.setLayout(null);
        crearPersonaje.add(eligeNombre);
        eligeNombre.setBounds(180, 320, 150, 50);
        eligeNombre.setOpaque(false);
        eligeNombre.setLayout(null);
        eligeNombre.setBackground(Color.white); //cambia color fondo jlabel 
        eligeNombre.setFont(new Font("century gothic", 1, 35));
        //caballeroText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        eligeNombre.setForeground(Color.white);

        nombrePersonaje.setLayout(null);
        crearPersonaje.add(nombrePersonaje);
        nombrePersonaje.setBounds(325, 320, 300, 50);
        nombrePersonaje.setHorizontalAlignment(JTextField.CENTER);
        nombrePersonaje.setOpaque(true);
        nombrePersonaje.setLayout(null);

        nombrePersonaje.setBackground(new Color(93, 105, 100)); //cambia color fondo jlabel 
        nombrePersonaje.setFont(new Font("century gothic", 1, 36));
        nombrePersonaje.setBorder(BorderFactory.createLineBorder(new Color(93, 105, 100)));
        nombrePersonaje.setForeground(Color.white);

        crear.setLayout(null);
        crearPersonaje.add(crear);
        crear.setBounds(325, 420, 150, 40);
        crear.setOpaque(true);
        crear.setLayout(null);
        crear.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        crear.setFont(new Font("century gothic", 1, 30));
        //caballeroText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        crear.setForeground(new Color(19, 16, 16));

        crear.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK      

                crear.setBackground(new Color(83, 95, 90));
                crear.setForeground(new Color(19, 16, 16));

            }
        });
        crear.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     
                if (!("".equals(nombrePersonaje.getText()) || nombrePersonaje.getText() == null || personaje == 0)) {
                    crear.setBackground(new Color(113, 125, 120));
                    crear.setForeground(new Color(29, 26, 26));
                }
            }
        });
        crear.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     
                if (!("".equals(nombrePersonaje.getText()) || nombrePersonaje.getText() == null || personaje == 0)) {
                    File file1 = new File("C:\\user", "Personaje1.txt");
                    File file2 = new File("C:\\user", "Personaje2.txt");
                    File file3 = new File("C:\\user", "Personaje3.txt");
                    if (file1.exists() && file2.exists() && file3.exists()) {
                        if (file1.exists()) {
                            archivo.cargarPersonaje(1);
                            nombre1A.setText(archivo.nombre);
                            personaje(archivo.personaje, personaje1A);
                        } else {
                            nombre1A.setText("");
                            personaje1A.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                        }
                        if (file2.exists()) {
                            archivo.cargarPersonaje(2);
                            nombre2A.setText(archivo.nombre);
                            personaje(archivo.personaje, personaje2A);
                        } else {
                            nombre2A.setText("");
                            personaje2A.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                        }
                        if (file3.exists()) {
                            archivo.cargarPersonaje(3);
                            nombre3A.setText(archivo.nombre);
                            personaje(archivo.personaje, personaje3A);
                        } else {
                            nombre3A.setText("");
                            personaje3A.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                        }
                        continuarPartidaA.setVisible(true);
                        crearPersonaje.setVisible(false);
                    } else {
                        String np = nombrePersonaje.getText();
                        archivo.ElegirJugador(personaje, np);
                        gestionPlayer.tipoPersonaje(personaje);
                        game.arma.cambioArma();
                        player.nombre = np;
                        dinero2.setText("" + player.dinero);
                        game.iniciar();
                        crearPersonaje.setVisible(false);
                    }
                }
            }
        });

        pausa1.setLayout(null);
        pausa.add(pausa1);
        pausa1.setBounds(0, 0, 32, 32);
        pausa1.setOpaque(true);
        pausa1.setLayout(null);
        pausa1.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        pausa1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseClicked(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     

                menuPausa.setVisible(true);
                game.detener();
                archivo.ActualizarDatos2();
            }
        });

        xSalir.setLayout(null);
        menuPausa.add(xSalir);
        xSalir.setBounds(748, 20, 32, 32);
        xSalir.setOpaque(true);
        xSalir.setLayout(null);
        xSalir.setBackground(new Color(83, 95, 90)); //cambia color fondo jlabel 
        xSalir.setFont(new Font("century gothic", 1, 30));
        //caballeroText.setBorder(BorderFactory.createLineBorder(Color.black)); 
        xSalir.setForeground(new Color(200, 200, 200));
        xSalir.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseClicked(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK     

                game.iniciar();
                menuPausa.setVisible(false);
                archivo.ActualizarDatos2();
            }
        });

        continuarPausa.setLayout(null);
        menuPausa.add(continuarPausa);
        continuarPausa.setFont(new Font("century gothic", 1, 30));
        continuarPausa.setBorder(BorderFactory.createLineBorder(Color.black));
        continuarPausa.setBounds(250, 230, 300, 60);
        continuarPausa.setOpaque(true);
        continuarPausa.setLayout(null);
        continuarPausa.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        continuarPausa.setForeground(Color.white);
        continuarPausa.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                continuarPausa.setBackground(new Color(175, 58, 19));
                continuarPausa.setForeground(new Color(210, 210, 210));
            }
        });
        continuarPausa.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                continuarPausa.setBackground(new Color(223, 70, 18));
                continuarPausa.setForeground(Color.white);
            }
        });
        continuarPausa.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                game.iniciar();
                menuPausa.setVisible(false);
                archivo.ActualizarDatos2();
            }
        });

        irAlLobby.setLayout(null);
        menuPausa.add(irAlLobby);
        irAlLobby.setFont(new Font("century gothic", 1, 30));
        irAlLobby.setBorder(BorderFactory.createLineBorder(Color.black));
        irAlLobby.setBounds(250, 310, 300, 60);
        irAlLobby.setOpaque(true);
        irAlLobby.setLayout(null);
        irAlLobby.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        irAlLobby.setForeground(Color.white);
        irAlLobby.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                irAlLobby.setBackground(new Color(175, 58, 19));
                irAlLobby.setForeground(new Color(210, 210, 210));
            }
        });
        irAlLobby.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                irAlLobby.setBackground(new Color(223, 70, 18));
                irAlLobby.setForeground(Color.white);
            }
        });
        irAlLobby.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                archivo.ActualizarDatos2();
                game.mapa.lobby(200, 200, player);
                player.vida = 10000;
                game.mapas.nivel = 0;
                game.iniciar();
                menuPausa.setVisible(false);
                game.enemigos[0].eliminado = true;

                game.enemigos[1].eliminado = true;

                game.enemigos[2].eliminado = true;

                game.enemigos[3].eliminado = true;

                game.enemigos[4].eliminado = true;

                game.enemigos[5].eliminado = true;
                player.contador=0;
            }
        });

        volverALMenu.setLayout(null);
        menuPausa.add(volverALMenu);
        volverALMenu.setFont(new Font("century gothic", 1, 30));
        volverALMenu.setBorder(BorderFactory.createLineBorder(Color.black));
        volverALMenu.setBounds(250, 390, 300, 60);
        volverALMenu.setOpaque(true);
        volverALMenu.setLayout(null);
        volverALMenu.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        volverALMenu.setForeground(Color.white);
        volverALMenu.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseEntered(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                volverALMenu.setBackground(new Color(175, 58, 19));
                volverALMenu.setForeground(new Color(210, 210, 210));
            }
        });
        volverALMenu.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mouseExited(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK

                volverALMenu.setBackground(new Color(223, 70, 18));
                volverALMenu.setForeground(Color.white);
            }
        });
        volverALMenu.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK
                salirAlMenu();
                menuPausa.setVisible(false);
                archivo.ActualizarDatos2();
            }
        });
        /////////
        /*salircontinuarPartida = new JLabel();
        personaje1 = new JLabel();
        personaje2 = new JLabel();
        personaje3 = new JLabel();
        nombre1 = new JLabel();
        nombre2 = new JLabel();
        nombre3 = new JLabel();
        borrar1 = new JLabel();
        borrar2 = new JLabel();
        borrar3 = new JLabel();*/

        personaje1.setLayout(null);
        continuarPartida.add(personaje1);
        personaje1.setFont(new Font("century gothic", 1, 30));
        personaje1.setBorder(BorderFactory.createLineBorder(Color.black));
        personaje1.setBounds(200, 200, 77, 77);
        personaje1.setOpaque(false);
        personaje1.setLayout(null);
        personaje1.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        personaje1.setForeground(Color.white);
        personaje1.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
        personaje1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                File file1 = new File("C:\\user", "Personaje1.txt");
                if (file1.exists()) {

                    archivo.cargarPersonajeJuego(1);

                    continuarPartida.setVisible(false);
                    game.gestionPlayer.tipoPersonaje(player.trajeActual);
                    game.arma.cambioArma();
                    game.mapa.lobby(200, 200, player);
                    player.vida = 10000;
                    game.mapas.nivel = 0;

                    menuPausa.setVisible(false);
                    game.enemigos[0].eliminado = true;

                    game.enemigos[1].eliminado = true;

                    game.enemigos[2].eliminado = true;

                    game.enemigos[3].eliminado = true;

                    game.enemigos[4].eliminado = true;

                    game.enemigos[5].eliminado = true;
                    dinero2.setText("" + player.dinero);
                    game.iniciar();
                }
            }
        });

        personaje2.setLayout(null);
        continuarPartida.add(personaje2);
        personaje2.setFont(new Font("century gothic", 1, 30));
        personaje2.setBorder(BorderFactory.createLineBorder(Color.black));
        personaje2.setBounds(200, 300, 77, 77);
        personaje2.setOpaque(false);
        personaje2.setLayout(null);
        personaje2.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        personaje2.setForeground(Color.white);
        personaje2.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
        personaje2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                File file1 = new File("C:\\user", "Personaje2.txt");
                if (file1.exists()) {
                    archivo.cargarPersonajeJuego(2);

                    continuarPartida.setVisible(false);
                    game.gestionPlayer.tipoPersonaje(player.trajeActual);
                    game.arma.cambioArma();
                    game.mapa.lobby(200, 200, player);
                    player.vida = 10000;
                    game.mapas.nivel = 0;

                    menuPausa.setVisible(false);
                    game.enemigos[0].eliminado = true;

                    game.enemigos[1].eliminado = true;

                    game.enemigos[2].eliminado = true;

                    game.enemigos[3].eliminado = true;

                    game.enemigos[4].eliminado = true;

                    game.enemigos[5].eliminado = true;
                    dinero2.setText("" + player.dinero);
                    game.iniciar();
                }
            }
        });

        personaje3.setLayout(null);
        continuarPartida.add(personaje3);
        personaje3.setFont(new Font("century gothic", 1, 30));
        personaje3.setBorder(BorderFactory.createLineBorder(Color.black));
        personaje3.setBounds(200, 400, 77, 77);
        personaje3.setOpaque(false);
        personaje3.setLayout(null);
        personaje3.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        personaje3.setForeground(Color.white);
        personaje3.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
        personaje3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                File file1 = new File("C:\\user", "Personaje1.txt");
                if (file1.exists()) {
                    archivo.cargarPersonajeJuego(3);

                    continuarPartida.setVisible(false);
                    game.gestionPlayer.tipoPersonaje(player.trajeActual);
                    game.arma.cambioArma();
                    game.mapa.lobby(200, 200, player);
                    player.vida = 10000;
                    game.mapas.nivel = 0;

                    menuPausa.setVisible(false);
                    game.enemigos[0].eliminado = true;

                    game.enemigos[1].eliminado = true;

                    game.enemigos[2].eliminado = true;

                    game.enemigos[3].eliminado = true;

                    game.enemigos[4].eliminado = true;

                    game.enemigos[5].eliminado = true;
                    dinero2.setText("" + player.dinero);
                    game.iniciar();
                }
            }
        });

        nombre1.setLayout(null);
        continuarPartida.add(nombre1);
        nombre1.setFont(new Font("century gothic", 1, 30));
        nombre1.setBorder(BorderFactory.createLineBorder(Color.black));
        nombre1.setBounds(277, 200, 277, 77);
        nombre1.setOpaque(true);
        nombre1.setLayout(null);
        nombre1.setBackground(new Color(19, 16, 16)); //cambia color fondo jlabel
        nombre1.setForeground(new Color(187, 208, 231));

        nombre1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                File file1 = new File("C:\\user", "Personaje1.txt");
                if (file1.exists()) {

                    archivo.cargarPersonajeJuego(1);

                    continuarPartida.setVisible(false);
                    game.gestionPlayer.tipoPersonaje(player.trajeActual);
                    game.arma.cambioArma();
                    game.mapa.lobby(200, 200, player);
                    player.vida = 10000;
                    game.mapas.nivel = 0;

                    menuPausa.setVisible(false);
                    game.enemigos[0].eliminado = true;

                    game.enemigos[1].eliminado = true;

                    game.enemigos[2].eliminado = true;

                    game.enemigos[3].eliminado = true;

                    game.enemigos[4].eliminado = true;

                    game.enemigos[5].eliminado = true;
                    dinero2.setText("" + player.dinero);
                    game.iniciar();
                }
            }
        });

        nombre2.setLayout(null);
        continuarPartida.add(nombre2);
        nombre2.setFont(new Font("century gothic", 1, 30));
        nombre2.setBorder(BorderFactory.createLineBorder(Color.black));
        nombre2.setBounds(277, 300, 277, 77);
        nombre2.setOpaque(true);
        nombre2.setLayout(null);
        nombre2.setBackground(new Color(19, 16, 16)); //cambia color fondo jlabel
        nombre2.setForeground(new Color(187, 208, 231));

        nombre2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                File file1 = new File("C:\\user", "Personaje2.txt");
                if (file1.exists()) {
                    archivo.cargarPersonajeJuego(2);

                    continuarPartida.setVisible(false);
                    game.gestionPlayer.tipoPersonaje(player.trajeActual);
                    game.arma.cambioArma();
                    game.mapa.lobby(200, 200, player);
                    player.vida = 10000;
                    game.mapas.nivel = 0;

                    menuPausa.setVisible(false);
                    game.enemigos[0].eliminado = true;

                    game.enemigos[1].eliminado = true;

                    game.enemigos[2].eliminado = true;

                    game.enemigos[3].eliminado = true;

                    game.enemigos[4].eliminado = true;

                    game.enemigos[5].eliminado = true;
                    dinero2.setText("" + player.dinero);
                    game.iniciar();
                }
            }
        });

        nombre3.setLayout(null);
        continuarPartida.add(nombre3);
        nombre3.setFont(new Font("century gothic", 1, 30));
        nombre3.setBorder(BorderFactory.createLineBorder(Color.black));
        nombre3.setBounds(277, 400, 277, 77);
        nombre3.setOpaque(true);
        nombre3.setLayout(null);
        nombre3.setBackground(new Color(19, 16, 16)); //cambia color fondo jlabel
        nombre3.setForeground(new Color(187, 208, 231));

        nombre3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                File file1 = new File("C:\\user", "Personaje1.txt");
                if (file1.exists()) {
                    archivo.cargarPersonajeJuego(3);

                    continuarPartida.setVisible(false);
                    game.gestionPlayer.tipoPersonaje(player.trajeActual);
                    game.arma.cambioArma();
                    game.mapa.lobby(200, 200, player);
                    player.vida = 10000;
                    game.mapas.nivel = 0;

                    menuPausa.setVisible(false);
                    game.enemigos[0].eliminado = true;

                    game.enemigos[1].eliminado = true;

                    game.enemigos[2].eliminado = true;

                    game.enemigos[3].eliminado = true;

                    game.enemigos[4].eliminado = true;

                    game.enemigos[5].eliminado = true;
                    dinero2.setText("" + player.dinero);
                    game.iniciar();
                }
            }
        });

        salircontinuarPartida.setLayout(null);
        continuarPartida.add(salircontinuarPartida);
        salircontinuarPartida.setBounds(10, 10, 50, 32);
        salircontinuarPartida.setOpaque(false);
        salircontinuarPartida.setLayout(null);
        salircontinuarPartida.setBackground(Color.white); //cambia color fondo jlabel
        salircontinuarPartida.setIcon(new ImageIcon(getClass().getResource("/recursos/salir.png")));

        salircontinuarPartida.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                Menu.setVisible(true);
                continuarPartida.setVisible(false);
            }
        });

        borrar1.setLayout(null);
        continuarPartida.add(borrar1);
        borrar1.setFont(new Font("century gothic", 1, 30));
        borrar1.setBorder(BorderFactory.createLineBorder(Color.black));
        borrar1.setBounds(554, 200, 77, 77);
        borrar1.setOpaque(false);
        borrar1.setLayout(null);
        borrar1.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        borrar1.setForeground(Color.white);
        borrar1.setIcon(new ImageIcon(getClass().getResource("/recursos/basura.png")));
        borrar1.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                archivo.EliminarPersonaje1();
                File file1 = new File("C:\\user", "Personaje1.txt");
                File file2 = new File("C:\\user", "Personaje2.txt");
                File file3 = new File("C:\\user", "Personaje3.txt");
                if (file1.exists()) {
                    archivo.cargarPersonaje(1);
                    nombre1.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje1);
                } else {
                    nombre1.setText("");
                    personaje1.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file2.exists()) {
                    archivo.cargarPersonaje(2);
                    nombre2.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje2);
                } else {
                    nombre2.setText("");
                    personaje2.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file3.exists()) {
                    archivo.cargarPersonaje(3);
                    nombre3.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje3);
                } else {
                    nombre3.setText("");
                    personaje3.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
            }
        });

        borrar2.setLayout(null);
        continuarPartida.add(borrar2);
        borrar2.setFont(new Font("century gothic", 1, 30));
        borrar2.setBorder(BorderFactory.createLineBorder(Color.black));
        borrar2.setBounds(554, 300, 77, 77);
        borrar2.setOpaque(false);
        borrar2.setLayout(null);
        borrar2.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        borrar2.setForeground(Color.white);
        borrar2.setIcon(new ImageIcon(getClass().getResource("/recursos/basura.png")));
        borrar2.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                archivo.EliminarPersonaje2();
                File file1 = new File("C:\\user", "Personaje1.txt");
                File file2 = new File("C:\\user", "Personaje2.txt");
                File file3 = new File("C:\\user", "Personaje3.txt");
                if (file1.exists()) {
                    archivo.cargarPersonaje(1);
                    nombre1.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje1);
                } else {
                    nombre1.setText("");
                    personaje1.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file2.exists()) {
                    archivo.cargarPersonaje(2);
                    nombre2.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje2);
                } else {
                    nombre2.setText("");
                    personaje2.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file3.exists()) {
                    archivo.cargarPersonaje(3);
                    nombre3.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje3);
                } else {
                    nombre3.setText("");
                    personaje3.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
            }
        });

        borrar3.setLayout(null);
        continuarPartida.add(borrar3);
        borrar3.setFont(new Font("century gothic", 1, 30));
        borrar3.setBorder(BorderFactory.createLineBorder(Color.black));
        borrar3.setBounds(554, 400, 77, 77);
        borrar3.setOpaque(false);
        borrar3.setLayout(null);
        borrar3.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        borrar3.setForeground(Color.white);
        borrar3.setIcon(new ImageIcon(getClass().getResource("/recursos/basura.png")));
        borrar3.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                archivo.EliminarPersonaje3();
                File file1 = new File("C:\\user", "Personaje1.txt");
                File file2 = new File("C:\\user", "Personaje2.txt");
                File file3 = new File("C:\\user", "Personaje3.txt");
                if (file1.exists()) {
                    archivo.cargarPersonaje(1);
                    nombre1.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje1);
                } else {
                    nombre1.setText("");
                    personaje1.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file2.exists()) {
                    archivo.cargarPersonaje(2);
                    nombre2.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje2);
                } else {
                    nombre2.setText("");
                    personaje2.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
                if (file3.exists()) {
                    archivo.cargarPersonaje(3);
                    nombre3.setText(archivo.nombre);
                    personaje(archivo.personaje, personaje3);
                } else {
                    nombre3.setText("");
                    personaje3.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));
                }
            }
        });

        personaje1A.setLayout(null);
        continuarPartidaA.add(personaje1A);
        personaje1A.setFont(new Font("century gothic", 1, 30));
        personaje1A.setBorder(BorderFactory.createLineBorder(Color.black));
        personaje1A.setBounds(200, 200, 77, 77);
        personaje1A.setOpaque(false);
        personaje1A.setLayout(null);
        personaje1A.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        personaje1A.setForeground(Color.white);
        personaje1A.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));

        personaje2A.setLayout(null);
        continuarPartidaA.add(personaje2A);
        personaje2A.setFont(new Font("century gothic", 1, 30));
        personaje2A.setBorder(BorderFactory.createLineBorder(Color.black));
        personaje2A.setBounds(200, 300, 77, 77);
        personaje2A.setOpaque(false);
        personaje2A.setLayout(null);
        personaje2A.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        personaje2A.setForeground(Color.white);
        personaje2A.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));

        personaje3A.setLayout(null);
        continuarPartidaA.add(personaje3A);
        personaje3A.setFont(new Font("century gothic", 1, 30));
        personaje3A.setBorder(BorderFactory.createLineBorder(Color.black));
        personaje3A.setBounds(200, 400, 77, 77);
        personaje3A.setOpaque(false);
        personaje3A.setLayout(null);
        personaje3A.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        personaje3A.setForeground(Color.white);
        personaje3A.setIcon(new ImageIcon(getClass().getResource("/recursos/miniCuadro.png")));

        nombre1A.setLayout(null);
        continuarPartidaA.add(nombre1A);
        nombre1A.setFont(new Font("century gothic", 1, 30));
        nombre1A.setBorder(BorderFactory.createLineBorder(Color.black));
        nombre1A.setBounds(277, 200, 277, 77);
        nombre1A.setOpaque(true);
        nombre1A.setLayout(null);
        nombre1A.setBackground(new Color(19, 16, 16)); //cambia color fondo jlabel
        nombre1A.setForeground(new Color(187, 208, 231));

        nombre2A.setLayout(null);
        continuarPartidaA.add(nombre2A);
        nombre2A.setFont(new Font("century gothic", 1, 30));
        nombre2A.setBorder(BorderFactory.createLineBorder(Color.black));
        nombre2A.setBounds(277, 300, 277, 77);
        nombre2A.setOpaque(true);
        nombre2A.setLayout(null);
        nombre2A.setBackground(new Color(19, 16, 16)); //cambia color fondo jlabel
        nombre2A.setForeground(new Color(187, 208, 231));

        nombre3A.setLayout(null);
        continuarPartidaA.add(nombre3A);
        nombre3A.setFont(new Font("century gothic", 1, 30));
        nombre3A.setBorder(BorderFactory.createLineBorder(Color.black));
        nombre3A.setBounds(277, 400, 277, 77);
        nombre3A.setOpaque(true);
        nombre3A.setLayout(null);
        nombre3A.setBackground(new Color(19, 16, 16)); //cambia color fondo jlabel
        nombre3A.setForeground(new Color(187, 208, 231));

        salircontinuarPartidaA.setLayout(null);
        continuarPartidaA.add(salircontinuarPartidaA);
        salircontinuarPartidaA.setBounds(10, 10, 50, 32);
        salircontinuarPartidaA.setOpaque(false);
        salircontinuarPartidaA.setLayout(null);
        salircontinuarPartidaA.setBackground(Color.white); //cambia color fondo jlabel
        salircontinuarPartidaA.setIcon(new ImageIcon(getClass().getResource("/recursos/salir.png")));

        salircontinuarPartidaA.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                crearPersonaje.setVisible(true);
                continuarPartidaA.setVisible(false);

            }
        });

        borrar1A.setLayout(null);
        continuarPartidaA.add(borrar1A);
        borrar1A.setFont(new Font("century gothic", 1, 30));
        borrar1A.setBorder(BorderFactory.createLineBorder(Color.black));
        borrar1A.setBounds(554, 200, 77, 77);
        borrar1A.setOpaque(false);
        borrar1A.setLayout(null);
        borrar1A.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        borrar1A.setForeground(Color.white);
        borrar1A.setIcon(new ImageIcon(getClass().getResource("/recursos/basura.png")));
        borrar1A.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                archivo.EliminarPersonaje1();
                String np = nombrePersonaje.getText();
                archivo.ElegirJugador(personaje, np);
                gestionPlayer.tipoPersonaje(personaje);
                game.arma.cambioArma();
                player.nombre = np;
                dinero2.setText("" + player.dinero);
                game.iniciar();
                continuarPartidaA.setVisible(false);

            }
        });

        borrar2A.setLayout(null);
        continuarPartidaA.add(borrar2A);
        borrar2A.setFont(new Font("century gothic", 1, 30));
        borrar2A.setBorder(BorderFactory.createLineBorder(Color.black));
        borrar2A.setBounds(554, 300, 77, 77);
        borrar2A.setOpaque(false);
        borrar2A.setLayout(null);
        borrar2A.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        borrar2A.setForeground(Color.white);
        borrar2A.setIcon(new ImageIcon(getClass().getResource("/recursos/basura.png")));
        borrar2A.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                archivo.EliminarPersonaje2();
                String np = nombrePersonaje.getText();
                archivo.ElegirJugador(personaje, np);
                gestionPlayer.tipoPersonaje(personaje);
                game.arma.cambioArma();
                player.nombre = np;
                dinero2.setText("" + player.dinero);
                game.iniciar();
                continuarPartidaA.setVisible(false);
            }
        });

        borrar3A.setLayout(null);
        continuarPartidaA.add(borrar3A);
        borrar3A.setFont(new Font("century gothic", 1, 30));
        borrar3A.setBorder(BorderFactory.createLineBorder(Color.black));
        borrar3A.setBounds(554, 400, 77, 77);
        borrar3A.setOpaque(false);
        borrar3A.setLayout(null);
        borrar3A.setBackground(new Color(223, 70, 18)); //cambia color fondo jlabel
        borrar3A.setForeground(Color.white);
        borrar3A.setIcon(new ImageIcon(getClass().getResource("/recursos/basura.png")));
        borrar3A.addMouseListener(new MouseAdapter() { //CREO CONSTRUCTOR CONSULTA LABEL
            @Override
            public void mousePressed(MouseEvent e) {  //PARA PODER ACCIONAR EL CLICK  
                archivo.EliminarPersonaje3();
                String np = nombrePersonaje.getText();
                archivo.ElegirJugador(personaje, np);
                gestionPlayer.tipoPersonaje(personaje);
                game.arma.cambioArma();
                player.nombre = np;
                dinero2.setText("" + player.dinero);
                game.iniciar();
                continuarPartidaA.setVisible(false);
            }
        });
        titulo.setVisible(true);
        Menu.setVisible(true);
    }

    private void salirAlMenu() {
        personaje = 0;
        nombrePersonaje.setText("");
        mago.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeMago1.png")));
        caballero.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeCaballero1.png")));
        bestia.setIcon(new ImageIcon(getClass().getResource("/recursos/eligeBestia1.png")));
        Menu.setVisible(true);
    }

    public void inventarioActivar() {
        trajes2();
        inventario.setVisible(true);
        pausa.setVisible(false);

    }

    public void tiendaActivar() {
        trajesTienda();
        armasTienda();
        tienda.setVisible(true);
        pausa.setVisible(false);

    }

    private void trajes() {
        if (player.trajes[0] == true) {
            trajeCaballero1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1.png")));
        } else {
            trajeCaballero1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1_1.png")));
        }
        if (player.trajes[1] == true) {
            trajeMago1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1.png")));
        } else {
            trajeMago1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1_1.png")));
        }
        if (player.trajes[2] == true) {
            trajeBestia1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1.png")));
        } else {
            trajeBestia1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1_1.png")));
        }
        if (player.trajes[3] == true) {
            trajeCaballero2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2.png")));
        } else {
            trajeCaballero2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2_1.png")));
        }
        if (player.trajes[4] == true) {
            trajeMago2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2.png")));
        } else {
            trajeMago2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2_1.png")));
        }
        if (player.trajes[5] == true) {
            trajeBestia2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2.png")));
        } else {
            trajeBestia2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2_1.png")));
        }
        if (player.trajes[6] == true) {
            trajeCaballero3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3.png")));
        } else {
            trajeCaballero3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3_1.png")));
        }
        if (player.trajes[7] == true) {
            trajeMago3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3.png")));
        } else {
            trajeMago3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3_1.png")));
        }
        if (player.trajes[8] == true) {
            trajeBestia3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3.png")));
        } else {
            trajeBestia3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3_1.png")));
        }
    }

    private void trajes2() {
        trajes();
        switch (player.trajeActual) {
            case 1:
                trajeCaballero1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1_2.png")));
                break;
            case 2:
                trajeMago1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1_2.png")));
                break;
            case 3:
                trajeBestia1.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1_2.png")));
                break;
            case 4:
                trajeCaballero2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2_2.png")));
                break;
            case 5:
                trajeMago2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2_2.png")));
                break;
            case 6:
                trajeBestia2.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2_2.png")));
                break;
            case 7:
                trajeCaballero3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3_2.png")));
                break;
            case 8:
                trajeMago3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3_2.png")));
                break;
            case 9:
                trajeBestia3.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3_2.png")));
                break;
        }
    }

    private void trajesTienda() {
        if (player.trajes[0] == false) {
            trajeCaballero1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1_4.png")));
        } else {
            trajeCaballero1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1_1.png")));
        }
        if (player.trajes[1] == false) {
            trajeMago1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1_4.png")));
        } else {
            trajeMago1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1_1.png")));
        }
        if (player.trajes[2] == false) {
            trajeBestia1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1_4.png")));
        } else {
            trajeBestia1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1_1.png")));
        }
        if (player.trajes[3] == false) {
            trajeCaballero2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2_4.png")));
        } else {
            trajeCaballero2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2_1.png")));
        }
        if (player.trajes[4] == false) {
            trajeMago2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2_4.png")));
        } else {
            trajeMago2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2_1.png")));
        }
        if (player.trajes[5] == false) {
            trajeBestia2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2_4.png")));
        } else {
            trajeBestia2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2_1.png")));
        }
        if (player.trajes[6] == false) {
            trajeCaballero3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3_4.png")));
        } else {
            trajeCaballero3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3_1.png")));
        }
        if (player.trajes[7] == false) {
            trajeMago3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3_4.png")));
        } else {
            trajeMago3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3_1.png")));
        }
        if (player.trajes[8] == false) {
            trajeBestia3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3_4.png")));
        } else {
            trajeBestia3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3_1.png")));
        }
    }

    private void ordenArmas() {
        int[] ordenX = new int[]{130, 282, 438, 590, 130, 282, 438, 590, 130, 282, 438, 590};
        int[] ordenY = new int[]{190, 190, 190, 190, 300, 300, 300, 300, 410, 410, 410, 410};
        int n = 0;
        if (player.armas[0] == true && player.porteArmas[0] != 1 && player.porteArmas[1] != 1 && player.porteArmas[2] != 1) {
            arma1.setLayout(null);
            armas.add(arma1);
            arma1.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma1.setOpaque(true);
            arma1.setLayout(null);
            arma1.setBackground(Color.white); //cambia color fondo jlabel
            arma1.setVisible(true);
            arma1.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b1.png")));
            n++;
        } else {
            arma1.setVisible(false);
        }
        if (player.armas[1] == true && player.porteArmas[0] != 2 && player.porteArmas[1] != 2 && player.porteArmas[2] != 2) {
            arma2.setLayout(null);
            armas.add(arma2);
            arma2.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma2.setOpaque(true);
            arma2.setLayout(null);
            arma2.setBackground(Color.blue); //cambia color fondo jlabel
            arma2.setVisible(true);
            arma2.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b1.png")));
            n++;
        } else {
            arma2.setVisible(false);
        }
        if (player.armas[2] == true && player.porteArmas[0] != 3 && player.porteArmas[1] != 3 && player.porteArmas[2] != 3) {
            arma3.setLayout(null);
            armas.add(arma3);
            arma3.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma3.setOpaque(true);
            arma3.setLayout(null);
            arma3.setBackground(Color.red); //cambia color fondo jlabel
            arma3.setVisible(true);
            arma3.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b1.png")));
            n++;
        } else {
            arma3.setVisible(false);
        }
        if (player.armas[3] == true && player.porteArmas[0] != 4 && player.porteArmas[1] != 4 && player.porteArmas[2] != 4) {
            arma4.setLayout(null);
            armas.add(arma4);
            arma4.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma4.setOpaque(true);
            arma4.setLayout(null);
            arma4.setBackground(Color.black); //cambia color fondo jlabel
            arma4.setVisible(true);
            arma4.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b1.png")));
            n++;
        } else {
            arma4.setVisible(false);
        }
        if (player.armas[4] == true && player.porteArmas[0] != 5 && player.porteArmas[1] != 5 && player.porteArmas[2] != 5) {
            arma5.setLayout(null);
            armas.add(arma5);
            arma5.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma5.setOpaque(true);
            arma5.setLayout(null);
            arma5.setBackground(Color.green); //cambia color fondo jlabel
            arma5.setVisible(true);
            arma5.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b1.png")));
            n++;
        } else {
            arma5.setVisible(false);
        }
        if (player.armas[5] == true && player.porteArmas[0] != 6 && player.porteArmas[1] != 6 && player.porteArmas[2] != 6) {
            arma6.setLayout(null);
            armas.add(arma6);
            arma6.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma6.setOpaque(true);
            arma6.setLayout(null);
            arma6.setBackground(Color.orange); //cambia color fondo jlabel
            arma6.setVisible(true);
            arma6.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b1.png")));
            n++;
        } else {
            arma6.setVisible(false);
        }
        if (player.armas[6] == true && player.porteArmas[0] != 7 && player.porteArmas[1] != 7 && player.porteArmas[2] != 7) {
            arma7.setLayout(null);
            armas.add(arma7);
            arma7.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma7.setOpaque(true);
            arma7.setLayout(null);
            arma7.setBackground(Color.CYAN); //cambia color fondo jlabel
            arma7.setVisible(true);
            arma7.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b1.png")));
            n++;
        } else {
            arma7.setVisible(false);
        }
        if (player.armas[7] == true && player.porteArmas[0] != 8 && player.porteArmas[1] != 8 && player.porteArmas[2] != 8) {
            arma8.setLayout(null);
            armas.add(arma8);
            arma8.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma8.setOpaque(true);
            arma8.setLayout(null);
            arma8.setBackground(Color.GRAY); //cambia color fondo jlabel
            arma8.setVisible(true);
            arma8.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b1.png")));
            n++;
        } else {
            arma8.setVisible(false);
        }
        if (player.armas[8] == true && player.porteArmas[0] != 9 && player.porteArmas[1] != 9 && player.porteArmas[2] != 9) {
            arma9.setLayout(null);
            armas.add(arma9);
            arma9.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma9.setOpaque(true);
            arma9.setLayout(null);
            arma9.setBackground(Color.PINK); //cambia color fondo jlabel
            arma9.setVisible(true);
            arma9.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b1.png")));
            n++;
        } else {
            arma9.setVisible(false);
        }
        if (player.armas[9] == true && player.porteArmas[0] != 10 && player.porteArmas[1] != 10 && player.porteArmas[2] != 10) {
            arma10.setLayout(null);
            armas.add(arma10);
            arma10.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma10.setOpaque(true);
            arma10.setLayout(null);
            arma10.setBackground(Color.YELLOW); //cambia color fondo jlabel
            arma10.setVisible(true);
            arma10.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b1.png")));
            n++;
        } else {
            arma10.setVisible(false);
        }
        if (player.armas[10] == true && player.porteArmas[0] != 11 && player.porteArmas[1] != 11 && player.porteArmas[2] != 11) {
            arma11.setLayout(null);
            armas.add(arma11);
            arma11.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma11.setOpaque(true);
            arma11.setLayout(null);
            arma11.setBackground(Color.GRAY); //cambia color fondo jlabel
            arma11.setVisible(true);
            arma11.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b1.png")));
            n++;
        } else {
            arma11.setVisible(false);
        }
        if (player.armas[11] == true && player.porteArmas[0] != 12 && player.porteArmas[1] != 12 && player.porteArmas[2] != 12) {
            arma12.setLayout(null);
            armas.add(arma12);
            arma12.setBounds(ordenX[n], ordenY[n], 80, 80);
            arma12.setOpaque(true);
            arma12.setLayout(null);
            arma12.setBackground(Color.MAGENTA); //cambia color fondo jlabel
            arma12.setVisible(true);
            arma12.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b1.png")));
            n++;
        } else {
            arma12.setVisible(false);
        }
        armaSeleccionada = 0;
    }

    private void actualizarSeleccion() {
        switch (armaSeleccionada) {
            case 1:
                arma1.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b4.png")));
                break;
            case 2:
                arma2.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b4.png")));
                break;
            case 3:
                arma3.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b4.png")));
                break;
            case 4:
                arma4.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b4.png")));
                break;
            case 5:
                arma5.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b4.png")));
                break;
            case 6:
                arma6.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b4.png")));
                break;
            case 7:
                arma7.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b4.png")));
                break;
            case 8:
                arma8.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b4.png")));
                break;
            case 9:
                arma9.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b4.png")));
                break;
            case 10:
                arma10.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b4.png")));
                break;
            case 11:
                arma11.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b4.png")));
                break;
            case 12:
                arma12.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b4.png")));
                break;
        }
    }

    private void armasEnUso2() {
        armasEnUso1(player.porteArmas[0], armaActual1);
        armasEnUso1(player.porteArmas[1], armaActual2);
        armasEnUso1(player.porteArmas[2], armaActual3);
        armaSeleccionadaEnUso = 0;
    }

    private void armasEnUso4() {
        switch (armaSeleccionadaEnUso) {
            case 1:
                armasEnUso3(player.porteArmas[0], armaActual1);
                break;
            case 2:
                armasEnUso3(player.porteArmas[1], armaActual2);
                break;
            case 3:
                armasEnUso3(player.porteArmas[2], armaActual3);
                break;
        }
    }

    private void armasEnUso1(int n, JLabel arma) {
        switch (n) {
            case 1:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b2.png")));
                break;
            case 2:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b2.png")));
                break;
            case 3:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b2.png")));
                break;
            case 4:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b2.png")));
                break;
            case 5:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b2.png")));
                break;
            case 6:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b2.png")));
                break;
            case 7:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b2.png")));
                break;
            case 8:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b2.png")));
                break;
            case 9:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b2.png")));
                break;
            case 10:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b2.png")));
                break;
            case 11:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b2.png")));
                break;
            case 12:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b2.png")));
                break;
            default:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/armavacia2.png")));
        }
    }

    private void armasEnUso3(int n, JLabel arma) {
        switch (n) {
            case 1:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b3.png")));
                break;
            case 2:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b3.png")));
                break;
            case 3:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b3.png")));
                break;
            case 4:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b3.png")));
                break;
            case 5:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b3.png")));
                break;
            case 6:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b3.png")));
                break;
            case 7:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b3.png")));
                break;
            case 8:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b3.png")));
                break;
            case 9:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b3.png")));
                break;
            case 10:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b3.png")));
                break;
            case 11:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b3.png")));
                break;
            case 12:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b3.png")));
                break;
            default:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/armavacia2.png")));
        }

    }

    private void armasEnUso5(int n, JLabel arma) {
        switch (n) {
            case 1:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b1.png")));
                break;
            case 2:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b1.png")));
                break;
            case 3:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b1.png")));
                break;
            case 4:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b1.png")));
                break;
            case 5:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b1.png")));
                break;
            case 6:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b1.png")));
                break;
            case 7:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b1.png")));
                break;
            case 8:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b1.png")));
                break;
            case 9:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b1.png")));
                break;
            case 10:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b1.png")));
                break;
            case 11:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b1.png")));
                break;
            case 12:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b1.png")));
                break;
            default:
                arma.setIcon(new ImageIcon(getClass().getResource("/recursos/armavacia1.png")));
        }
    }

    public void tiendaTrajes(int n) {
        switch (n) {
            case 1:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero1.png")));
                break;
            case 2:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago1.png")));
                break;
            case 3:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia1.png")));
                break;
            case 4:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero2.png")));
                break;
            case 5:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago2.png")));
                break;
            case 6:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia2.png")));
                break;
            case 7:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonCaballero3.png")));
                break;
            case 8:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonMago3.png")));
                break;
            case 9:
                infoCompra.setIcon(new ImageIcon(getClass().getResource("/recursos/botonBestia3.png")));
                break;
        }
    }

    public void tiendaTrajes2(int n) {
        switch (n) {
            case 1:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b1.png")));
                break;
            case 2:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b1.png")));
                break;
            case 3:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b1.png")));
                break;
            case 4:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b1.png")));
                break;
            case 5:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b1.png")));
                break;
            case 6:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b1.png")));
                break;
            case 7:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b1.png")));
                break;
            case 8:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b1.png")));
                break;
            case 9:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b1.png")));
                break;
            case 10:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b1.png")));
                break;
            case 11:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b1.png")));
                break;
            case 12:
                infoCompra_2.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b1.png")));
                break;
        }
    }

    private void armasTienda() {
        if (player.armas[0] == false) {
            arma1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A1.png")));
        } else {
            arma1Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a1b5.png")));
        }
        if (player.armas[1] == false) {
            arma2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A2.png")));
        } else {
            arma2Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a2b5.png")));
        }
        if (player.armas[2] == false) {
            arma3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A3.png")));
        } else {
            arma3Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a3b5.png")));
        }
        if (player.armas[3] == false) {
            arma4Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A4.png")));
        } else {
            arma4Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a4b5.png")));
        }
        if (player.armas[4] == false) {
            arma5Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A5.png")));
        } else {
            arma5Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a5b5.png")));
        }
        if (player.armas[5] == false) {
            arma6Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A6.png")));
        } else {
            arma6Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a6b5.png")));
        }
        if (player.armas[6] == false) {
            arma7Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A7.png")));
        } else {
            arma7Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a7b5.png")));
        }
        if (player.armas[7] == false) {
            arma8Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A8.png")));
        } else {
            arma8Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a8b5.png")));
        }
        if (player.armas[8] == false) {
            arma9Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A9.png")));
        } else {
            arma9Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a9b5.png")));
        }
        if (player.armas[9] == false) {
            arma10Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A10.png")));
        } else {
            arma10Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a10b5.png")));
        }
        if (player.armas[10] == false) {
            arma11Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A11.png")));
        } else {
            arma11Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a11b5.png")));
        }
        if (player.armas[11] == false) {
            arma12Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/A12.png")));
        } else {
            arma12Tienda.setIcon(new ImageIcon(getClass().getResource("/recursos/a12b5.png")));
        }
    }
    public int armaSeleccionada = 0;
    public int armaSeleccionadaEnUso = 0;
    public int tipoSeleccionada;
}
