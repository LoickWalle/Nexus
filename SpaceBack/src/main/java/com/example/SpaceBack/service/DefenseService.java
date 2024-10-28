package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.DefenseComponentDTO;

import java.util.Set;

public interface DefenseService {

    DefenseComponentDTO getDefenseComponentDTOByName(String name);
    Set<DefenseComponentDTO> getAllDefenseComponentDTOs();
}
