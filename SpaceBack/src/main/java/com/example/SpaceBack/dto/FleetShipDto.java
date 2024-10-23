package com.example.SpaceBack.dto;

import jakarta.validation.constraints.PositiveOrZero;

public record FleetShipDto(
        FleetDto fleetDto,
        ShipDto shipDto,
        @PositiveOrZero
        int quantity
) {
}
