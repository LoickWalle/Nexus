package com.example.SpaceBack.dto;


import java.util.Set;

public record FleetComponentDto(
        Set<FleetDto> FleetsDto,
        Set<ConstructionQueueDto> ConstructionQueuesDto
) {
}
