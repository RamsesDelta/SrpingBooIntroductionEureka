package com.detalle.armas.models;

import com.commons.models.entity.Pistola;

public class Detalle {

    private Pistola pistola;
    private int letal;

    public Detalle(){ }

    public Detalle(Pistola pistola, int peso) {
        this.pistola = pistola;
        this.letal = peso;
    }

    public Pistola getPistola() {
        return pistola;
    }

    public void setPistola(Pistola pistola) {
        this.pistola = pistola;
    }

    public int getLetal() {
        return letal;
    }

    public void setLetal(int letal) {
        this.letal = letal;
    }

    public int getLetalidad(){
        return pistola.getCalibre() * letal;
    }
}
