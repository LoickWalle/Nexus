package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.FleetDTO;
import com.example.SpaceBack.model.Fleet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FleetMapper {
    FleetMapper INSTANCE_FLEET = Mappers.getMapper(FleetMapper.class);

    //FleetDTO
    @Mapping(source = "ShipPlayerDTO.fleetShipToShipPlayerDTO", target = "ShipDTOs")
    FleetDTO fleetToFleetDTO(Fleet fleet);
}
