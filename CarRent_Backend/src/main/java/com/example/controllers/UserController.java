package com.example.controllers;

import com.example.entities.User;
import com.example.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    // Create a custom response with a message and the user object
                    Map<String, Object> response = new HashMap<>();
                    response.put("message", "User found successfully");
                    response.put("user", user);
                    return ResponseEntity.ok(response); // Return 200 OK with the response
                })
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(Map.of("message", "User not found"))); // Return 404 NOT FOUND with a message
    }

    @CrossOrigin
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
