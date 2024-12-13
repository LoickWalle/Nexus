package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.DefenseComponentDTO;
import com.example.SpaceBack.dto.DefenseDataDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface DefenseService {

    DefenseComponentDTO getDefenseComponentDTOByPlanetCoordinates(int coordinateX, int coordinateY);

    Optional<DefenseDataDTO> getDefenseByName(String name);

    Page<DefenseDataDTO> getAllDefenses(Pageable pageable);
}
