package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record DefenseDataDTO(
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
        long costEnergy,

        @NotBlank
        String defenseAvatarURL
) {
}