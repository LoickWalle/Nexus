package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record PlanetDTO (
    @NotBlank
    String name,
    long coordinateX,
    long coordinateY,
    @NotNull
    Set<ConstructionQueueDto> queueDTOs
){}