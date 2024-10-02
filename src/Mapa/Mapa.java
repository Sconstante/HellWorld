package Mapa;

import Mapa.tiles.tile;
import graficos.Pantalla;

public abstract class Mapa {

    protected int ancho;
    protected int alto;

    protected int[] tiles;
    protected tile[] cuadros;
    
   /* public Mapa(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;

        tiles = new int[ancho * alto];
        generarMapa();

    }*/

    public tile obtenCuadro(int posicion){
    
        return cuadros[posicion];
    } 
    
    public int obtenAncho(){
        return ancho;
    } 
    

    protected void cargarMapa(String ruta) {

    }

    protected void generarMapa() {

    }

    public void actualizar() {

    }

    public void mostrar(int comx, int comy, Pantalla pantalla) {
        pantalla.establecedif(comx, comy);
        
        int up = comy >> 5;
        int down = (comy + pantalla.tamaAlto()+tile.lado) >> 5;
        int left = comx >> 5;
        int right = (comx + pantalla.tamaAncho()+tile.lado) >> 5;
        for (int y = up; y < down; y++) {
            for (int x = left; x < right; x++) {
                //obtenTile(x,y).mostrar(x, y, pantalla);
                if(x<0||y<0||x>=ancho||y>=alto){
                    tile.vacio.mostrar(x, y, pantalla);
                }else{
                    cuadros[x+y*ancho].mostrar(x, y, pantalla);
                }
            }
        }

    }

    public tile obtenTile(final int x,final int y) {
        if(x<0||y<0||x>=ancho||y>=alto){
           return tile.vacio;
        }
        
        switch (tiles[x + y * ancho]) {
            case 0:
                return tile.plaza;
            case 1:
                return tile.pisoNar;
            case 2:
                return tile.piso1;
            default:
                return tile.vacio;

        }
    }
}
