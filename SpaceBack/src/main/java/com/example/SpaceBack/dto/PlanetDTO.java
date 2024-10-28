package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record PlanetDTO (
    @NotBlank
    @Size(max = 20)
    String name,
    long coordinateX,
    long coordinateY,
    @NotNull
    Set<ConstructionQueueDTO> queueDTOs
){}
