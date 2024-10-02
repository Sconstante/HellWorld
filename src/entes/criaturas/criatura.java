package entes.criaturas;

import entes.ente;
import graficos.Sprite;

public abstract class criatura extends ente {

    protected Sprite sprite;

    public boolean direccion = true;//true=derecha y false=izquierda

    protected boolean enMovimiento = false;

    @Override
    public void actualizar() {

    }

    @Override
    public void mostrar() {

    }

    public boolean obtenDireccion() {
        return direccion;
    }

    public void mover(int desx, int desy) {
        if (desx > 0) {
            this.direccion = true;
        }
        if (desx < 0) {
            this.direccion = false;
        }

        if (!estadoEli()) {
            if (!enColision(desx, 0)) {
                posicionx(desx);
            }
            if (!enColision(0, desy)) {
                posiciony(desy);
            }
        }

    }

    protected boolean enColision(int desx, int desy) {

        boolean colision = false;

        int posx = x + desx;
        int posy = y + desy;
        //Los margenes dependen de cada personaje o NPC
        int margenI = -36;
        int margenD = 50;

        int margenS = -10;
        int margenIn = 60;

        int bordeIzquierdo = (posx + margenD) / 32;
        int bordeDerecho = (posx + margenD + margenI) / 32;
        int bordeSuperior = (posy + margenIn) / 32;
        int bordeInferior = (posy + margenIn + margenS) / 32;

        if (mapa.obtenCuadro(bordeIzquierdo + (bordeSuperior) * mapa.obtenAncho()).esSolido()) {
            colision = true;
        }
        if (mapa.obtenCuadro((bordeIzquierdo - 1) + (bordeSuperior) * mapa.obtenAncho()).esSolido()) {
            colision = true;
        }
        if (mapa.obtenCuadro(bordeIzquierdo + bordeInferior * mapa.obtenAncho()).esSolido()) {
            colision = true;
        }
        if (mapa.obtenCuadro((bordeIzquierdo - 1) + bordeInferior * mapa.obtenAncho()).esSolido()) {
            colision = true;
        }
        if (mapa.obtenCuadro(bordeDerecho + bordeSuperior * mapa.obtenAncho()).esSolido()) {
            colision = true;
        }
        if (mapa.obtenCuadro(bordeDerecho + bordeInferior * mapa.obtenAncho()).esSolido()) {
            colision = true;
        }

        return colision;
    }

    public Sprite obtenSprite() {
        return this.sprite;
    }
}
