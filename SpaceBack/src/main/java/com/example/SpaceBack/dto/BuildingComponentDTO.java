package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record BuildingComponentDTO(
        @NotNull
        Set<ProductionBuildingDTO> productionBuildingDTOS,
        @NotNull
        Set<StorageBuildingDTO> storageBuildingDTOS,
        @NotNull
        Set<ConstructionQueueDTO> constructionQueueDTOS
) {
}
