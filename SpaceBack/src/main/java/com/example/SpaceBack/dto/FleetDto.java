package com.example.SpaceBack.dto;

import com.example.SpaceBack.model.FleetShip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


public record FleetDto (
        String name,
        int destinationX,
        int destinationY,
        LocalDate arrivalDate,
        Set<FleetShipDto> fleetShipsDto
)
{}
