package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.PlanetDTO;
import com.example.SpaceBack.dto.QueueItemDTO;
import com.example.SpaceBack.model.Planet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PlanetMapperTest {

    private Planet planet;
    private Set<QueueItemDTO> queueItemDTOs;
    private QueueItemDTO queueItemDTO1;
    private QueueItemDTO queueItemDTO2;

    @BeforeEach
    public void setUp() {
        queueItemDTO1 = new QueueItemDTO(
                "dto1",
                "url1",
                LocalDateTime.now(),
                LocalDateTime.now(),
                1);
        queueItemDTO2 = new QueueItemDTO(
                "dto2",
                "url2",
                LocalDateTime.now(),
                LocalDateTime.now(),
                10);
        queueItemDTOs = new HashSet<>();
        queueItemDTOs.add(queueItemDTO1);
        queueItemDTOs.add(queueItemDTO2);

        planet = Planet.builder()
                .id(UUID.randomUUID())
                .coordinateX(100)
                .coordinateY(200)
                .name("test")
                .currentMetalStock(500)
                .currentCristalStock(500)
                .currentDeuteriumStock(500)
                .currentEnergy(100)
                .refreshedAt(LocalDateTime.now())
                .build();
    }

    @Test
    public void planet_Should_Map_To_PlanetDTO() {
        // given
        PlanetDTO expected = new PlanetDTO(
                "test",
                100,
                200,
                queueItemDTOs);

        // when
        PlanetDTO result = PlanetMapper.INSTANCE_PLANET.planetToPlanetDTO(planet, queueItemDTOs);

        // then
        assertThat(result).isEqualTo(expected);
    }
}