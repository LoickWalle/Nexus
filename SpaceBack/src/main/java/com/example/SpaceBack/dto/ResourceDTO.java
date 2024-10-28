package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

public record ResourceDTO(
    @NotNull
    ResourceCurrentDTO resourceCurrentDTO,
    @NotNull
    ResourceDetailDTO resourceDetailDTO
){}
