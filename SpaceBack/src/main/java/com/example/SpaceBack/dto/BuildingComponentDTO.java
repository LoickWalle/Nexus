package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record BuildingComponentDTO(
        @NotNull
        Set<ProductionBuildingDTO> productionBuildingDTOs,
        @NotNull
        Set<StorageBuildingDTO> storageBuildingDTOs,
        @NotNull
        Set<QueueItemDTO> queueItemDTOS
) {
}
