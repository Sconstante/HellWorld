package graficos;

import Control.mouse;
import Control.teclado;
import Mapa.Mapa;
import entes.criaturas.criatura;
import entes.criaturas.player;
import entes.ente;

public class MenuInferior {

    private player player;
    private teclado tecla;
    private mouse raton;
    private Mapa mapa;
    public Sprite sprite;
    private int x;
    private int y;
    private Pantalla pantalla;

    public MenuInferior(player player, Mapa mapa, mouse raton, teclado tecla, Sprite sprite, int x, int y, Pantalla pantalla) {

        this.player = player;
        this.mapa = mapa;
        this.raton = raton;
        this.tecla = tecla;
        this.sprite = sprite;
        this.x = x;
        this.y = y;
        this.pantalla = pantalla;
    }

    public void actualizar() {
        this.x = player.obtenx() - 400;
        this.y = player.obteny() + 224;

    }

    private void elije(int n, int xx, int yy, Pantalla pantalla) {
        switch (n) {
            case 0:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armasv);
                break;
            case 1:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas1);
                break;
            case 2:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas2);
                break;
            case 3:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas3);
                break;
            case 4:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas4);
                break;
            case 5:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas5);
                break;
            case 6:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas6);
                break;
            case 7:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas7);
                break;
            case 8:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas8);
                break;
            case 9:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas9);
                break;
            case 10:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas10);
                break;
            case 11:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas11);
                break;
            case 12:
                pantalla.mostrarObjeto(x + xx, y + yy, Sprite.armas12);
                break;
        }

    }

    public void mostrar(Pantalla pantalla) {
        //pantalla.mostrarBarra(x, y, this);
        elije(player.porteArmas[0], 90, 15, pantalla);
        elije(player.porteArmas[1], 190, 15, pantalla);
        elije(player.porteArmas[2], 290, 15, pantalla);
        vida();
    }

    public void vida() {
        int xp;
        int yp;
        int v = 75 + ((player.vida * 150) / 10000);
        int e;
        for (yp = 400; yp < 408; yp++) {
            for (xp = 75; xp < v; xp++) {
                pantalla.pixeles[xp + yp * pantalla.tamaAncho()] = 0xffae2525;
            }
        }
        for (yp = 410; yp < 418; yp++) {
            for (xp = 75; xp < 225; xp++) {
                pantalla.pixeles[xp + yp * pantalla.tamaAncho()] = 0xff254eae;
            }
        }

    }

}
