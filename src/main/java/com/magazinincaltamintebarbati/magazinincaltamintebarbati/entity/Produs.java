package com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "produse")
@Inheritance(strategy = InheritanceType.JOINED)
public class Produs {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @jakarta.persistence.Id
    private Long id;
    private String nume;
    private double pret;
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }
    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }
}