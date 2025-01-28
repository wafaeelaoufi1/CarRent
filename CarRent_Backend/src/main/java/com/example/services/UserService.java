package com.example.services;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository utilisateurRepository;

    public User creerUtilisateur(User utilisateur) {
        return utilisateurRepository.save(utilisateur);  // Creates or updates user
    }

    public User obtenirUtilisateurParId(Long id) {
        return utilisateurRepository.findById(id).orElse(null);  // Finds user by ID
    }

    public Optional<User> obtenirUtilisateurParEmail(String email) {
        return utilisateurRepository.findByEmail(email);  // Finds user by email
    }

    public List<User> obtenirTousLesUtilisateurs() {
        return utilisateurRepository.findAll();  // Gets all users
    }
}
