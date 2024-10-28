package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;
import java.util.Set;

public record FleetComponentDTO(
        @NotNull
        Set<FleetDTO> FleetsDTO,
        @NotNull
        Set<ConstructionQueueDTO> ConstructionQueuesDTO
) {
}
