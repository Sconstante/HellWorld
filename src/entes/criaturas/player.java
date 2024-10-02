package entes.criaturas;

import Control.teclado;
import Mapa.Mapa;
import entes.armaCuerpo;
import graficos.Pantalla;
import graficos.Sprite;
import static graficos.Sprite.arma;

public class player extends criatura {

    public int contador = 0;
    private teclado teclado;
    private int velocidad;
    private int animacion;
    private armaCuerpo arma;
    public boolean ata = false;
    public int vida = 10000;
    public int vigor = 20;
    public int dinero = 10000;
    public int trajeActual = 2;
    public String nombre = "polo";
    public int partidaCargada = 0;
    public int armaActual = 4;
    public int espacioArma = 1;
    public boolean espacio = false;
    public boolean[] armas = new boolean[12];
    public boolean[] trajes = new boolean[9];
    public int[] porteArmas = new int[3];

    private int tiempo;

    private static Sprite spriteI1;
    private static Sprite spriteI2;
    private static Sprite spriteI3;
    private static Sprite spriteD1;
    private static Sprite spriteD2;
    private static Sprite spriteD3;

    public void posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public player(Mapa mapa, teclado teclado, Sprite sprite) {
        this.mapa = mapa;
        this.teclado = teclado;
        this.sprite = sprite;
    }

    public player(Mapa mapa, teclado teclado, Sprite sprite, int posx, int posy) {
        this.mapa = mapa;
        this.teclado = teclado;
        this.sprite = sprite;
        this.x = posx;
        this.y = posy;
        player.spriteI1 = Sprite.caballero1_1i;
        player.spriteI2 = Sprite.caballero1_2i;
        player.spriteI3 = Sprite.caballero1_3i;
        player.spriteD1 = Sprite.caballero1_1d;
        player.spriteD2 = Sprite.caballero1_2d;
        player.spriteD3 = Sprite.caballero1_3d;
        for (int i = 0; i < 12; i++) {
            armas[i] = false;
        }

        for (int i = 0; i < 9; i++) {
            trajes[i] = false;
        }
        trajes[0] = true;
        // trajes[1] = false;
        // trajes[4] = false;

        porteArmas[0] = 4;
        porteArmas[1] = 0;
        porteArmas[2] = 0;
    }

    public void vida(int vida) {
        if (this.vida + vida <= 0) {
            this.vida = 0;
        }
        if (this.vida > 0) {
            this.vida = this.vida + vida;
        }
    }

    @Override
    public void actualizar() {
        int desx = 0;
        int desy = 0;
        this.velocidad = 4;
        if (animacion < 32767) {
            animacion++;
        } else {
            animacion = 0;
        }

        if (teclado.arriba) {
            desy = desy - velocidad;
        }
        if (teclado.abajo) {
            desy = desy + velocidad;
        }
        if (teclado.izquierda) {
            desx = desx - velocidad;
        }
        if (teclado.derecha) {
            desx = desx + velocidad;
        }

        if (desx != 0 || desy != 0) {
            mover(desx, desy);
            enMovimiento = true;
        } else {
            enMovimiento = false;
        }

        if (direccion == true) {
            sprite = player.spriteD1;
            if (enMovimiento) {
                int resto = animacion % 21;
                if (resto > 7 && resto <= 14) {
                    sprite = player.spriteD2;
                } else if (resto > 14) {
                    sprite = player.spriteD3;
                } else {
                    sprite = player.spriteD1;
                }
            }
        }
        if (direccion == false) {
            sprite = player.spriteI1;
            if (enMovimiento) {
                int resto = animacion % 21;
                if (resto > 7 && resto <= 14) {
                    sprite = player.spriteI2;
                } else if (resto > 14) {
                    sprite = player.spriteI3;
                } else {
                    sprite = player.spriteI1;
                }
            }
        }
        if ((tiempo == 1 || tiempo == 12 || tiempo == 24 || tiempo == 36 || tiempo == 48)) {
            if (vida <= 10000) {
                vida(40);
            } else {
                vida = 10000;
            }

        }
        //System.out.println(vida);    
        if (tiempo < 60) {
            tiempo++;
        } else {
            tiempo = 0;

        }
    }

