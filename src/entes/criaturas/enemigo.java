package entes.criaturas;

import Control.mouse;
import Control.teclado;
import Main.main;
import Mapa.Mapa;
import graficos.Pantalla;
import graficos.Sprite;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import java.util.Random;

public class enemigo extends criatura {

    private int velocidad;
    private player player;
    private int animacion;
    public double v;
    public int vida = 1000;
    private teclado teclado;
    private int tiempo;
    //private boolean empujado;
    private mouse raton;
    private main game;
    public int xJuegoRaton;
    public int yJuegoRaton;
    private int xl = (int) ((Math.random() * 60) * (int) pow(-1, (int) (Math.random() * 5)));
    private int yl = (int) ((Math.random() * 60) * (int) pow(-1, (int) (Math.random() * 5)));

    private static Sprite spriteI1 = Sprite.enemigo6_1i;
    private static Sprite spriteI2 = Sprite.enemigo6_2i;
    private static Sprite spriteI3 = Sprite.enemigo6_3i;
    private static Sprite spriteD1 = Sprite.enemigo6_1d;
    private static Sprite spriteD2 = Sprite.enemigo6_2d;
    private static Sprite spriteD3 = Sprite.enemigo6_3d;
    private static Sprite danoD = Sprite.enemigo6danoD;
    private static Sprite danoI = Sprite.enemigo6danoI;

    public enemigo(Mapa mapa, teclado teclado, Sprite sprite) {
        this.mapa = mapa;
        this.sprite = sprite;
    }

    public enemigo(Mapa mapa, teclado teclado, Sprite sprite, int posx, int posy, player player, double v, mouse raton, main game) {
        this.mapa = mapa;
        this.sprite = sprite;
        this.teclado = teclado;
        this.x = posx;
        this.y = posy;
        this.player = player;
        this.v = v;
        this.raton = raton;
        this.game = game;
        tipoEnemigo(1);
        //empujado=false;
        // System.out.println(xl + "/" + yl);
        eliminado = true;
    }

    @Override
    public void actualizar() {
        if (this.eliminado == false) {
            ataque = false;
            //System.out.println(player.vida);
            int desx = 0;
            int desy = 0;

            if (animacion < 32767) {
                animacion++;
            } else {
                animacion = 0;
            }

            int xplayer = player.obtenx();
            int yplayer = player.obteny();
            if (dist() < Math.random() * 250 + 100 && dist() > 50) {/////
                // System.out.println((Math.random() * 40));
                double v = this.v;
                int p = (int) round(0.5 / v);
                if (this.x > xplayer) {
                    desx += (int) round(((player.obtenx() + xl) - this.x - p + 10) * v);
                }
                if (this.x < xplayer) {
                    desx += (int) round(((player.obtenx() + xl) - this.x + p - 10) * v);
                }
                if (this.y > yplayer) {
                    desy += (int) round(((player.obteny() + yl) - this.y - p + 10) * v);
                }
                if (this.y < yplayer) {
                    desy += (int) round(((player.obteny() + yl) - this.y + p - 10) * v);
                }
                //System.out.println(xplayer + "," + yplayer + "||" + this.x + "," + this.y);
            } else {
                //Random aleatorio = new Random();
                //desx += aleatorio.nextInt(2) * pow(-1, aleatorio.nextInt(2));
                //desy += aleatorio.nextInt(2) * pow(-1, aleatorio.nextInt(2));
            }//
            if (dist() < 51) {

                if (tiempo == 1 || tiempo == 12 || tiempo == 24 || tiempo == 36 || tiempo == 48) {

                    /*this.x = this.x - (player.obtenx() - this.x) / 4;
                    this.y = this.y - (player.obteny() - this.y) / 4;*/
                    if ((player.obtenx() > 184) && (player.obtenx() < 654) && (player.obteny() > 164) && (player.obteny() < 644) && game.mapas.nivel == 1) {
                        if (tiempo == 1 || tiempo == 24) {
                            player.posicion(player.obtenx() - (this.x - player.obtenx()) * 3 / 8, player.obteny() - (this.y - player.obteny()) * 3 / 8);
                            player.vida(-300);
                        }
                    } else {
                        if (tiempo == 1 || tiempo == 24) {

                            player.vida(-500);
                        }

                    }

                    if ((player.obtenx() > 398) && (player.obtenx() < 942) && (player.obteny() > 36) && (player.obteny() < 580) && game.mapas.nivel == 2) {
                        if (tiempo == 1 || tiempo == 24) {
                            player.posicion(player.obtenx() - (this.x - player.obtenx()) * 3 / 8, player.obteny() - (this.y - player.obteny()) * 3 / 8);
                            player.vida(-500);
                        }
                    } else {
                        if (tiempo == 1 || tiempo == 24) {

                            player.vida(-500);
                        }

                    }

                    if ((player.obtenx() > 46) && (player.obtenx() < 46 + 384) && (player.obteny() > 740) && (player.obteny() < 740 + 384) && game.mapas.nivel == 2) {
                        if (tiempo == 1 || tiempo == 24) {
                            player.posicion(player.obtenx() - (this.x - player.obtenx()) * 3 / 8, player.obteny() - (this.y - player.obteny()) * 3 / 8);
                            player.vida(-500);
                        }
                    } else {
                        if (tiempo == 1 || tiempo == 24) {

                            player.vida(-500);
                        }

                    }

                }

                if (raton.obtenerPress() == true && player.ata == false) {
                    this.vida = this.vida - 50;

                    ataque = true;

                }
            }

            xJuegoRaton = (int) (raton.posicion.getX() + (player.obtenx() - 368));
            yJuegoRaton = (int) (raton.posicion.getY() + (player.obteny() - 192));
            //System.out.println("Player: " + player.vida + " Enemigo: " + this.vida);
            //System.out.println("Player: " + player.obtenx() + "," + player.obteny() + " Enemigo: " + x + "," + y);
            //System.out.println(raton.posicion.getX()+","+raton.posicion.getX());

            if (desx != 0 || desy != 0) {
                mover(desx, desy);
                enMovimiento = true;
            } else {
                enMovimiento = false;
            }
            //System.out.println("//////////" + vida);
            if (direccion == true) {
                sprite = spriteD1;
                if (enMovimiento) {
                    int resto = animacion % 21;
                    if (resto > 7 && resto <= 14) {
                        sprite = spriteD2;
                    } else if (resto > 14) {
                        sprite = spriteD3;
                    } else {
                        sprite = spriteD1;
                    }
                }
            }
            if (direccion == false) {
                sprite = spriteI1;
                if (enMovimiento) {
                    int resto = animacion % 21;
                    if (resto > 7 && resto <= 14) {
                        sprite = spriteI2;
                    } else if (resto > 14) {
                        sprite = spriteI3;
                    } else {
                        sprite = spriteI1;//Sprite.enemigo1_1i;
                    }
                }
            }
            if (this.vida <= 0) {
                player.contador++;
                this.eliminar();
                x = 0;
                y = 0;
                player.dinero = player.dinero + 50;
                game.interfaz.dinero2.setText("" + player.dinero);
            }
        }

    }
    private boolean ataque = false;

