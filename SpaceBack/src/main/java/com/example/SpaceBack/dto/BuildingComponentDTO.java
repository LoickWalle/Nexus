package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record BuildingComponentDTO(
        @NotNull
        Set<ProductionBuildingDto> productionBuildingDTOs,
        @NotNull
        Set<StorageBuildingDto> storageBuildingDTOs,
        @NotNull
        Set<ConstructionQueueDto> constructionQueueDTOs
) {
}