    public void tipoPersonaje(int n) {
        switch (n) {
            case 1:
                player.spriteI1 = Sprite.caballero1_1i;
                player.spriteI2 = Sprite.caballero1_2i;
                player.spriteI3 = Sprite.caballero1_3i;
                player.spriteD1 = Sprite.caballero1_1d;
                player.spriteD2 = Sprite.caballero1_2d;
                player.spriteD3 = Sprite.caballero1_3d;
                break;
            case 2:
                player.spriteI1 = Sprite.mago1_1i;
                player.spriteI2 = Sprite.mago1_2i;
                player.spriteI3 = Sprite.mago1_3i;
                player.spriteD1 = Sprite.mago1_1d;
                player.spriteD2 = Sprite.mago1_2d;
                player.spriteD3 = Sprite.mago1_3d;
                break;
            case 3:
                player.spriteI1 = Sprite.bestia1_1i;
                player.spriteI2 = Sprite.bestia1_2i;
                player.spriteI3 = Sprite.bestia1_3i;
                player.spriteD1 = Sprite.bestia1_1d;
                player.spriteD2 = Sprite.bestia1_2d;
                player.spriteD3 = Sprite.bestia1_3d;
                break;
            case 4:
                player.spriteI1 = Sprite.caballero2_1i;
                player.spriteI2 = Sprite.caballero2_2i;
                player.spriteI3 = Sprite.caballero2_3i;
                player.spriteD1 = Sprite.caballero2_1d;
                player.spriteD2 = Sprite.caballero2_2d;
                player.spriteD3 = Sprite.caballero2_3d;
                break;
            case 5:
                player.spriteI1 = Sprite.mago2_1i;
                player.spriteI2 = Sprite.mago2_2i;
                player.spriteI3 = Sprite.mago2_3i;
                player.spriteD1 = Sprite.mago2_1d;
                player.spriteD2 = Sprite.mago2_2d;
                player.spriteD3 = Sprite.mago2_3d;

                break;
            case 6:
                player.spriteI1 = Sprite.bestia2_1i;
                player.spriteI2 = Sprite.bestia2_2i;
                player.spriteI3 = Sprite.bestia2_3i;
                player.spriteD1 = Sprite.bestia2_1d;
                player.spriteD2 = Sprite.bestia2_2d;
                player.spriteD3 = Sprite.bestia2_3d;
                break;
            case 7:
                player.spriteI1 = Sprite.caballero3_1i;
                player.spriteI2 = Sprite.caballero3_2i;
                player.spriteI3 = Sprite.caballero3_3i;
                player.spriteD1 = Sprite.caballero3_1d;
                player.spriteD2 = Sprite.caballero3_2d;
                player.spriteD3 = Sprite.caballero3_3d;
                break;
            case 8:
                player.spriteI1 = Sprite.mago3_1i;
                player.spriteI2 = Sprite.mago3_2i;
                player.spriteI3 = Sprite.mago3_3i;
                player.spriteD1 = Sprite.mago3_1d;
                player.spriteD2 = Sprite.mago3_2d;
                player.spriteD3 = Sprite.mago3_3d;
                break;
            case 9:
                player.spriteI1 = Sprite.bestia3_1i;
                player.spriteI2 = Sprite.bestia3_2i;
                player.spriteI3 = Sprite.bestia3_3i;
                player.spriteD1 = Sprite.bestia3_1d;
                player.spriteD2 = Sprite.bestia3_2d;
                player.spriteD3 = Sprite.bestia3_3d;
                break;

        }
    }

    public void mostrar(Pantalla pantalla) {
        pantalla.mostrarPlayer(x, y, this);

    }

    public void mostrar2(Pantalla pantalla) {
        if (espacio == true) {
            pantalla.mostrarObjeto(x - 5, y - 50, Sprite.ESPACIO);
        }

    }
}
