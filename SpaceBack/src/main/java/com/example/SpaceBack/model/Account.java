package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
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

    //@OneToMany(mappedBy = "owner")
    //private Set<Planet> planetsOwned;
}
