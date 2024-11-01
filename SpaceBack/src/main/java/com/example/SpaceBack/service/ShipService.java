package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.ShipDataDTO;
import com.example.SpaceBack.dto.ShipPlayerDTO;

import java.util.Set;

public interface ShipService {
    ShipDataDTO getShipByName(String name);
    Set<ShipDataDTO> getAllShips();
}
