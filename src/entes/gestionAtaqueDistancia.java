package entes;

import Control.mouse;
import Control.teclado;
import Mapa.Mapa;
import Mapa.mapaCargado;
import entes.criaturas.enemigo;
import entes.criaturas.player;
import graficos.Pantalla;
import graficos.Sprite;

public class gestionAtaqueDistancia {

    private player player;
    private teclado teclado;
    private mouse raton;
    private Mapa mapa;
    private enemigo enemigo[];
    public ataqueDistancia[] balas;
    private int tiempo;

    public gestionAtaqueDistancia(Mapa mapa, teclado teclado, player player, mouse raton, enemigo[] enemigo) {
        this.teclado = teclado;
        this.player = player;
        this.raton = raton;
        this.mapa = mapa;
        this.enemigo = enemigo;

        balas = new ataqueDistancia[r];
        for (int i = 0; i < r; i++) {
            balas[i] = new ataqueDistancia(mapa, teclado, player, raton, enemigo);
        }
    }
    public int uso = 0;
    public int r = 10;

    public void actualizar() {

        if (/*raton.release == true*/tiempo == 10) {
            uso++;
        }

        if (uso >= 0 && uso < r - 1) {
            for (int i = 0; i < uso + 1; i++) {
                balas[i].uso = false;
            }
        }
        if (uso >= 0) {
            if (uso == r - 3) {
                balas[0].uso = true;
            } else {
                balas[uso + 1].uso = true;
            }
            for (int i = 0; i < r; i++) {

                balas[i].actualizar();
            }
            //System.out.println(uso);

            if (uso == r - 2) {
                uso = 0;
            }

        }
        if (tiempo < 11) {
            tiempo++;
        } else {
            tiempo = 0;
        }
    }

    public void mostrar(Pantalla pantalla,Sprite sprite) {
        if (uso >= 0) {
            for (int i = 0; i < r; i++) {
                balas[i].mostrar(pantalla,sprite);
            }
        }

    }
}
