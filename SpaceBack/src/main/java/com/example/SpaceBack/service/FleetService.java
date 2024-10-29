package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.AccountDTO;
import com.example.SpaceBack.dto.AccountShortDTO;
import com.example.SpaceBack.dto.FleetComponentDTO;
import com.example.SpaceBack.dto.FleetDTO;

import java.util.UUID;

public interface FleetService {
    FleetDTO createFleet(FleetDTO fleetToCreate);
    FleetDTO updateFleet(FleetDTO fleetToUpdate);
    FleetDTO getFleetById(UUID fleetId);
    FleetDTO deleteFleet(FleetDTO fleetToDelete);

    FleetComponentDTO getFleetComponentByAccount(AccountShortDTO accountToFind);
}
