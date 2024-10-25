package com.example.SpaceBack.dto;

import jakarta.validation.constraints.PositiveOrZero;

public record RessourceCurrentDTO (
    @PositiveOrZero
    long currentMetal,
    @PositiveOrZero
    long currentCristal,
    @PositiveOrZero
    long currentDeuterium,
    @PositiveOrZero
    long currentEnergy
){}
