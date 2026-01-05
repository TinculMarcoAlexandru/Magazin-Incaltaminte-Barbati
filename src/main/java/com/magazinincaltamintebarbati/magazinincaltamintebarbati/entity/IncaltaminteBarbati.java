package com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "incaltaminte barbati")
public class IncaltaminteBarbati extends Produs {
    private int marime;
    private String tip; // Pantofi, Adidasi, Gheata
    public int getMarime() { return marime; }
    public void setMarime(int marime) { this.marime = marime; }
    public String getTip() { return tip; }
    public void setTip(String tip) { this.tip = tip; }
}