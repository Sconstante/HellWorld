package graficos;

import Mapa.tiles.tile;
import entes.armaCuerpo;
import entes.criaturas.enemigo;
import entes.criaturas.player;

public class Pantalla {

    private final int ancho;
    private final int alto;
    public int[] pixeles;
    private int difx;
    private int dify;

    //by the moment
    /* private final static int LADO_SPRITE = 32;
    private final static int MASCARA = LADO_SPRITE - 1;*/
    public int tamaAncho() {
        return ancho;
    }

    public int tamaAlto() {
        return alto;
    }

    public Pantalla(final int ancho, final int alto) {
        this.ancho = ancho;
        this.alto = alto;

        pixeles = new int[ancho * alto];
        
    }

    public void limpiar() {
        for (int i = 0; i < pixeles.length; i++) {
            pixeles[i] = 0;
        }
    }

    //temporal
    /*public void draw(final int comx, final int comy) {
        for (int y = 0; y < alto; y++) {
            int posiciony = y + comy;
            if (posiciony < 0 || posiciony >= alto) {
                continue;
            }
            for (int x = 0; x < ancho; x++) {
                int posicionx = x + comx;
                if (posicionx < 0 || posicionx >= ancho) {
                    continue;
                }
                //by the moment
                pixeles[posicionx + posiciony * ancho] = Sprite.suelo.pixeles[(x & MASCARA) + (y & MASCARA) * LADO_SPRITE];
            }
        }

    }*/
    //fin temporal
    public void mostrarTile(int comx, int comy, tile tiles) {
        comx -= difx;
        comy -= dify;
        for (int y = 0; y < tiles.sprite.size; y++) {
            int posiciony = y + comy;
            for (int x = 0; x < tiles.sprite.size; x++) {
                int posicionx = x + comx;
                if (posicionx < -tiles.sprite.size || posicionx >= ancho || posiciony < 0 || posiciony >= alto) {
                    break;
                }
                if (posicionx < 0) {
                    posicionx = 0;
                }
                pixeles[posicionx + posiciony * ancho] = tiles.sprite.pixeles[x + y * tiles.sprite.size];

            }
        }
    }

    public void establecedif(int difx, int dify) {
        this.difx = difx;
        this.dify = dify;
    }

    public void mostrarPlayer(int comx, int comy, player player) {
        comx -= difx;
        comy -= dify;
        for (int y = 0; y < player.obtenSprite().size; y++) {
            int posiciony = y + comy;
            for (int x = 0; x < player.obtenSprite().size; x++) {
                int posicionx = x + comx;
                if (posicionx < -player.obtenSprite().size || posicionx >= ancho || posiciony < 0 || posiciony >= alto) {
                    break;
                }
                if (posicionx < 0) {
                    posicionx = 0;
                }
                //pixeles[posicionx + posiciony * ancho] = player.obtenSprite().pixeles[x + y * player.obtenSprite().size];
                int colorPixel = player.obtenSprite().pixeles[x + y * player.obtenSprite().size];

                if (colorPixel != 0xffb36bb4) {
                    pixeles[posicionx + posiciony * ancho] = colorPixel;
                }
            }
        }
    }

    public void mostrarEnemnigos(int comx, int comy, enemigo enemigo) {
        comx -= difx;
        comy -= dify;
        for (int y = 0; y < enemigo.obtenSprite().size; y++) {
            int posiciony = y + comy;
            for (int x = 0; x < enemigo.obtenSprite().size; x++) {
                int posicionx = x + comx;
                if (posicionx < -enemigo.obtenSprite().size || posicionx >= ancho || posiciony < 0 || posiciony >= alto) {
                    break;
                }
                if (posicionx < 0) {
                    posicionx = 0;
                }
                int colorPixel = enemigo.obtenSprite().pixeles[x + y * enemigo.obtenSprite().size];

                if (colorPixel != 0xffb36bb4) {
                    pixeles[posicionx + posiciony * ancho] = colorPixel;
                }

            }
        }
    }

    public void mostrarBarra(int comx, int comy, MenuInferior enemigo) {
        comx -= difx;
        comy -= dify;
        for (int y = 0; y < 800; y++) {
            int posiciony = y + comy;
            for (int x = 0; x < 800; x++) {
                int posicionx = x + comx;
                if (posicionx < -800 || posicionx >= ancho || posiciony < 0 || posiciony >= alto) {
                    break;
                }
                if (posicionx < 0) {
                    posicionx = 0;
                }
                int colorPixel = enemigo.sprite.pixeles[x + y * 800];

                if (colorPixel != 0xffb36bb4) {
                    pixeles[posicionx + posiciony * ancho] = colorPixel;
                }

            }
        }
    }

    public void mostrarArma(int comx, int comy, armaCuerpo arma) {
        comx -= difx;
        comy -= dify;
        for (int y = 0; y < arma.obtenSprite().size; y++) {
            int posiciony = y + comy;
            for (int x = 0; x < arma.obtenSprite().size; x++) {
                int posicionx = x + comx;
                if (posicionx < -arma.obtenSprite().size || posicionx >= ancho || posiciony < 0 || posiciony >= alto) {
                    break;
                }
                if (posicionx < 0) {
                    posicionx = 0;
                }
                int colorPixel = arma.obtenSprite().pixeles[x + y * arma.obtenSprite().size];

                if (colorPixel != 0xffb36bb4) {
                    pixeles[posicionx + posiciony * ancho] = colorPixel;
                }

            }
        }
    }
    
    public void mostrarObjeto(int comx, int comy,Sprite sprite){
         comx -= difx;
        comy -= dify;
        for (int y = 0; y < sprite.size; y++) {
            int posiciony = y + comy;
            for (int x = 0; x < sprite.size; x++) {
                int posicionx = x + comx;
                if (posicionx < -sprite.size || posicionx >= ancho || posiciony < 0 || posiciony >= alto) {
                    break;
                }
                if (posicionx < 0) {
                    posicionx = 0;
                }
                int colorPixel = sprite.pixeles[x + y * sprite.size];

                if (colorPixel != 0xffb36bb4) {
                    pixeles[posicionx + posiciony * ancho] = colorPixel;
                }

            }
        }
    }

}
