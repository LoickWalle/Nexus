package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Defense;
import com.example.SpaceBack.model.Planet;
import com.example.SpaceBack.model.PlanetDefense;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class DefenseRepositoryTest {

    @Autowired
    private DefenseRepository classUnderTest;
    private Planet planet;
    private Defense defense;
    private PlanetDefense planetDefense;

    @BeforeEach
    public void setUp() {
        planet = Planet.builder()
                .id(UUID.fromString("a9159131-59e6-431b-b73b-0f29eb03631e"))
                .coordinateX(10)
                .coordinateY(20)
                .name("Planet Alpha")
                .currentMetalStock(500)
                .currentCristalStock(500)
                .currentDeuteriumStock(500)
                .currentEnergy(100)
                .refreshedAt(LocalDateTime.now())
                .build();
        defense = Defense.builder()
                .id(UUID.fromString("c15c23c4-419b-497a-a367-ddca79a2d12c"))
                .name("Laser Defense 1")
                .hitpoint(100)
                .attackPower(10)
                .costMetal(1000)
                .costCristal(500)
                .costDeuterium(0)
                .energyConsumption(1)
                .defenseAvatarURL("defense_Avatar_URL_Placeholder")
                .build();
        planetDefense = PlanetDefense.builder()
                .planet(planet)
                .defense(defense)
                .quantity(5)
                .build();
    }

    @Test
    public void should_return_All_PlanetDefenses_By_Planet_Coordinates() {
        // given
        Set<PlanetDefense> expected = new HashSet<>();
        expected.add(planetDefense);

        // when
        Set<PlanetDefense> result = classUnderTest.findAllPlanetDefensesByPlanetCoordinates(planet.getCoordinateX(), planet.getCoordinateY());

        // then
        assertThat(result).isEqualTo(expected);
    }
}