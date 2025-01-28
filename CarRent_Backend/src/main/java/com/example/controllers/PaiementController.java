package com.example.controllers;
/*
import com.example.entities.Paiement;
import com.example.repositories.PaiementRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
public class PaiementController {

    private final PaiementRepository paiementRepository;

    public PaiementController(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @GetMapping
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paiement> getPaiementById(@PathVariable Long id) {
        return paiementRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return paiementRepository.save(paiement);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePaiement(@PathVariable Long id) {
        if (paiementRepository.existsById(id)) {
            paiementRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
*/