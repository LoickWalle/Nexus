package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.DefenseDataDTO;
import com.example.SpaceBack.dto.DefensePlayerDTO;
import com.example.SpaceBack.model.Defense;
import com.example.SpaceBack.model.PlanetDefense;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class DefenseMapperTest {

    Defense defense;
    PlanetDefense planetDefense;

    @BeforeEach
    public void setUp() {
        defense = Defense.builder()
                .name("test")
                .hitpoint(100)
                .attackPower(10)
                .costMetal(1000)
                .costCristal(2000)
                .costDeuterium(3000)
                .costEnergy(100)
                .defenseAvatarURL("url")
                .build();
        planetDefense = PlanetDefense.builder()
                .defense(defense)
                .quantity(5)
                .build();
    }

    @Test
    public void defense_Should_Map_To_DefenseDataDTO() {
        // given
        DefenseDataDTO expected = new DefenseDataDTO("test",
                100,
                10,
                1000,
                2000,
                3000,
                100,
                "url");

        // when
        DefenseDataDTO result = DefenseMapper.INSTANCE_DEFENSE.defenseToDefenseDataDTO(defense);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void planetDefense_Should_Map_To_DefensePlayerDTO() {
        // given
        DefensePlayerDTO expected = new DefensePlayerDTO("test",
                100,
                10,
                1000,
                2000,
                3000,
                100,
                "url",
                5);

        // when
        DefensePlayerDTO result = DefenseMapper.INSTANCE_DEFENSE.planetDefenseToDefensePlayerDTO(planetDefense);

        // then
        assertThat(result).isEqualTo(expected);
    }

}