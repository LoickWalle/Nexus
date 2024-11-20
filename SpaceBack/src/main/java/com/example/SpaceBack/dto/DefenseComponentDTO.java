package com.example.SpaceBack.dto;

import java.util.Set;

public record DefenseComponentDTO(
       Set<DefensePlayerDTO> defensePlayerDTOs,
       Set<QueueItemDTO> queueItemDTOS
) {
}
