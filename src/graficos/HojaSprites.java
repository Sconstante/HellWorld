package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {

    private final int alto;
    private final int ancho;
    public final int[] pixeles;

    //coleccion de sprites
    public static HojaSprites desierto = new HojaSprites("/recursos/prueba_20.png", 320, 320);
    public static HojaSprites caballeros = new HojaSprites("/recursos/caballeros1.png", 192, 192);
    public static HojaSprites magos = new HojaSprites("/recursos/magos.png", 192, 192);
    public static HojaSprites bestias = new HojaSprites("/recursos/bestias.png", 192, 192);
    public static HojaSprites arma = new HojaSprites("/recursos/armaPrueba.png", 32, 32);
    public static HojaSprites arma1 = new HojaSprites("/recursos/arma1v.png", 45, 45);
    public static HojaSprites arma2 = new HojaSprites("/recursos/arma2v.png", 45, 45);
    public static HojaSprites arma3 = new HojaSprites("/recursos/arma3.png", 45, 45);
    public static HojaSprites sword = new HojaSprites("/recursos/movis2.png", 360, 360);
    public static HojaSprites sword2 = new HojaSprites("/recursos/arma_version2.png", 240, 160);
    public static HojaSprites sword3 = new HojaSprites("/recursos/arma_version3.png", 288, 192);
    public static HojaSprites sword4 = new HojaSprites("/recursos/arma_version4.png", 300, 200);
    public static HojaSprites sword5 = new HojaSprites("/recursos/arma_version5.png", 294, 196);
    public static HojaSprites sword6 = new HojaSprites("/recursos/arma_version6.png", 300, 200);
    public static HojaSprites sword7 = new HojaSprites("/recursos/arma_version7.png", 300, 200);
    public static HojaSprites sword8 = new HojaSprites("/recursos/arma_version8.png", 144, 144);
    public static HojaSprites sword9 = new HojaSprites("/recursos/arma_version9.png", 219, 219);
    public static HojaSprites sword10 = new HojaSprites("/recursos/arma_version10.png", 225, 225);
    public static HojaSprites sword11 = new HojaSprites("/recursos/arma_version11.png", 213, 213);
    public static HojaSprites sword12 = new HojaSprites("/recursos/arma_version12.png", 228, 228);
    public static HojaSprites barra = new HojaSprites("/recursos/barra2.png", 800, 800);
    public static HojaSprites bala = new HojaSprites("/recursos/bala.png", 32, 32);
    public static HojaSprites bala2 = new HojaSprites("/recursos/bala2.png", 16, 16);
    public static HojaSprites dano = new HojaSprites("/recursos/caballeroDano.png", 66, 66);
    public static HojaSprites armas = new HojaSprites("/recursos/armas.png", 240, 400);
    public static HojaSprites ESPACIO = new HojaSprites("/recursos/ESPACIO.png", 70, 70);
    public static HojaSprites enemigos = new HojaSprites("/recursos/spritesEnemigos.png", 192, 384);
      public static HojaSprites enemigosDano = new HojaSprites("/recursos/herida_enem.png", 186, 124);

    //fin de coleccion
    public HojaSprites(final String ruta, final int ancho, final int alto) {
        this.ancho = ancho;
        this.alto = alto;
        pixeles = new int[ancho * alto];

        BufferedImage imagen;
        try {
            imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getAncho() {
        return ancho;
    }
}
