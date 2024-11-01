package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.DefenseDataDTO;
import com.example.SpaceBack.model.Defense;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DefenseMapper {

    DefenseMapper INSTANCE_DEFENSE = Mappers.getMapper(DefenseMapper.class);

    // DefenseDataDTO
    DefenseDataDTO defenseToDefenseDataDTO(Defense defense);
}
