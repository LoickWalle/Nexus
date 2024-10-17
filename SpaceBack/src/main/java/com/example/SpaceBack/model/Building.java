package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    @JoinColumn(unique = true)
    private String name;
    @NotBlank
    private String description;
    @Positive
    private int level;
    @PositiveOrZero
    private int costMetal;
    @PositiveOrZero
    private int costCristal;
    @PositiveOrZero
    private int costDeuterium;
    @PositiveOrZero
    private int costEnergy;
}
