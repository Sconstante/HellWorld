package Control;

import herramienta.cargaRecursos;
import java.awt.Canvas;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class mouse extends MouseAdapter {

    private Cursor cursor;
    private BufferedImage icono = cargaRecursos.cargarImagenCompatibleTranslucida("/recursos/click4.png");
    public Point posicion;
    private boolean click;
    private boolean press;
    public boolean release;

    public mouse(final Canvas sd) {
        Toolkit configuracion = Toolkit.getDefaultToolkit();

        Point punta = new Point(0, 0);

        this.cursor = configuracion.createCustomCursor(icono, punta, "perro");

        posicion = new Point();
        actualizarPosicion(sd);
        click = false;
        press = false;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (click == false) {
            click = true;
        }
    }

    public boolean obtenerClick() {
        return click;
    }
    public int tipoClick=0;
    public void reiniciarClick() {
        //System.out.println(release);
         release = false;
        if (sw == 1) {
            release = true;
            sw = 2;
        }

        if (click == true) {
            click = false;
        }
        if (press == false && sw==0) {
            sw = 1;
        }
    }
    private int sw = 2;

    @Override
    public void mouseReleased(MouseEvent e) {
        if (press == true) {
            press = false;
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (press == false) {
            press = true;
        }
        sw = 0;

    }

    public boolean obtenerPress() {
        return press;
    }

    public void reiniciarPress() {
        if (press == true) {
            press = false;
        }
    }

    public Cursor obtenerCursor() {
        return this.cursor;
    }

    private void actualizarPosicion(final Canvas sd) {
        final Point posicionInicial = MouseInfo.getPointerInfo().getLocation();

        SwingUtilities.convertPointFromScreen(posicionInicial, sd);

        posicion.setLocation(posicionInicial.getX(), posicionInicial.getY());

    }

    public void actualizar(final Canvas sd) {
        actualizarPosicion(sd);
        //System.out.println("Mouse "+posicion.getX()+","+posicion.getY());
    }
}
