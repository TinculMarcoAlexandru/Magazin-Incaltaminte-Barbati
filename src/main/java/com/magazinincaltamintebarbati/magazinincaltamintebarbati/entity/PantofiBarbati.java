package com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pantofi_barbati")
public class PantofiBarbati extends IncaltaminteBarbati {
    // Nou atribut specific (opțional)
    private boolean pieleNaturala;
    // Getter și Setter pentru noul atribut
    public boolean isPieleNaturala() {
        return pieleNaturala;
    }
    public void setPieleNaturala(boolean pieleNaturala) {
        this.pieleNaturala = pieleNaturala;
    }
    // Constructor gol (opțional)
    public PantofiBarbati() {
    }
}