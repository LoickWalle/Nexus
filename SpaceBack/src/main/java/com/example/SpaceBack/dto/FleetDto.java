package com.example.SpaceBack.dto;

import com.example.SpaceBack.model.FleetShip;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;


public record FleetDto (
        @NotBlank
        UUID id,
        @NotBlank
        String name,
        int destinationX,
        int destinationY,
        @DateTimeFormat
        LocalDate arrivalDate,
        Set<FleetShipDto> fleetShipsDto
)
{}
