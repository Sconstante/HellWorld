package Mapa;

import Control.teclado;
import Mapa.tiles.tile;
import entes.criaturas.player;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class mapaCargado extends Mapa {

    private int[] pixeles;
    private String ruta = "/mapas/mapita17.png";
    private teclado tecla;

    public mapaCargado(teclado tecla) {
        cargarMapa(ruta);
        generarMapa();
    }

    public void cargarMapa1(int x, int y, player player) {

        player.posicion(x, y);
        cargarMapa("/mapas/mapa_n1.png");//mapa3
        generarMapa();
    }
    
    
    public void cargarMapa2(int x, int y, player player) {

        player.posicion(x, y);
        cargarMapa("/mapas/mapa_n2.png");//mapa3
        generarMapa();
    }

    public void lobby(int x, int y, player player) {

        player.posicion(x, y);
        cargarMapa("/mapas/mapita17.png");//mapa3
        generarMapa();
    }

    public void nivel_1ON() {
        cargarMapa("/mapas/mapa_n1_2.png");//mapa3
        generarMapa();
    }

    public void nivel_1OFF() {
        cargarMapa("/mapas/mapa_n1.png");//mapa3
        generarMapa();
    }
     public void nivel_2ON() {
        cargarMapa("/mapas/mapa_n2_2.png");//mapa3
        generarMapa();
    }

    public void nivel_2OFF() {
        cargarMapa("/mapas/mapa_n2.png");//mapa3
        generarMapa();
    }

    @Override
    protected void cargarMapa(String ruta) {

        try {
            BufferedImage imagen = ImageIO.read(mapaCargado.class.getResource(ruta));
            ancho = imagen.getHeight();
            alto = imagen.getHeight();

            cuadros = new tile[ancho * alto];
            pixeles = new int[ancho * alto];

            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);//cargar colores de los pixeles en un array

        } catch (IOException ex) {
            Logger.getLogger(mapaCargado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String obtenRuta() {

        return ruta;
    }

    @Override
    protected void generarMapa() {
        for (int i = 0; i < pixeles.length; i++) {
            switch (pixeles[i]) {
                //0xffnumero
                case 0xffaea68e:
                    cuadros[i] = tile.plaza;
                    continue;
                case 0xff270d0a:
                    cuadros[i] = tile.pisoNar;
                    continue;
                case 0xff74432c:
                    cuadros[i] = tile.piso1;
                    continue;
                case 0xffab402b:
                    cuadros[i] = tile.paredlobby1;
                    continue;
                case 0xffab402c:
                    cuadros[i] = tile.paredlobby2;
                    continue;
                case 0xffab4070:
                    cuadros[i] = tile.paredlobby3;
                    continue;
                case 0xffab4089:
                    cuadros[i] = tile.paredlobby4;
                    continue;
                case 0xfffa4070:
                    cuadros[i] = tile.paredlobby5;
                    continue;
                case 0xffbc4070:
                    cuadros[i] = tile.paredlobby6;
                    continue;
                case 0xff154853:
                    cuadros[i] = tile.pisoAzulOscuro;
                    continue;
                case 0xff1f6674:
                    cuadros[i] = tile.pisoAzul;
                    continue;
                case 0xff100001:
                    cuadros[i] = tile.meson;
                    continue;
                case 0xff200002:
                    cuadros[i] = tile.meson1;
                    continue;
                case 0xff300003:
                    cuadros[i] = tile.meson2;
                    continue;
                case 0xff400004:
                    cuadros[i] = tile.meson3;
                    continue;
                case 0xff500005:
                    cuadros[i] = tile.meson4;
                    continue;
                case 0xff600006:
                    cuadros[i] = tile.meson5;
                    continue;
                case 0xff700007:
                    cuadros[i] = tile.meson6;
                    continue;
                case 0xff800008:
                    cuadros[i] = tile.meson7;
                    continue;
                case 0xff900009:
                    cuadros[i] = tile.meson8;
                    continue;
                case 0xff010010:
                    cuadros[i] = tile.meson9;
                    continue;
                case 0xff000011:
                    cuadros[i] = tile.meson10;
                    continue;
                case 0xff000012:
                    cuadros[i] = tile.meson11;
                    continue;
                case 0xff000013:
                    cuadros[i] = tile.meson12;
                    continue;
                case 0xff000014:
                    cuadros[i] = tile.meson13;
                    continue;
                case 0xff000015:
                    cuadros[i] = tile.meson14;
                    continue;
                case 0xff000016:
                    cuadros[i] = tile.meson15;
                    continue;
                case 0xff000017:
                    cuadros[i] = tile.meson16;
                    continue;
                case 0xff000018:
                    cuadros[i] = tile.meson17;
                    continue;
                case 0xff000019:
                    cuadros[i] = tile.meson18;
                    continue;
                case 0xff000020:
                    cuadros[i] = tile.meson19;
                    continue;
                case 0xff000021:
                    cuadros[i] = tile.meson20;
                    continue;
                case 0xff000022:
                    cuadros[i] = tile.meson21;
                    continue;
                case 0xff000023:
                    cuadros[i] = tile.meson22;
                    continue;
                case 0xff000024:
                    cuadros[i] = tile.meson23;
                    continue;
                case 0xff000025:
                    cuadros[i] = tile.meson24;
                    continue;
                case 0xff000026:
                    cuadros[i] = tile.meson25;
                    continue;
                case 0xff000027:
                    cuadros[i] = tile.meson26;
                    continue;
                case 0xff000028:
                    cuadros[i] = tile.meson27;
                    continue;
                case 0xff000029:
                    cuadros[i] = tile.meson28;
                    continue;
                case 0xff000030:
                    cuadros[i] = tile.meson29;
                    continue;
                case 0xff000031:
                    cuadros[i] = tile.meson30;
                    continue;
                case 0xff000032:
                    cuadros[i] = tile.meson31;
                    continue;
                case 0xff000033:
                    cuadros[i] = tile.meson32;
                    continue;
                case 0xff000034:
                    cuadros[i] = tile.meson33;
                    continue;
                case 0xff000035:
                    cuadros[i] = tile.meson34;
                    continue;
                case 0xff000036:
                    cuadros[i] = tile.meson35;
                    continue;
                case 0xff000037:
                    cuadros[i] = tile.meson36;
                    continue;
                case 0xff000038:
                    cuadros[i] = tile.meson37;
                    continue;
                case 0xff000039:
                    cuadros[i] = tile.meson38;
                    continue;
                case 0xff000040:
                    cuadros[i] = tile.meson39;
                    continue;
                case 0xffcca361:
                    cuadros[i] = tile.esquina1;
                    continue;
                case 0xffcca362:
                    cuadros[i] = tile.esquina2;
                    continue;
                case 0xffcca363:
                    cuadros[i] = tile.esquina3;
                    continue;
                case 0xffcca364:
                    cuadros[i] = tile.esquina4;
                    continue;
                case 0xff986e59:
                    cuadros[i] = tile.esquinaMesa1;
                    continue;
                case 0xff986e58:
                    cuadros[i] = tile.esquinaMesa2;
                    continue;
                case 0xff5c321d:
                    cuadros[i] = tile.esquinaMesa3;
                    continue;
                case 0xff5c321e:
                    cuadros[i] = tile.esquinaMesa4;
                    continue;
                case 0xff397c57:
                    cuadros[i] = tile.borde1;
                    continue;
                case 0xff397c5e:
                    cuadros[i] = tile.borde2;
                    continue;
                case 0xff397c5f:
                    cuadros[i] = tile.borde3;
                    continue;
                case 0xff397c5c:
                    cuadros[i] = tile.borde4;
                    continue;
                case 0xffc3a98b:
                    cuadros[i] = tile.piso;
                    continue;
                default:
                    cuadros[i] = tile.vacio;

            }

        }

    }
}
