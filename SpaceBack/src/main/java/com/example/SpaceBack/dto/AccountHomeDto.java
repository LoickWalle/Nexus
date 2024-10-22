package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AccountHomeDto(
        @NotBlank
        @Size(min = 4, max = 20)
        String username,

        String avatarUrl
//        Set<PlanetDto> ownedPlanets
) {
}
