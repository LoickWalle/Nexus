package com.example.SpaceBack.dto;

import jakarta.validation.constraints.PositiveOrZero;

public record ResourceCurrentDTO(
    @PositiveOrZero
    long currentMetal,
    @PositiveOrZero
    long currentCristal,
    @PositiveOrZero
    long currentDeuterium,
    @PositiveOrZero
    long currentEnergy
){}
