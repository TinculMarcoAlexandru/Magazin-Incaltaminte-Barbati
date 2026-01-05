package com.magazinincaltamintebarbati.magazinincaltamintebarbati.Service;

import com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity.IncaltaminteBarbati;
import com.magazinincaltamintebarbati.magazinincaltamintebarbati.model.IncaltaminteDTO;
import com.magazinincaltamintebarbati.magazinincaltamintebarbati.repository
        .IncaltaminteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
    public class IncaltaminteServiceImpl implements IncaltaminteService {
    private final IncaltaminteRepository repository;
    public IncaltaminteServiceImpl(IncaltaminteRepository repository) {
        this.repository = repository;
    }
    @Override
    public IncaltaminteBarbati adauga(IncaltaminteDTO dto) {
        IncaltaminteBarbati p = new IncaltaminteBarbati();
        p.setNume(dto.getNume());
        p.setPret(dto.getPret());
        p.setMarime(dto.getMarime());
        p.setTip(dto.getTip());
        return repository.save(p);
    }
    @Override
    public List<IncaltaminteBarbati> getAll() {
        return repository.findAll();
    }
    @Override
    public List<IncaltaminteBarbati> filtrarePret(double pret) {
        return repository.findAll()
                .stream()
                .filter(p -> p.getPret() >= pret)
                .toList();
    }
    @Override
    public void sterge(Long id) {
        repository.deleteById(id);
    }
}