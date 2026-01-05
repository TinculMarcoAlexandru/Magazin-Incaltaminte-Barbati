package com.magazinincaltamintebarbati.magazinincaltamintebarbati.Controller;

import com.magazinincaltamintebarbati.magazinincaltamintebarbati.Service.IncaltaminteService;
import com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity.IncaltaminteBarbati;
import com.magazinincaltamintebarbati.magazinincaltamintebarbati.model.IncaltaminteDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/incaltaminte")
@Tag(name = "Magazin Incaltaminte Barbati", description =
        "Logica de business pentru incaltaminte")
public class IncaltaminteController {
    private final IncaltaminteService service;
    public IncaltaminteController(IncaltaminteService service) {
        this.service = service;
    }
    @Operation(summary = "Adauga incaltaminte")
    @PostMapping("/{id}")
    public IncaltaminteBarbati create(@RequestBody IncaltaminteDTO dto) {
        return service.adauga(dto);
    }
    @Operation(summary = "Afiseaza toate produsele")
    @GetMapping("/{id}")
    public List<IncaltaminteBarbati> getAll() {
        return service.getAll();
    }
    @Operation(summary = "Filtrare dupa pret")
    @GetMapping("/pret/{valoare}")
    public List<IncaltaminteBarbati> filtrare(@PathVariable double valoare) {
        return service.filtrarePret(valoare);
    }
    @Operation(summary = "Stergere produs")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.sterge(id);
    }
}