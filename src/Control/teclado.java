package Control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class teclado implements KeyListener {

    private final static int numeroTeclas = 120;
    private final boolean[] teclas = new boolean[numeroTeclas];
    public boolean clickD;

    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;
    public boolean ataque;
    public boolean arma1;
    public boolean arma2;
    public boolean arma3;

    public void actualizar() {
        arriba = teclas[KeyEvent.VK_W];

        abajo = teclas[KeyEvent.VK_S];

        izquierda = teclas[KeyEvent.VK_A];

        derecha = teclas[KeyEvent.VK_D];

        ataque = teclas[KeyEvent.VK_SPACE];
        
        arma1 = teclas[KeyEvent.VK_1];
        
        arma2 = teclas[KeyEvent.VK_2];
        
        arma3 = teclas[KeyEvent.VK_3];

    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclas[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}
