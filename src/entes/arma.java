
package entes;

import graficos.Sprite;


public abstract class arma extends ente {
    
    protected int dano;
    protected int angulo;//entre 0 y 180
    protected boolean direccion;
    protected Sprite sprite;
    
    public int angulo(){
        return angulo;
    }
    public int dano(){
        return dano;
    }
    @Override
    public void actualizar() {

    }

    @Override
    public void mostrar() {

    }
    public Sprite obtenSprite() {
        return this.sprite;
    }

    
    
}
