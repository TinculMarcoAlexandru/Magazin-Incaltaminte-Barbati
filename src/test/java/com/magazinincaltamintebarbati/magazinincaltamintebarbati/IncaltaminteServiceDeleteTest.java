package com.magazinincaltamintebarbati.magazinincaltamintebarbati;

import com.magazinincaltamintebarbati.magazinincaltamintebarbati.Service.IncaltaminteServiceImpl;
import com.magazinincaltamintebarbati.magazinincaltamintebarbati.repository.IncaltaminteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@ExtendWith(MockitoExtension.class)
public class IncaltaminteServiceDeleteTest {
    @Mock
    private IncaltaminteRepository repository;
    @InjectMocks
    private IncaltaminteServiceImpl service;
    @Test
    void testStergereProdus() {
        Long produsId = 10L;
        service.sterge(produsId);
        verify(repository, times(1)).deleteById(produsId);
    }
}