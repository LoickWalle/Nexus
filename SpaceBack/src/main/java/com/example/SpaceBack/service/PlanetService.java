package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.PlanetDTO;
import com.example.SpaceBack.dto.ResourceCurrentDTO;
import com.example.SpaceBack.dto.ResourceDTO;
import com.example.SpaceBack.dto.ResourceDetailDTO;

import java.util.UUID;

public interface PlanetService {
    PlanetDTO getPlanetById(UUID planetId);
    PlanetDTO renamePlanet(PlanetDTO planetToUpdate);
    ResourceCurrentDTO getResourceCurrent(UUID planetId);
    ResourceDetailDTO getResourceDetail(UUID planetId);
    ResourceDTO getResource(UUID planetId);
}
