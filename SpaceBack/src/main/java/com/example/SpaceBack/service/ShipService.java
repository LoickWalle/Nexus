package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.ShipDTO;
import com.example.SpaceBack.model.Ship;

import java.util.Set;

public interface ShipService {
    ShipDTO getShipByName(String name);
    Set<ShipDTO> getAllShips();
}
