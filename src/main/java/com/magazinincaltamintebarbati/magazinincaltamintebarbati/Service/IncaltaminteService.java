package com.magazinincaltamintebarbati.magazinincaltamintebarbati.Service;

import com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity.IncaltaminteBarbati;
import com.magazinincaltamintebarbati.magazinincaltamintebarbati.model.IncaltaminteDTO;
import java.util.List;

public interface IncaltaminteService {
    IncaltaminteBarbati adauga(IncaltaminteDTO dto);
    List<IncaltaminteBarbati> getAll();
    List<IncaltaminteBarbati> filtrarePret(double pret);
    void sterge(Long id);
}