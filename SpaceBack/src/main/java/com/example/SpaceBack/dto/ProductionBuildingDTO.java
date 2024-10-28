package com.example.SpaceBack.dto;

import com.example.SpaceBack.utils.enums.ResourceType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record ProductionBuildingDTO(
        @NotBlank
        String name,
        @NotBlank
        String description,
        @Positive
        int level,
        @PositiveOrZero
        long costMetal,
        @PositiveOrZero
        long costCristal,
        @PositiveOrZero
        long costDeuterium,
        @PositiveOrZero
        long energyConsumption,
        @PositiveOrZero
        long productionRate,
        @NotNull
        ResourceType resourceType
) {
}
