/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entes;

import Control.mouse;
import Control.teclado;
import Main.main;
import Mapa.Mapa;
import entes.criaturas.criatura;
import entes.criaturas.enemigo;
import entes.criaturas.player;
import graficos.Pantalla;
import graficos.Sprite;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ataqueDistancia {

    private double m = 0;
    private double xp = 0;
    private double yp = 0;
    public double xJuegoRaton;
    public double yJuegoRaton;
    private boolean ataque2 = false;
    private boolean dir = false;
    private double xb = 96;
    private double yb = 96;
    private int xxb = 96;
    private int yyb = 96;
    private int n = 0;
    private int x;
    private int y;
    public int margenx = 0;
    public int margeny = 0;
    public int margenxi = 0;
    public int margenyi = 0;

    private boolean ataqueDistancia = true;
    private player player;
    private teclado teclado;
    private mouse raton;
    private Mapa mapa;
    private enemigo[] enemigo;

    public ataqueDistancia(Mapa mapa, teclado teclado, player player, mouse raton, enemigo[] enemigo) {
        this.teclado = teclado;
        this.player = player;
        this.raton = raton;
        this.mapa = mapa;
        this.enemigo = enemigo;
    }

    public void ini(Mapa mapa, teclado teclado, player player, mouse raton, enemigo[] enemigo) {
        this.teclado = teclado;
        this.player = player;
        this.raton = raton;
        this.mapa = mapa;
        this.enemigo = enemigo;
    }
    public boolean uso = true;

    public void actualizar() {
        xJuegoRaton = (raton.posicion.getX() + (player.obtenx() - 368));
        yJuegoRaton = (raton.posicion.getY() + (player.obteny() - 192));
        //System.out.println(xJuegoRaton + "," + yJuegoRaton);
        boolean r = false;
        if (raton.obtenerPress() == true && uso == true) {

            xp = player.obtenx() + 32;
            yp = player.obteny() + 32;
            m = (yJuegoRaton - yp) / (xJuegoRaton - xp);
            ataque2 = true;
            xb = (double) player.obtenx();
            yb = (double) player.obteny();
            dir = xJuegoRaton > xp;
            n = 4;
            visible = true;
            r = true;
            if (raton.posicion.getX() > 400) {
                player.direccion = true;
            } else {
                player.direccion = false;
            }
        }

        if (ataque2 == true) {
            n++;
            if (dir == true) {
                xb = velocidadBala(/*pow(n, 2)*/(n * 40) / 7, m, (m * (double) xp) - (double) yp, xp, yp);
            } else {
                xb = velocidadBalaNega(/*pow(n, 2)*/(n * 40) / 7, m, (m * (double) xp) - (double) yp, xp, yp);
            }

            yb = ((m * (xb - xp)) + yp);
            xxb = (int) xb - 16;
            yyb = (int) yb - 16;
            visible = true;

        }

        if (xxb > 10000 || xxb < -10000) {
            ataque2 = false;
        }
        int xs = (xxb + margenx) / 32;
        int ys = (yyb + margeny) / 32;
        if (mapa.obtenCuadro(xs + ys * mapa.obtenAncho()).esSolido()) {
            ataque2 = false;
            visible = false;
        }
        xs = (xxb + 25 + margenxi) / 32;
        ys = (yyb + 25 + margenyi) / 32;
        if (mapa.obtenCuadro(xs + ys * mapa.obtenAncho()).esSolido()) {
            ataque2 = false;
            visible = false;
        }
        if (raton.obtenerPress() == true && uso == true) {
            visible = true;
        }
      
        for (int i = 0; i < 6; i++) {
            if (sqrt(pow(this.xxb - (enemigo[i].x + 18), 2) + pow(this.yyb - (enemigo[i].y + 16), 2)) <= 36 && ataque2 == true /*&& r == false*/) {
                enemigo[i].vida();
            }
            if (sqrt(pow(this.xxb - (enemigo[i].x + 18), 2) + pow(this.yyb - (enemigo[i].y + 16), 2)) <= 20) {
                ataque2 = false;
                visible = false;
            }
            if (r == true) {
                visible = true;
            }
        }
        //System.out.println(enemigo.vida);
    }
    private boolean visible = false;

    public void mostrar(Pantalla pantalla, Sprite sprite) {
        if (visible == true) {
            pantalla.mostrarObjeto(xxb, yyb, sprite);
        }
    }

    private double velocidadBala(double n, double a, double b, double p, double r) {
        double xf;

        xf = ((a * b) + p + (a * r) + sqrt(-pow(b, 2) + pow(n, 2) + (pow(a, 2) * pow(n, 2)) + (2 * a * b * p) - (pow(a, 2) * pow(p, 2)) - (2 * b * r) + (2 * a * p * r) - pow(r, 2))) / (1 + pow(a, 2));

        return xf;
    }

    private double velocidadBalaNega(double n, double a, double b, double p, double r) {
        double xf;

        xf = ((a * b) + p + (a * r) - sqrt(-pow(b, 2) + pow(n, 2) + (pow(a, 2) * pow(n, 2)) + (2 * a * b * p) - (pow(a, 2) * pow(p, 2)) - (2 * b * r) + (2 * a * p * r) - pow(r, 2))) / (1 + pow(a, 2));

        return xf;
    }

}
