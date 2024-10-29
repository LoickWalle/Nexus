package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.BuildingComponentDTO;

import java.util.UUID;

public interface BuildingService {

    BuildingComponentDTO getBuildingComponentDTOByPlanetId(UUID planetId);
}
