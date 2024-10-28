package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.DefenseComponentDTO;
import com.example.SpaceBack.dto.DefenseDTO;

import java.util.Set;
import java.util.UUID;

public interface DefenseService {

    DefenseComponentDTO getDefenseComponentDTOByPlanetId(UUID planetId);

    DefenseDTO getDefenseDTOByName(String name);
    Set<DefenseDTO> getAllDefenseDTOs();
}
