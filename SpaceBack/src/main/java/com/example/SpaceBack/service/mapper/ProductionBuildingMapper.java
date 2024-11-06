package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.ProductionBuildingDTO;
import com.example.SpaceBack.model.ProductionBuilding;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductionBuildingMapper {
    ProductionBuildingMapper INSTANCE_PRODUCTION_BUILDING = Mappers.getMapper(ProductionBuildingMapper.class);


    @Mapping(source = "costEnergy", target = "energyConsumption")
    ProductionBuildingDTO productionBuildingToProductionBuildingDTO(ProductionBuilding productionBuilding);
}
