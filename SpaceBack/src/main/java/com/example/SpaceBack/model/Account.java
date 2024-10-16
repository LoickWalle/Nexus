package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    @JoinColumn(unique = true)
    @Size(min = 4, max = 20)
    private String username;
    @NotBlank
    @Email
    @JoinColumn(unique = true)
    private String email;
    @NotBlank
    private String password;
    @DateTimeFormat
    private LocalDate createdAt;
    private String avatarUrl;

    @OneToMany(mappedBy = "owner")
    @Builder.Default
    private Set<Planet> planetsOwned = new HashSet<>();
}
