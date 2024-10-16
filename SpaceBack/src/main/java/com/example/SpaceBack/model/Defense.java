package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Defense {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JoinColumn(unique = true)
    @NotBlank
    private String name;

    @PositiveOrZero
    private int hitpoint;

    @PositiveOrZero
    private int attackPower;

    @PositiveOrZero
    private int costMetal;

    @PositiveOrZero
    private int costCristal;

    @PositiveOrZero
    private int costDeuterium;

    @PositiveOrZero
    private int costEnergy;

//    @OneToMany(mappedBy = "todo")
//    @Builder.Default
//    private Set<PlanetDefense> planetDefenses = new HashSet<>();
}
