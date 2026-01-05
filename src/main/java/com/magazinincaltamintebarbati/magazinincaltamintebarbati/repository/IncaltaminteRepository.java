package com.magazinincaltamintebarbati.magazinincaltamintebarbati.repository;

import com.magazinincaltamintebarbati.magazinincaltamintebarbati.entity.IncaltaminteBarbati;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncaltaminteRepository extends JpaRepository<IncaltaminteBarbati, Long> {
    List<IncaltaminteBarbati> findByTip(String tip);
}