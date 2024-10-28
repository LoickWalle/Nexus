package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record HeaderDTO(
        @NotNull
        Set<AccountShortDTO> accountShortDTOs,

        @NotNull
        Set<ResourceDTO> resourceDTOs
) {
}
