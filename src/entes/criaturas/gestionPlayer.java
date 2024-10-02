package entes.criaturas;

import Control.mouse;
import Control.teclado;
import Mapa.Mapa;
import entes.armaCuerpo;
import graficos.Sprite;

public class gestionPlayer {

    private player player;
    private teclado teclado;
    private mouse raton;
    private Mapa mapa;
    private armaCuerpo arma;

    public gestionPlayer(Mapa mapa, teclado teclado, player player, mouse raton, armaCuerpo arma) {
        this.mapa = mapa;
        this.teclado = teclado;
        this.player = player;
        this.raton = raton;
        this.arma=arma;
    }
    public void tipoPersonaje(int n){
        player.tipoPersonaje(n);
        arma.tipoPersonaje(n);
    }
}
