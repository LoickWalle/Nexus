package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.FleetDTO;
import com.example.SpaceBack.model.Fleet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FleetMapper {
    AccountMapper INSTANCE_FLEET = Mappers.getMapper(AccountMapper.class);

    //FleetDTO
    @Mapping(source = "ShipPlayerDTO.fleetShipToShipPlayerDTO", target = "ShipDTOs")
    FleetDTO fleetToFleetDTO(Fleet fleet);
}
