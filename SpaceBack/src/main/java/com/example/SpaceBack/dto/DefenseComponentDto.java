package com.example.SpaceBack.dto;

import java.util.Set;

public record DefenseComponentDto(
       Set<DefenseDto> defensesDto,
       Set<ConstructionQueueDto> constructionQueuesDto
) {
}
