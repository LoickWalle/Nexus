package com.example.SpaceBack.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StorageBuildingMapper {

    StorageBuildingMapper INSTANCE_STORAGE_BUILDING = Mappers.getMapper(StorageBuildingMapper.class);
}
