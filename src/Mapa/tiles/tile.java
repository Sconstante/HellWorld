package Mapa.tiles;

import graficos.Pantalla;
import graficos.Sprite;

public class tile {

    public final static int lado = 32;
    public int x;
    public int y;
    private boolean solido;
    //Coleccion de tiles
    public static final tile plaza = new tile(Sprite.suelo);
    public static final tile vacio = new tile(Sprite.vacio, true);
    public static final tile pisoNar = new tile(Sprite.suelo1, true);
    public static final tile paredlobby1 = new tile(Sprite.paredlobby1, true);
    public static final tile paredlobby2 = new tile(Sprite.paredlobby2, true);
    public static final tile paredlobby3 = new tile(Sprite.paredlobby3, true);
    public static final tile paredlobby4 = new tile(Sprite.paredlobby4, true);
    public static final tile paredlobby5 = new tile(Sprite.paredlobby5, true);
    public static final tile paredlobby6 = new tile(Sprite.paredlobby6, true);
    public static final tile piso1 = new tile(Sprite.suelo2);
    public static final tile pisoAzul = new tile(Sprite.azul);
    public static final tile pisoAzulOscuro = new tile(Sprite.azulOscuro);
    //////
    public static final tile meson = new tile(Sprite.meson, true);
    public static final tile meson1 = new tile(Sprite.meson1, true);
    public static final tile meson2 = new tile(Sprite.meson2, true);
    public static final tile meson3 = new tile(Sprite.meson3, true);
    public static final tile meson4 = new tile(Sprite.meson4, true);
    public static final tile meson5 = new tile(Sprite.meson5, true);
    public static final tile meson6 = new tile(Sprite.meson6, true);
    public static final tile meson7 = new tile(Sprite.meson7, true);
    public static final tile meson8 = new tile(Sprite.meson8, true);
    public static final tile meson9 = new tile(Sprite.meson9, true);
    public static final tile meson10 = new tile(Sprite.meson10, true);
    public static final tile meson11 = new tile(Sprite.meson11, true);
    public static final tile meson12 = new tile(Sprite.meson12, true);
    public static final tile meson13 = new tile(Sprite.meson13, true);
    public static final tile meson14 = new tile(Sprite.meson14, true);
    public static final tile meson15 = new tile(Sprite.meson15, true);
    public static final tile meson16 = new tile(Sprite.meson16, true);
    public static final tile meson17 = new tile(Sprite.meson17, true);
    public static final tile meson18 = new tile(Sprite.meson18, true);
    public static final tile meson19 = new tile(Sprite.meson19, true);
    public static final tile meson20 = new tile(Sprite.meson20, true);
    public static final tile meson21 = new tile(Sprite.meson21);
    public static final tile meson22 = new tile(Sprite.meson22);
    public static final tile meson23 = new tile(Sprite.meson23);
    public static final tile meson24 = new tile(Sprite.meson24);
    public static final tile meson25 = new tile(Sprite.meson25);
    public static final tile meson26 = new tile(Sprite.meson26);
    public static final tile meson27 = new tile(Sprite.meson27);
    public static final tile meson28 = new tile(Sprite.meson28);
    public static final tile meson29 = new tile(Sprite.meson29);
    public static final tile meson30 = new tile(Sprite.meson30);
    public static final tile meson31 = new tile(Sprite.meson31);
    public static final tile meson32 = new tile(Sprite.meson32);
    public static final tile meson33 = new tile(Sprite.meson33);
    public static final tile meson34 = new tile(Sprite.meson34);
    public static final tile meson35 = new tile(Sprite.meson35);
    public static final tile meson36 = new tile(Sprite.meson36);
    public static final tile meson37 = new tile(Sprite.meson37);
    public static final tile meson38 = new tile(Sprite.meson38);
    public static final tile meson39 = new tile(Sprite.meson39);
    public static final tile esquina1 = new tile(Sprite.esquina1);
    public static final tile esquina2 = new tile(Sprite.esquina2);
    public static final tile esquina3 = new tile(Sprite.esquina3);
    public static final tile esquina4 = new tile(Sprite.esquina4);
    public static final tile esquinaMesa1 = new tile(Sprite.esquinaMesa1, true);
    public static final tile esquinaMesa2 = new tile(Sprite.esquinaMesa2, true);
    public static final tile esquinaMesa3 = new tile(Sprite.esquinaMesa3, true);
    public static final tile esquinaMesa4 = new tile(Sprite.esquinaMesa4, true);
    public static final tile borde1 = new tile(Sprite.borde1);
    public static final tile borde2 = new tile(Sprite.borde2);
    public static final tile borde3 = new tile(Sprite.borde3);
    public static final tile borde4 = new tile(Sprite.borde4);
    public static final tile piso = new tile(Sprite.piso);
    //Fin coleccion tiles 
    public Sprite sprite;

    public tile(Sprite sprite) {
        this.sprite = sprite;
        this.solido = false;
    }

    public tile(Sprite sprite, boolean solido) {
        this.sprite = sprite;
        this.solido = solido;
    }

    public boolean esSolido() {
        return solido;

    }

    public void mostrar(int x, int y, Pantalla pantalla) {
        pantalla.mostrarTile(x << 5, y << 5, this);
    }
}
