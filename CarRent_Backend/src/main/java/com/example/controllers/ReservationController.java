package com.example.controllers;

import com.example.entities.Reservation;
import com.example.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
@CrossOrigin(origins = "http://localhost:5173")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    // Create a new reservation
    @PostMapping
    @CrossOrigin
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        return ResponseEntity.ok(reservationService.createReservation(reservation));
    }

    // Get all reservations
    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations() {
        return ResponseEntity.ok(reservationService.getAllReservations());
    }

    // Get a reservation by ID
    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable int id) {
        return reservationService.getReservationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update a reservation
    @PutMapping("/{id}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable int id, @RequestBody Reservation updatedReservation) {
        try {
            return ResponseEntity.ok(reservationService.updateReservation(id, updatedReservation));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Cancel a reservation
    @PatchMapping("/{id}/cancel")
    public ResponseEntity<Void> cancelReservation(@PathVariable int id) {
        reservationService.cancelReservation(id);
        return ResponseEntity.noContent().build();
    }

    // Delete a reservation
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable int id) {
        reservationService.deleteReservation(id);
        return ResponseEntity.noContent().build();
    }
}
