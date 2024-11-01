package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.ShipDataDTO;
import com.example.SpaceBack.dto.ShipPlayerDTO;
import com.example.SpaceBack.model.FleetShip;
import com.example.SpaceBack.model.Ship;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShipMapper {
    ShipMapper INSTANCE_SHIP = Mappers.getMapper(ShipMapper.class);

    //ShipDataDTO
    ShipDataDTO shipToShipDataDTO(Ship ship);

    //ShipPlayerDTO
    @Mapping(source = "fleetShip.quantity", target = "quantity")
    @Mapping(source = "fleetShip.ship.name", target = "name")
    @Mapping(source = "fleetShip.ship.hitpoint", target = "hitpoint")
    @Mapping(source = "fleetShip.ship.attackPower", target = "attackPower")
    @Mapping(source = "fleetShip.ship.speed", target = "speed")
    @Mapping(source = "fleetShip.ship.costMetal", target = "costMetal")
    @Mapping(source = "fleetShip.ship.costCristal", target = "costCristal")
    @Mapping(source = "fleetShip.ship.costDeuterium", target = "costDeuterium")
    @Mapping(source = "fleetShip.ship.shipAvatarURL", target = "shipAvatarURL")
    @Mapping(source = "fleetShip.ship.id", target = "id")
    ShipPlayerDTO shipToShipPlayerDTO(FleetShip fleetShip);
}
