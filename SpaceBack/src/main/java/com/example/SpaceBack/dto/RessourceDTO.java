package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

public record RessourceDTO (
    @NotNull
    RessourceCurrentDTO ressourceCurrentDTO,
    @NotNull
    RessourceDetailDTO ressourceDetailDTO
){}