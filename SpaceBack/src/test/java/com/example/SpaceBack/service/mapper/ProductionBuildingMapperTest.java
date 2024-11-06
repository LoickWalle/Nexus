package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.ProductionBuildingDTO;
import com.example.SpaceBack.model.ProductionBuilding;
import com.example.SpaceBack.utils.enums.ResourceType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductionBuildingMapperTest {

    @Test
    public void productionBuilding_Should_Map_To_ProductionBuildingDTO() {
        //given
        ResourceType myResource = ResourceType.METAL;

        ProductionBuilding productionBuilding = ProductionBuilding.builder()
                .id(UUID.randomUUID())
                .name("toto")
                .description("un building pour produire")
                .level(5)
                .costMetal(500)
                .costCristal(12)
                .costDeuterium(25)
                .costEnergy(666)
                .buildingAvatarURL("adresse de image")
                .productionRate(11)
                .resourceType(myResource)
                .build();

        ProductionBuildingDTO expected = new ProductionBuildingDTO(
                "toto",
                "un building pour produire",
                5,
                500,
                12,
                25,
                666,
                11,
                myResource
        );

        //when
        ProductionBuildingDTO result = ProductionBuildingMapper.INSTANCE_PRODUCTION_BUILDING.productionBuildingToProductionBuildingDTO(productionBuilding);

        //then
        assertEquals(expected, result);
    }

}