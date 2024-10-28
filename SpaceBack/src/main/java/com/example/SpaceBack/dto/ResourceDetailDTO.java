package com.example.SpaceBack.dto;

import jakarta.validation.constraints.PositiveOrZero;

public record ResourceDetailDTO(
    @PositiveOrZero
    long maxMetalCapacity,
    @PositiveOrZero
    long metalProductionRatePerHour,
    @PositiveOrZero
    long maxCristalCapacity,
    @PositiveOrZero
    long cristalProductionRatePerHour,
    @PositiveOrZero
    long maxDeuteriumCapacity,
    @PositiveOrZero
    long deuteriumProductionRatePerHour,
    @PositiveOrZero
    long energyProduction,
    @PositiveOrZero
    long energyConsumption
){}
