package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

public record ResourceDTO(
    @NotNull
    RessourceCurrentDTO ressourceCurrentDTO,
    @NotNull
    RessourceDetailDTO ressourceDetailDTO
){}