    public double dist() {
        double d = sqrt(pow(this.x - player.obtenx(), 2) + pow(this.y - player.obteny(), 2));

        return d;

    }

    public void vida() {

        this.vida = this.vida - 20;
        if (tiempo == 50) {
            this.vida = this.vida - 100;
        }
        ///this.x = this.x - (player.obtenx() - this.x) / 4;
        ///this.y = this.y - (player.obteny() - this.y) / 4;
        ataque = true;
    }

    public void mostrar(Pantalla pantalla) {
        if (this.eliminado == false) {

            if (ataque == true) {
                if (direccion == true) {
                    pantalla.mostrarObjeto(x, y, danoD);
                } else {
                    pantalla.mostrarObjeto(x - 2, y, danoI);
                }
            }
            pantalla.mostrarEnemnigos(x, y, this);
        }
        if (tiempo < 60) {
            tiempo++;
        } else {
            tiempo = 0;

        }
    }

    public void tipoEnemigo(int n) {
        switch (n) {
            case 1:
                spriteI1 = Sprite.enemigo1_1i;
                spriteI2 = Sprite.enemigo1_2i;
                spriteI3 = Sprite.enemigo1_3i;
                spriteD1 = Sprite.enemigo1_1d;
                spriteD2 = Sprite.enemigo1_2d;
                spriteD3 = Sprite.enemigo1_3d;
                danoD = Sprite.enemigo1danoD;
                danoI = Sprite.enemigo1danoI;
                break;
            case 2:
                spriteI1 = Sprite.enemigo2_1i;
                spriteI2 = Sprite.enemigo2_2i;
                spriteI3 = Sprite.enemigo2_3i;
                spriteD1 = Sprite.enemigo2_1d;
                spriteD2 = Sprite.enemigo2_2d;
                spriteD3 = Sprite.enemigo2_3d;
                danoD = Sprite.enemigo2danoD;
                danoI = Sprite.enemigo2danoI;
                break;
            case 3:
                spriteI1 = Sprite.enemigo3_1i;
                spriteI2 = Sprite.enemigo3_2i;
                spriteI3 = Sprite.enemigo3_3i;
                spriteD1 = Sprite.enemigo3_1d;
                spriteD2 = Sprite.enemigo3_2d;
                spriteD3 = Sprite.enemigo3_3d;
                danoD = Sprite.enemigo3danoD;
                danoI = Sprite.enemigo3danoI;
                break;
            case 4:
                spriteI1 = Sprite.enemigo4_1i;
                spriteI2 = Sprite.enemigo4_1i;
                spriteI3 = Sprite.enemigo4_1i;
                spriteD1 = Sprite.enemigo4_1d;
                spriteD2 = Sprite.enemigo4_1d;
                spriteD3 = Sprite.enemigo4_1d;
                danoD = Sprite.enemigo4danoD;
                danoI = Sprite.enemigo4danoI;
                break;
            case 5:
                spriteI1 = Sprite.enemigo5_1i;
                spriteI2 = Sprite.enemigo5_2i;
                spriteI3 = Sprite.enemigo5_3i;
                spriteD1 = Sprite.enemigo5_1d;
                spriteD2 = Sprite.enemigo5_2d;
                spriteD3 = Sprite.enemigo5_3d;
                danoD = Sprite.enemigo5danoD;
                danoI = Sprite.enemigo5danoI;
                break;
            case 6:
                spriteI1 = Sprite.enemigo6_1i;
                spriteI2 = Sprite.enemigo6_2i;
                spriteI3 = Sprite.enemigo6_3i;
                spriteD1 = Sprite.enemigo6_1d;
                spriteD2 = Sprite.enemigo6_2d;
                spriteD3 = Sprite.enemigo6_3d;
                danoD = Sprite.enemigo6danoD;
                danoI = Sprite.enemigo6danoI;
                break;

        }
    }
}
