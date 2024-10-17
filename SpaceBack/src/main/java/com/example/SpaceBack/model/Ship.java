package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ship {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String name;

    @PositiveOrZero
    private int hitpoint;

    @PositiveOrZero
    private int attackPower;

    @PositiveOrZero
    private long speed;

    @PositiveOrZero
    private int costMetal;

    @PositiveOrZero
    private int costCristal;

    @PositiveOrZero
    private int costDeuterium;

//    @OneToMany(mappedBy = "ship")
//    @Builder.Default
//    private Set<FleetShip> fleetShips = new HashSet<>();

}
