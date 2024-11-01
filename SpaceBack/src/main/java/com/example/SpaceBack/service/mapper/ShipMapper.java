package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.ShipDataDTO;
import com.example.SpaceBack.model.Ship;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShipMapper {
    ShipMapper INSTANCE_SHIP = Mappers.getMapper(ShipMapper.class);

    //ShipDataDTO
    ShipDataDTO shipToShipDataDTO(Ship ship);
}
