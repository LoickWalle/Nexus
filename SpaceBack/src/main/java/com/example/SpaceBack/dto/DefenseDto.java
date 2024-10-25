package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record DefenseDto(
        @NotBlank
        String name,

        @PositiveOrZero
        int hitpoint,

        @PositiveOrZero
        int attackPower,

        @PositiveOrZero
        int costMetal,

        @PositiveOrZero
        int costCristal,

        @PositiveOrZero
        int costDeuterium,

        @PositiveOrZero
        int costEnergy,

        @PositiveOrZero
        int quantity
) {
}
