package entes;

import Mapa.Mapa;

public abstract class ente {

    public int x;
    public int y;

    public boolean eliminado = false;

    protected Mapa mapa;

    public void actualizar() {

    }

    public void mostrar() {

    }

    public void eliminar() {
        eliminado = true;
    }

    public int obtenx() {
        return this.x;
    }
    
    public void posicionx(int desx){
        this.x+=desx;
    }

    public int obteny() {
        return this.y;
    }
    
    public void posiciony(int desy){
        this.y+=desy;
    }
    
    public boolean estadoEli(){
        return this.eliminado;
    }
}
