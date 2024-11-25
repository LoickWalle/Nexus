package com.example.SpaceBack.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlanetMapper {

    PlanetMapper INSTANCE_PLANET = Mappers.getMapper(PlanetMapper.class);
}
