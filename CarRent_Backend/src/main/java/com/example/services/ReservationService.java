package com.example.services;

import com.example.entities.Reservation;
import com.example.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    // Create a new reservation
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // Get all reservations
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    // Get a reservation by ID
    public Optional<Reservation> getReservationById(int reservationId) {
        return reservationRepository.findById(reservationId);
    }

    // Update a reservation
    public Reservation updateReservation(int reservationId, Reservation updatedReservation) {
        return reservationRepository.findById(reservationId).map(reservation -> {
            reservation.setVehicleId(updatedReservation.getVehicleId());
            reservation.setCustomerName(updatedReservation.getCustomerName());
            reservation.setCustomerEmail(updatedReservation.getCustomerEmail());
            reservation.setCustomerPhone(updatedReservation.getCustomerPhone());
            reservation.setStartDate(updatedReservation.getStartDate());
            reservation.setEndDate(updatedReservation.getEndDate());
            reservation.setStatus(updatedReservation.getStatus());
            return reservationRepository.save(reservation);
        }).orElseThrow(() -> new RuntimeException("Reservation not found with id: " + reservationId));
    }

    // Cancel a reservation
    public void cancelReservation(int reservationId) {
        reservationRepository.findById(reservationId).ifPresent(reservation -> {
            reservation.setStatus("Cancelled");
            reservationRepository.save(reservation);
        });
    }

    // Delete a reservation
    public void deleteReservation(int reservationId) {
        reservationRepository.deleteById(reservationId);
    }
}
