package com.example.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double montant;
    private String methode;
    private String statut;

    // Define the OneToOne relationship with Reservation
    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;

}
