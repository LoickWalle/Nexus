package com.example.SpaceBack.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record ShipDto (
    @NotBlank
    String name,
    @PositiveOrZero
    int hitpoint,
    @PositiveOrZero
    int attackPower,
    @PositiveOrZero
    long speed,
    @PositiveOrZero
    int costMetal,
    @PositiveOrZero
    int costCristal,
    @PositiveOrZero
    int costDeuterium
){}
