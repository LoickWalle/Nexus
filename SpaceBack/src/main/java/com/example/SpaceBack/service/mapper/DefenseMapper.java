package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.DefenseDataDTO;
import com.example.SpaceBack.dto.DefensePlayerDTO;
import com.example.SpaceBack.model.Defense;
import com.example.SpaceBack.model.PlanetDefense;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DefenseMapper {

    DefenseMapper INSTANCE_DEFENSE = Mappers.getMapper(DefenseMapper.class);

    // DefenseDataDTO
    DefenseDataDTO defenseToDefenseDataDTO(Defense defense);

    // DefensePlayerDTO
    @Mapping(target = "name", source = "planetDefense.defense.name")
    @Mapping(target = "hitpoint", source = "planetDefense.defense.hitpoint")
    @Mapping(target = "attackPower", source = "planetDefense.defense.attackPower")
    @Mapping(target = "costMetal", source = "planetDefense.defense.costMetal")
    @Mapping(target = "costCristal", source = "planetDefense.defense.costCristal")
    @Mapping(target = "costDeuterium", source = "planetDefense.defense.costDeuterium")
    @Mapping(target = "costEnergy", source = "planetDefense.defense.costEnergy")
    @Mapping(target = "defenseAvatarURL", source = "planetDefense.defense.defenseAvatarURL")
    DefensePlayerDTO planetDefenseToDefensePlayerDTO(PlanetDefense planetDefense);
}
