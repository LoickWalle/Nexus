package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;


public record FleetDTO(
        @NotBlank
        UUID id,
        @NotBlank
        String name,
        int destinationX,
        int destinationY,
        @DateTimeFormat
        LocalDateTime arrivalDate,
        Set<ShipDTO> ShipDTOs
)
{}
