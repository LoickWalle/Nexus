package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.FleetComponentDTO;
import com.example.SpaceBack.dto.FleetDTO;

public interface FleetService {
    FleetDTO createFleet(FleetDTO fleetToCreate);
    FleetDTO updateFleet(FleetDTO fleetToUpdate);
    FleetDTO getById(FleetDTO fleetToFound);
    FleetDTO deleteFleet(FleetDTO fleetToDelete);
    FleetComponentDTO getAllFleet(FleetComponentDTO fleetsToFound);
}
