package com.example.SpaceBack.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DefenseMapper {

    DefenseMapper INSTANCE_DEFENSE = Mappers.getMapper(DefenseMapper.class);
}
