package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public record ShipDataDTO(
        @NotBlank
        String name,
        @PositiveOrZero
        int hitpoint,
        @PositiveOrZero
        int attackPower,
        @PositiveOrZero
        long speed,
        @PositiveOrZero
        long costMetal,
        @PositiveOrZero
        long costCristal,
        @PositiveOrZero
        long costDeuterium,
        @NotBlank
        String shipAvatarURL
) {
}
