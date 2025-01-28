package com.example.repositories;

import com.example.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
    List<Paiement> findByMethode(String methode);
    List<Paiement> findByStatut(String statut);
}
