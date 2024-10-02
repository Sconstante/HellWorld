package Mapa;

import java.util.Random;

public class mapaGenerado extends Mapa {
    private static final Random aleatorio = new Random();
    public mapaGenerado(int ancho, int alto) {
        generarMapa();
    }
    
    @Override
    protected void generarMapa() {
        int n=0;
        int[] S = {1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,1,1,2,2,2,2,2,2,1,1,2,2,2,2,2,2,1,1,2,2,2,2,2,2,1,1,2,2,2,2,2,2,1,1,2,2,2,2,2,2,1,1,1,1,1,1,1,1,1};
        for (int y = 0; y < alto; y++) {
            for (int x = 0; x < ancho; x++) {
                
                tiles[x+y*ancho]=S[n];
                n++;
                //
            }
        }
    }

}
