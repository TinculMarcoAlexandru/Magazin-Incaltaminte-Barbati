package com.magazinincaltamintebarbati.magazinincaltamintebarbati.Component;

import com.magazinincaltamintebarbati.magazinincaltamintebarbati.
        entity.IncaltaminteBarbati;
import com.magazinincaltamintebarbati.magazinincaltamintebarbati.
        repository.IncaltaminteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializareDate implements CommandLineRunner {
    private final IncaltaminteRepository repository;
    public InitializareDate(IncaltaminteRepository repository) {
        this.repository = repository;
    }
    @Override
    public void run(String... args) {
        IncaltaminteBarbati p1 = new IncaltaminteBarbati();
        p1.setNume("Pantofi piele barbati");
        p1.setPret(350);
        p1.setMarime(42);
        p1.setTip("Pantofi");
        IncaltaminteBarbati p2 = new IncaltaminteBarbati();
        p2.setNume("Adidasi sport barbati");
        p2.setPret(280);
        p2.setMarime(43);
        p2.setTip("Adidasi");
        repository.save(p1);
        repository.save(p2);
        repository.findAll()
                .stream()
                .filter(p -> p.getPret() > 300)
                .forEach(p -> System.out.println(
                        "Produs scump: " + p.getNume() + " - " + p.getPret()
                ));
    }
}