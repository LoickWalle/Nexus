package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;
import java.util.Set;

public record FleetComponentDTO(
        @NotNull
        Set<FleetDTO> FleetDTOs,
        @NotNull
        Set<ConstructionQueueDTO> ConstructionQueueDTOs
) {
}
