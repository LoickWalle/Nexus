package com.example.SpaceBack.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record FleetShipDto(
        ShipDto shipDto,
        @PositiveOrZero
        int quantity
) {
}
