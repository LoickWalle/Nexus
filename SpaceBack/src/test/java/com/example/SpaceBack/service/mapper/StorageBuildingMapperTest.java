package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.StorageBuildingDTO;
import com.example.SpaceBack.model.StorageBuilding;
import com.example.SpaceBack.utils.enums.ResourceType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class StorageBuildingMapperTest {

    @Test
    public void storageBuilding_Should_Map_To_StorageBuildingDTO() {
        // given
        StorageBuilding storageBuilding = StorageBuilding.builder()
                .id(UUID.randomUUID())
                .name("building")
                .description("description")
                .level(1)
                .costMetal(100)
                .costCristal(100)
                .costDeuterium(100)
                .costEnergy(10)
                .buildingAvatarURL("url")
                .capacity(1000)
                .resourceType(ResourceType.METAL)
                .build();

        StorageBuildingDTO expected = new StorageBuildingDTO(
                "building",
                "description",
                1,
                100,
                100,
                100,
                10,
                1000,
                ResourceType.METAL
        );

        // when
        StorageBuildingDTO result = StorageBuildingMapper.INSTANCE_STORAGE_BUILDING.storageBuildingToStorageBuildingDTO(storageBuilding);

        // then
        assertThat(result).isEqualTo(expected);

    }

}