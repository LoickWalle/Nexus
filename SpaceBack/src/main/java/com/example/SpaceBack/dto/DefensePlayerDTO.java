package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record DefensePlayerDTO(
        @NotBlank
        String name,

        @PositiveOrZero
        int hitpoint,

        @PositiveOrZero
        int attackPower,

        @PositiveOrZero
        long costMetal,

        @PositiveOrZero
        long costCristal,

        @PositiveOrZero
        long costDeuterium,

        @PositiveOrZero
        long energyConsumption,

        @NotBlank
        String defenseAvatarURL,

        @PositiveOrZero
        int quantity
) {
}