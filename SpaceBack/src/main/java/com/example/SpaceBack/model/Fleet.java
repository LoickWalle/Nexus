package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class Fleet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String name;

    private int destinationX;

    private int destinationY;

    @DateTimeFormat
    private LocalDate arrivalTime;

    @OneToMany(mappedBy = "fleet")
    @Builder.Default
    private Set<FleetShip> fleetShips = new HashSet<>();


}
