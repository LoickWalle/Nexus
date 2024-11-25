package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.PlanetDTO;
import com.example.SpaceBack.dto.QueueItemDTO;
import com.example.SpaceBack.model.Planet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper()
public interface PlanetMapper {

    PlanetMapper INSTANCE_PLANET = Mappers.getMapper(PlanetMapper.class);

    // PlanetDTO
    PlanetDTO planetToPlanetDTO(Planet planet, Set<QueueItemDTO> queueItemDTOs);
}
