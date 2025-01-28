package com.example.responses;

public class LoginResponse {
    private String token;
    private long expiresIn;

    public LoginResponse setToken(String token) {
        this.token = token;
        return this; // Enables chaining
    }

    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this; // Enables chaining
    }

    // Optionally, include getters
    public String getToken() {
        return token;
    }

    public long getExpiresIn() {
        return expiresIn;
    }
}

