package com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "incaltaminte_barbati")
@Inheritance(strategy = InheritanceType.JOINED)
public  class IncaltaminteBarbati {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nume;
    private double pret;
    private int marime;
    private String tip; // Pantofi, Adidasi, Gheata
    public int getMarime() { return marime; }
    public void setMarime(int marime) { this.marime = marime; }
    public String getTip() { return tip; }
    public void setTip(String tip) { this.tip = tip; }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }
}