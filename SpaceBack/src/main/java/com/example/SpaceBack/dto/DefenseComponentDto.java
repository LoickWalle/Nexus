package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record DefenseComponentDto(
        @NotNull
        Set<DefenseDto> defensesDto,

        @NotNull
        Set<ConstructionQueueDto> constructionQueuesDto
) {
}
