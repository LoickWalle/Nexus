package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.StorageBuildingDTO;
import com.example.SpaceBack.model.StorageBuilding;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StorageBuildingMapper {

    StorageBuildingMapper INSTANCE_STORAGE_BUILDING = Mappers.getMapper(StorageBuildingMapper.class);

    // StorageBuildingDTO
    @Mapping(target = "energyConsumption", source = "costEnergy")
    StorageBuildingDTO storageBuildingToStorageBuildingDTO(StorageBuilding storageBuilding);
}
