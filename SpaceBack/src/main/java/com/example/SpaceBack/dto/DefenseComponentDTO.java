package com.example.SpaceBack.dto;

import java.util.Set;

public record DefenseComponentDTO(
       Set<DefenseDTO> defenseDTOs,
       Set<ConstructionQueueItemDTO> constructionQueueItemDTOs
) {
}
