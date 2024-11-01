package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.ShipPlayerDTO;

import java.util.Set;

public interface ShipService {
    ShipPlayerDTO getShipByName(String name);
    Set<ShipPlayerDTO> getAllShips();
}
