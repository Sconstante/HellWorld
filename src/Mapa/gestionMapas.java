package Mapa;

import Control.mouse;
import Control.teclado;
import Main.main;
import entes.criaturas.player;

public class gestionMapas {

    //Aqui va todo el orden del juego, osea la estructuracion de mapa a mapa
    public int nivel = 0;
    private player player;
    private mapaCargado mapa;
    private teclado tecla;
    private mouse raton;
    private main game;

    public gestionMapas(player player, mapaCargado mapa, teclado tecla, mouse raton, main game) {
        this.player = player;
        this.mapa = mapa;
        this.tecla = tecla;
        this.raton = raton;
        this.player.tipoPersonaje(8);
        this.game = game;
    }

    public void actualizar() {
        player.espacio = false;
        if (player.vida <= 0) {
            mapa.lobby(200, 200, player);
            player.vida = 10000;
            nivel = 0;
            game.enemigos[0].eliminado = true;

            game.enemigos[1].eliminado = true;

            game.enemigos[2].eliminado = true;

            game.enemigos[3].eliminado = true;

            game.enemigos[4].eliminado = true;

            game.enemigos[5].eliminado = true;
            player.contador = 0;
        }
        switch (nivel) {
            case 0:
                lobby();
                break;
            case 1:
                nivel_1();
                break;
            case 2:
                nivel_2();
                break;
        }
    }
// if ((player.obtenx() > 718) && (player.obtenx() < 846) && (player.obteny() > 132) && (player.obteny() < 260)) {

    public void lobby() {
        if ((player.obtenx() > 132) && (player.obtenx() < 430) && (player.obteny() > 356) && (player.obteny() < 676)) {
            if (tecla.ataque) {
                // mapa.cargarMapa1(96,250, player);
                // nivel=1;
                game.interfaz.inventarioActivar();
                game.funcionamiento = false;

            }
            player.espacio = true;
        }
        if ((player.obtenx() > 718) && (player.obtenx() < 846) && (player.obteny() > 132) && (player.obteny() < 260)) {
            if (tecla.ataque) {
                sw = false;
                mapa.cargarMapa1(64, 64, player);
                nivel = 1;
                game.enemigos[0].tipoEnemigo(1);
                game.enemigos[1].tipoEnemigo(1);
                game.enemigos[2].tipoEnemigo(1);
                game.enemigos[3].tipoEnemigo(1);
                game.enemigos[4].tipoEnemigo(1);
                game.enemigos[5].tipoEnemigo(1);
            }
            player.espacio = true;
        }
        if ((player.obtenx() > 174) && (player.obtenx() < 398) && (player.obteny() > 68) && (player.obteny() < 196)) {
            if (tecla.ataque) {
                // mapa.cargarMapa1(96,250, player);
                // nivel=1;
                game.interfaz.tiendaActivar();
                game.funcionamiento = false;

            }
            player.espacio = true;
        }
    }
    public boolean sw = false;

    public void nivel_1() {
        if (player.contador == 6) {
            mapa.nivel_1OFF();
        }
        if ((player.obtenx() > 174) && (player.obtenx() < 206) && (player.obteny() > 292) && (player.obteny() < 388) && sw == false) {
            mapa.nivel_1ON();
            sw = true;
            game.enemigos[0].eliminado = false;
            game.enemigos[0].x = (200);
            game.enemigos[0].y = (300);
            game.enemigos[0].vida = 1000;

            game.enemigos[1].eliminado = false;
            game.enemigos[1].x = 280;
            game.enemigos[1].y = 300;
            game.enemigos[1].vida = 1000;

            game.enemigos[2].eliminado = false;
            game.enemigos[2].x = (250);
            game.enemigos[2].y = (510);
            game.enemigos[2].vida = 1000;
            game.enemigos[3].eliminado = false;
            game.enemigos[3].x = (250);
            game.enemigos[3].y = (400);
            game.enemigos[3].vida = 1000;
            game.enemigos[4].eliminado = false;
            game.enemigos[4].x = (250);
            game.enemigos[4].y = (346);
            game.enemigos[4].vida = 1000;
            game.enemigos[5].eliminado = false;
            game.enemigos[5].x = (300);
            game.enemigos[5].y = (200);
            game.enemigos[5].vida = 1000;
        }
        if ((player.obtenx() > 292) && (player.obtenx() < 408) && (player.obteny() > 140) && (player.obteny() < 164) && sw == false) {
            mapa.nivel_1ON();
            sw = true;
            game.enemigos[0].eliminado = false;
            game.enemigos[0].x = (250);
            game.enemigos[0].y = (300);
            game.enemigos[0].vida = 1000;

            game.enemigos[1].eliminado = false;
            game.enemigos[1].x = 280;
            game.enemigos[1].y = 300;
            game.enemigos[1].vida = 1000;

            game.enemigos[2].eliminado = false;
            game.enemigos[2].x = (250);
            game.enemigos[2].y = (510);
            game.enemigos[2].vida = 1000;
            game.enemigos[3].eliminado = false;
            game.enemigos[3].x = (250);
            game.enemigos[3].y = (400);
            game.enemigos[3].vida = 1000;
            game.enemigos[4].eliminado = false;
            game.enemigos[4].x = (250);
            game.enemigos[4].y = (346);
            game.enemigos[4].vida = 1000;
            game.enemigos[5].eliminado = false;
            game.enemigos[5].x = (300);
            game.enemigos[5].y = (200);
            game.enemigos[5].vida = 1000;
        }
        if ((player.obtenx() > 366) && (player.obtenx() < 558) && (player.obteny() > 740) && (player.obteny() < 932)) {
            if (tecla.ataque) {
                game.enemigos[0].tipoEnemigo(3);
                game.enemigos[1].tipoEnemigo(3);
                game.enemigos[2].tipoEnemigo(3);
                game.enemigos[3].tipoEnemigo(3);
                game.enemigos[4].tipoEnemigo(3);
                game.enemigos[5].tipoEnemigo(3);
                sw = false;
                mapa.cargarMapa2(64, 64, player);
                nivel = 2;
                game.enemigos[0].eliminado = true;

                game.enemigos[1].eliminado = true;

                game.enemigos[2].eliminado = true;

                game.enemigos[3].eliminado = true;

                game.enemigos[4].eliminado = true;

                game.enemigos[5].eliminado = true;
                player.contador = 0;
            }
            player.espacio = true;
        }
    }

