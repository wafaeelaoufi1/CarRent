package com.example.entities;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@Accessors(chain = true) // Permet le chaînage des setters
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private String role;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> role);  // Role as an authority
    }

    @Override
    public String getPassword() {
        return password;  // Password field
    }

    @Override
    public String getUsername() {
        return email;  // Email as username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;  // Account not expired
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;  // Account not locked
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;  // Credentials not expired
    }

    @Override
    public boolean isEnabled() {
        return true;  // Account is enabled
    }
}
