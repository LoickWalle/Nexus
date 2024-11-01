package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.DefenseComponentDTO;
import com.example.SpaceBack.dto.DefenseDataDTO;

import java.util.Set;
import java.util.UUID;

public interface DefenseService {

    DefenseComponentDTO getDefenseComponentDTOByPlanetId(UUID planetId);

    DefenseDataDTO getDefenseByName(String name);
    Set<DefenseDataDTO> getAllDefenses();
}
