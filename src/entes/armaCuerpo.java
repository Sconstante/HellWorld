package entes;

import Control.mouse;
import Control.teclado;
import Mapa.Mapa;
import entes.criaturas.enemigo;
import entes.criaturas.player;
import graficos.Pantalla;
import graficos.Sprite;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class armaCuerpo extends arma {

    private int xc = 0;//10
    private int yc = 0;//2
    private player player;
    private teclado teclado;
    private mouse raton;
    private int animacion;
    public double xJuegoRaton;
    public double yJuegoRaton;
    private Sprite proyectil;
    private int tiempo;
    private gestionAtaqueDistancia bala;
    private enemigo enemigo[];
    private Sprite animacion1 = Sprite.sword;
    private Sprite animacion2 = Sprite.sword2;
    private Sprite animacion3 = Sprite.sword3;
    private Sprite animacion4 = Sprite.sword4;
    private Sprite animacion5 = Sprite.sword5;
    private Sprite animacion6 = Sprite.sword6;
    private Sprite animacion7 = Sprite.sword7;
    private Sprite animacion8 = Sprite.sword8;
    private Sprite animacion1I = Sprite.swordi;
    private Sprite animacion2I = Sprite.sword2i;
    private Sprite animacion3I = Sprite.sword3i;
    private Sprite animacion4I = Sprite.sword4i;
    private Sprite animacion5I = Sprite.sword5i;
    private Sprite animacion6I = Sprite.sword6i;
    private Sprite animacion7I = Sprite.sword7i;
    private Sprite animacion8I = Sprite.sword8i;

    private int ajusteX = 0;
    private int ajusteY = 0;
    private int ajusteInvertido = 0;
    int v = 1;

    public armaCuerpo(Mapa mapa, teclado teclado, Sprite sprite, int posx, int posy, player player, mouse raton, enemigo[] enemigo) {
        this.mapa = mapa;
        this.sprite = sprite;
        this.x = posx;
        this.y = posy;
        this.teclado = teclado;
        this.player = player;
        this.raton = raton;
        this.enemigo = enemigo;

        bala = new gestionAtaqueDistancia(mapa, teclado, player, raton, enemigo);
        cambioArma();
    }

    public void ArmaSelec() {
        if (player.espacioArma == 1) {
            player.armaActual = player.porteArmas[0];
            cambioArma();

        }
        if (player.espacioArma == 2) {
            if (player.porteArmas[1] != 0) {
                player.armaActual = player.porteArmas[1];
                player.espacioArma = 2;
                cambioArma();
            }
        }
        if (player.espacioArma == 3) {
            if (player.porteArmas[2] != 0) {
                player.armaActual = player.porteArmas[2];
                player.espacioArma = 3;
                cambioArma();
            }
        }
    }

    @Override
    public void actualizar() {

        if (teclado.arma1 && raton.obtenerPress() == false) {
            player.armaActual = player.porteArmas[0];
            cambioArma();
            player.espacioArma = 1;
        }
        if (teclado.arma2 && raton.obtenerPress() == false) {
            player.armaActual = player.porteArmas[1];
            player.espacioArma = 2;
            cambioArma();
        }
        if (teclado.arma3 && raton.obtenerPress() == false) {
            player.armaActual = player.porteArmas[2];
            cambioArma();
            player.espacioArma = 3;
        }

        int desx = player.obtenx();
        int desy = player.obteny();
        this.x = desx - 12 + xc + ajusteX;
        this.y = desy + 30 + yc + ajusteY;

        this.sprite = animacion1;
        if (animacion < 32767) {
            animacion++;
        } else {
            animacion = 0;
        }

        boolean direccio = player.obtenDireccion();
        if (direccio == false) {
            this.sprite = animacion1I;
            this.x = desx - 14 - xc - ajusteX + ajusteInvertido;
        }
        if (raton.obtenerPress() == true) {
            if (raton.posicion.getX() > 400) {
                player.direccion = true;
            } else {
                player.direccion = false;
            }
            if (player.armaActual == 1) {
                this.x = desx - 15 + xc;
                this.y = desy + 26 + yc;
            }
            if (direccio == true) {
                int resto = animacion % (8 * v);
                if (resto > (1 * v) && resto <= (2 * v)) {
                    this.sprite = animacion1;

                } else if (resto > (2 * v) && resto <= (3 * v)) {
                    this.sprite = animacion2;
                    if (player.armaActual == 1) {
                        this.y = desy + 24 + yc;
                    }
                } else if (resto > (3 * v) && resto <= (4 * v)) {
                    this.sprite = animacion3;
                    if (player.armaActual == 1) {
                        this.y = desy + 22 + yc;
                    }
                } else if (resto > (4 * v) && resto <= (5 * v)) {
                    this.sprite = animacion4;
                    if (player.armaActual == 1) {
                        this.y = desy + 20 + yc;
                    }
                } else if (resto > (5 * v) && resto <= (6 * v)) {
                    this.sprite = animacion5;
                    if (player.armaActual == 1) {
                        this.y = desy + 18 + yc;
                    }

                } else if (resto > (6 * v) && resto <= (7 * v)) {
                    this.sprite = animacion6;
                    if (player.armaActual == 1) {
                        this.y = desy + 16 + yc;
                    }
                } else if (resto > (7 * v) && resto <= (8 * v)) {
                    this.sprite = animacion7;
                    if (player.armaActual == 1) {
                        this.y = desy + 14 + yc;
                    }
                } else {//if (resto > 5 * v)
                    this.sprite = animacion8;
                    if (player.armaActual == 1) {
                        this.y = desy + 12 + yc;
                    }
                }

                /* } else if (resto > 4 * v) {
                this.sprite = Sprite.sword9;
                this.y = desy + 10;
            } else if (resto > 3 * v) {
                this.sprite = Sprite.sword10;
                this.y = desy + 8;
            } else if (resto > 2 * v) {
                this.sprite = Sprite.sword11;
                this.y = desy + 6;
            } else {
                this.sprite = Sprite.sword12;
                this.y = desy + 4;
            }*/
            } else {

                int resto = animacion % (8 * v);
                if (resto > (1 * v) && resto <= (2 * v)) {
                    this.sprite = animacion1I;
                } else if (resto > (2 * v) && resto <= (3 * v)) {
                    this.sprite = animacion2I;
                    if (player.armaActual == 1) {
                        this.y = desy + 24 + yc;
                    }
                } else if (resto > (3 * v) && resto <= (4 * v)) {
                    this.sprite = animacion3I;
                    if (player.armaActual == 1) {
                        this.y = desy + 22 + yc;
                    }
                } else if (resto > (4 * v) && resto <= (5 * v)) {
                    this.sprite = animacion4I;
                    if (player.armaActual == 1) {
                        this.y = desy + 20 + yc;
                    }
                } else if (resto > (5 * v) && resto <= (6 * v)) {
                    this.sprite = animacion5I;
                    if (player.armaActual == 1) {
                        this.y = desy + 18 + yc;
                    }
                } else if (resto > (6 * v) && resto <= (7 * v)) {
                    this.sprite = animacion6I;
                    if (player.armaActual == 1) {
                        this.y = desy + 16 + yc;
                    }
                } else if (resto > (7 * v) && resto <= (8 * v)) {
                    this.sprite = animacion7I;
                    if (player.armaActual == 1) {
                        this.y = desy + 14 + yc;
                    }
                } else {//if (resto > 5 * v)
                    this.sprite = animacion8I;
                    if (player.armaActual == 1) {
                        this.y = desy + 12 + yc;
                    }
                }
                this.x = desx - 12 - xc - ajusteX + ajusteInvertido;
            }
        }
        if (player.ata) {
            bala.actualizar();
        }

    }
    private Sprite balaSprite = Sprite.bala;

    public void mostrar(Pantalla pantalla) {

        pantalla.mostrarArma(x, y, this);
        if (player.ata) {
            bala.mostrar(pantalla, balaSprite);
        }
        //pantalla.mostrarObjeto(xxb, yyb, Sprite.bala);
        if (tiempo < 60) {
            tiempo++;
        } else {
            tiempo = 0;

        }
    }

    public void tipoPersonaje(int n) {
        xc = 0;
        yc = 0;
        if (n == 5) {
            xc = 10;
            yc = 2;
            if (player.armaActual == 7) {
                xc = 7;
            }
        }
        if (n == 9) {
            xc = 15;
            yc = -6;
            if (player.armaActual == 7) {
                xc = 12;
            }
        }

    }

    public void cambioArma() {
        switch (player.armaActual) {
            case 1:
                animacion1 = Sprite.sword;
                animacion2 = Sprite.sword2;
                animacion3 = Sprite.sword3;
                animacion4 = Sprite.sword4;
                animacion5 = Sprite.sword5;
                animacion6 = Sprite.sword6;
                animacion7 = Sprite.sword7;
                animacion8 = Sprite.sword8;
                animacion1I = Sprite.swordi;
                animacion2I = Sprite.sword2i;
                animacion3I = Sprite.sword3i;
                animacion4I = Sprite.sword4i;
                animacion5I = Sprite.sword5i;
                animacion6I = Sprite.sword6i;
                animacion7I = Sprite.sword7i;
                animacion8I = Sprite.sword8i;
                ajusteX = 0;
                ajusteY = 0;
                ajusteInvertido = 0;
                v = 1;
                player.ata = false;
                break;
            case 2:
                animacion1 = Sprite.sword1_2;
                animacion2 = Sprite.sword2_2;
                animacion3 = Sprite.sword3_2;
                animacion4 = Sprite.sword3_2;
                animacion5 = Sprite.sword4_2;
                animacion6 = Sprite.sword5_2;
                animacion7 = Sprite.sword6_2;
                animacion8 = Sprite.sword6_2;
                animacion1I = Sprite.sword1i_2;
                animacion2I = Sprite.sword2i_2;
                animacion3I = Sprite.sword3i_2;
                animacion4I = Sprite.sword3i_2;
                animacion5I = Sprite.sword4i_2;
                animacion6I = Sprite.sword5i_2;
                animacion7I = Sprite.sword6i_2;
                animacion8I = Sprite.sword6i_2;
                ajusteX = 32;
                ajusteY = -8;
                ajusteInvertido = 10;
                v = 1;
                player.ata = false;
                break;
            case 3:
                animacion1 = Sprite.sword1_3;
                animacion2 = Sprite.sword2_3;
                animacion3 = Sprite.sword3_3;
                animacion4 = Sprite.sword3_3;
                animacion5 = Sprite.sword4_3;
                animacion6 = Sprite.sword5_3;
                animacion7 = Sprite.sword6_3;
                animacion8 = Sprite.sword6_3;
                animacion1I = Sprite.sword1i_3;
                animacion2I = Sprite.sword2i_3;
                animacion3I = Sprite.sword3i_3;
                animacion4I = Sprite.sword3i_3;
                animacion5I = Sprite.sword4i_3;
                animacion6I = Sprite.sword5i_3;
                animacion7I = Sprite.sword6i_3;
                animacion8I = Sprite.sword6i_3;
                ajusteX = 40;
                ajusteY = -15;
                ajusteInvertido = -6;
                v = 1;
                player.ata = false;
                break;
            case 4:
                animacion1 = Sprite.sword1_4;
                animacion2 = Sprite.sword2_4;
                animacion3 = Sprite.sword3_4;
                animacion4 = Sprite.sword3_4;
                animacion5 = Sprite.sword4_4;
                animacion6 = Sprite.sword5_4;
                animacion7 = Sprite.sword6_4;
                animacion8 = Sprite.sword6_4;
                animacion1I = Sprite.sword1i_4;
                animacion2I = Sprite.sword2i_4;
                animacion3I = Sprite.sword3i_4;
                animacion4I = Sprite.sword3i_4;
                animacion5I = Sprite.sword4i_4;
                animacion6I = Sprite.sword5i_4;
                animacion7I = Sprite.sword6i_4;
                animacion8I = Sprite.sword6i_4;
                ajusteX = 30;
                ajusteY = -26;
                ajusteInvertido = -10;
                v = 1;
                player.ata = false;
                break;
            case 5:
                animacion1 = Sprite.sword1_5;
                animacion2 = Sprite.sword2_5;
                animacion3 = Sprite.sword3_5;
                animacion4 = Sprite.sword3_5;
                animacion5 = Sprite.sword4_5;
                animacion6 = Sprite.sword5_5;
                animacion7 = Sprite.sword6_5;
                animacion8 = Sprite.sword6_5;
                animacion1I = Sprite.sword1i_5;
                animacion2I = Sprite.sword2i_5;
                animacion3I = Sprite.sword3i_5;
                animacion4I = Sprite.sword3i_5;
                animacion5I = Sprite.sword4i_5;
                animacion6I = Sprite.sword5i_5;
                animacion7I = Sprite.sword6i_5;
                animacion8I = Sprite.sword6i_5;
                ajusteX = 30;
                ajusteY = -26;
                ajusteInvertido = -8;
                v = 1;
                player.ata = false;
                break;
            case 6:
                animacion1 = Sprite.sword1_6;
                animacion2 = Sprite.sword2_6;
                animacion3 = Sprite.sword3_6;
                animacion4 = Sprite.sword3_6;
                animacion5 = Sprite.sword4_6;
                animacion6 = Sprite.sword5_6;
                animacion7 = Sprite.sword6_6;
                animacion8 = Sprite.sword6_6;
                animacion1I = Sprite.sword1i_6;
                animacion2I = Sprite.sword2i_6;
                animacion3I = Sprite.sword3i_6;
                animacion4I = Sprite.sword3i_6;
                animacion5I = Sprite.sword4i_6;
                animacion6I = Sprite.sword5i_6;
                animacion7I = Sprite.sword6i_6;
                animacion8I = Sprite.sword6i_6;
                ajusteX = 30;
                ajusteY = -26;
                ajusteInvertido = -10;
                v = 1;
                player.ata = false;
                break;
            case 7:
                animacion1 = Sprite.sword1_7;
                animacion2 = Sprite.sword2_7;
                animacion3 = Sprite.sword3_7;
                animacion4 = Sprite.sword3_7;
                animacion5 = Sprite.sword4_7;
                animacion6 = Sprite.sword5_7;
                animacion7 = Sprite.sword6_7;
                animacion8 = Sprite.sword6_7;
                animacion1I = Sprite.sword1i_7;
                animacion2I = Sprite.sword2i_7;
                animacion3I = Sprite.sword3i_7;
                animacion4I = Sprite.sword3i_7;
                animacion5I = Sprite.sword4i_7;
                animacion6I = Sprite.sword5i_7;
                animacion7I = Sprite.sword6i_7;
                animacion8I = Sprite.sword6i_7;
                ajusteX = 40;
                ajusteY = -22;
                ajusteInvertido = -10;
                v = 1;
                player.ata = false;
                break;
            case 8:
                animacion1 = Sprite.sword1_8;
                animacion2 = Sprite.sword2_8;
                animacion3 = Sprite.sword3_8;
                animacion4 = Sprite.sword4_8;
                animacion5 = Sprite.sword5_8;
                animacion6 = Sprite.sword6_8;
                animacion7 = Sprite.sword7_8;
                animacion8 = Sprite.sword8_8;
                animacion1I = Sprite.sword1i_8;
                animacion2I = Sprite.sword2i_8;
                animacion3I = Sprite.sword3i_8;
                animacion4I = Sprite.sword4i_8;
                animacion5I = Sprite.sword5i_8;
                animacion6I = Sprite.sword6i_8;
                animacion7I = Sprite.sword7i_8;
                animacion8I = Sprite.sword8i_8;
                ajusteX = 38;
                ajusteY = -12;
                ajusteInvertido = 42;
                v = 2;
                player.ata = true;
                actualizarBala();
                break;
            case 9:
                animacion1 = Sprite.sword1_9;
                animacion2 = Sprite.sword2_9;
                animacion3 = Sprite.sword3_9;
                animacion4 = Sprite.sword4_9;
                animacion5 = Sprite.sword5_9;
                animacion6 = Sprite.sword6_9;
                animacion7 = Sprite.sword7_9;
                animacion8 = Sprite.sword8_9;
                animacion1I = Sprite.sword1i_9;
                animacion2I = Sprite.sword2i_9;
                animacion3I = Sprite.sword3i_9;
                animacion4I = Sprite.sword4i_9;
                animacion5I = Sprite.sword5i_9;
                animacion6I = Sprite.sword6i_9;
                animacion7I = Sprite.sword7i_9;
                animacion8I = Sprite.sword8i_9;
                ajusteX = 38;
                ajusteY = -34;
                ajusteInvertido = 17;
                v = 2;
                player.ata = true;
                break;
            case 10:
                animacion1 = Sprite.sword1_10;
                animacion2 = Sprite.sword2_10;
                animacion3 = Sprite.sword3_10;
                animacion4 = Sprite.sword4_10;
                animacion5 = Sprite.sword5_10;
                animacion6 = Sprite.sword6_10;
                animacion7 = Sprite.sword7_10;
                animacion8 = Sprite.sword8_10;
                animacion1I = Sprite.sword1i_10;
                animacion2I = Sprite.sword2i_10;
                animacion3I = Sprite.sword3i_10;
                animacion4I = Sprite.sword4i_10;
                animacion5I = Sprite.sword5i_10;
                animacion6I = Sprite.sword6i_10;
                animacion7I = Sprite.sword7i_10;
                animacion8I = Sprite.sword8i_10;
                ajusteX = 38;
                ajusteY = -38;
                ajusteInvertido = 15;
                v = 2;
                player.ata = true;
                break;
            case 11:
                animacion1 = Sprite.sword1_11;
                animacion2 = Sprite.sword2_11;
                animacion3 = Sprite.sword3_11;
                animacion4 = Sprite.sword4_11;
                animacion5 = Sprite.sword5_11;
                animacion6 = Sprite.sword6_11;
                animacion7 = Sprite.sword7_11;
                animacion8 = Sprite.sword8_11;
                animacion1I = Sprite.sword1i_11;
                animacion2I = Sprite.sword2i_11;
                animacion3I = Sprite.sword3i_11;
                animacion4I = Sprite.sword4i_11;
                animacion5I = Sprite.sword5i_11;
                animacion6I = Sprite.sword6i_11;
                animacion7I = Sprite.sword7i_11;
                animacion8I = Sprite.sword8i_11;
                ajusteX = 38;
                ajusteY = -38;
                ajusteInvertido = 19;
                v = 2;
                player.ata = true;
                break;
            case 12:
                animacion1 = Sprite.sword1_12;
                animacion2 = Sprite.sword2_12;
                animacion3 = Sprite.sword3_12;
                animacion4 = Sprite.sword4_12;
                animacion5 = Sprite.sword5_12;
                animacion6 = Sprite.sword6_12;
                animacion7 = Sprite.sword7_12;
                animacion8 = Sprite.sword8_12;
                animacion1I = Sprite.sword1i_12;
                animacion2I = Sprite.sword2i_12;
                animacion3I = Sprite.sword3i_12;
                animacion4I = Sprite.sword4i_12;
                animacion5I = Sprite.sword5i_12;
                animacion6I = Sprite.sword6i_12;
                animacion7I = Sprite.sword7i_12;
                animacion8I = Sprite.sword8i_12;
                ajusteX = 38;
                ajusteY = -38;
                ajusteInvertido = 14;
                v = 2;
                player.ata = true;
                break;

        }

    }

    private void actualizarBala() {
        if (player.armaActual == 8) {
            balaSprite = Sprite.bala2;
            for (int i = 0; i < bala.r; i++) {
                bala.balas[i].margenx = 7;
                bala.balas[i].margeny = 7;
                bala.balas[i].margenxi = -10;
                bala.balas[i].margenyi = -10;
            }
        }

    }
}