    public void nivel_2() {
        if (player.contador == 6) {
            mapa.nivel_2OFF();
            player.contador = 0;
            sw = false;
            game.enemigos[0].tipoEnemigo(4);
            game.enemigos[1].tipoEnemigo(4);
            game.enemigos[2].tipoEnemigo(4);
            game.enemigos[3].tipoEnemigo(4);
            game.enemigos[4].tipoEnemigo(4);
            game.enemigos[5].tipoEnemigo(4);
        }

        if ((player.obtenx() > 398 + 30) && (player.obtenx() < 398 + 62) && (player.obteny() > 4) && (player.obteny() < 100) && sw == false) {
            System.out.println("lol");
            mapa.nivel_2ON();
            sw = true;
            game.enemigos[0].eliminado = false;
            game.enemigos[0].x = (200 + 608);
            game.enemigos[0].y = (300);
            game.enemigos[0].vida = 1000;

            game.enemigos[1].eliminado = false;
            game.enemigos[1].x = 280 + 608;
            game.enemigos[1].y = 300;
            game.enemigos[1].vida = 1000;

            game.enemigos[2].eliminado = false;
            game.enemigos[2].x = (250 + 608);
            game.enemigos[2].y = (510);
            game.enemigos[2].vida = 1000;
            game.enemigos[3].eliminado = false;
            game.enemigos[3].x = (250 + 608);
            game.enemigos[3].y = (400);
            game.enemigos[3].vida = 1000;
            game.enemigos[4].eliminado = false;
            game.enemigos[4].x = (250 + 608);
            game.enemigos[4].y = (346);
            game.enemigos[4].vida = 1000;
            game.enemigos[5].eliminado = false;
            game.enemigos[5].x = (300 + 608);
            game.enemigos[5].y = (200);
            game.enemigos[5].vida = 1000;
        }
        if ((player.obtenx() > 142) && (player.obtenx() < 238) && (player.obteny() > 676 + 30) && (player.obteny() < 708 + 30) && sw == false) {
            System.out.println("lol");
            mapa.nivel_2ON();
            sw = true;
            game.enemigos[0].eliminado = false;
            game.enemigos[0].x = (64);
            game.enemigos[0].y = (730);
            game.enemigos[0].vida = 1000;

            game.enemigos[1].eliminado = false;
            game.enemigos[1].x = 75;
            game.enemigos[1].y = 900;
            game.enemigos[1].vida = 1000;

            game.enemigos[2].eliminado = false;
            game.enemigos[2].x = 200;
            game.enemigos[2].y = (850);
            game.enemigos[2].vida = 1000;
            game.enemigos[3].eliminado = false;
            game.enemigos[3].x = (100);
            game.enemigos[3].y = (820);
            game.enemigos[3].vida = 1000;
            game.enemigos[4].eliminado = false;
            game.enemigos[4].x = (120);
            game.enemigos[4].y = (946);
            game.enemigos[4].vida = 1000;
            game.enemigos[5].eliminado = false;
            game.enemigos[5].x = (73);
            game.enemigos[5].y = (750);
            game.enemigos[5].vida = 1000;
        }
    }

    public void nivel_3() {

    }

    public void nivel_4() {

    }

    public void nivel_5() {

    }

}
