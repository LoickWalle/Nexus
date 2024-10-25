package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;
import java.util.Set;

public record FleetComponentDto(
        @NotNull
        Set<FleetDto> FleetsDto,
        @NotNull
        Set<ConstructionQueueDto> ConstructionQueuesDto
) {
}
