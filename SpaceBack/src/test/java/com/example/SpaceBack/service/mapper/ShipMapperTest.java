package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.ShipDataDTO;
import com.example.SpaceBack.dto.ShipPlayerDTO;
import com.example.SpaceBack.model.FleetShip;
import com.example.SpaceBack.model.Ship;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShipMapperTest {

    Ship ship;
    FleetShip fleetShip;

    @BeforeEach
    public void setUp() {

        ship = Ship.builder()
                .id(UUID.randomUUID())
                .name("toto")
                .hitpoint(25)
                .attackPower(10)
                .speed(150)
                .costMetal(40)
                .costCristal(45)
                .costDeuterium(35)
                .shipAvatarURL("shipurl")
                .build();

        fleetShip = FleetShip.builder()
                .ship(ship)
                .quantity(5)
                .build();
    }

    @Test
    public void ship_Should_Map_To_ShipDataDTO() {
        //given
        ShipDataDTO expected = new ShipDataDTO(
                "toto",
                25,
                10,
                150,
                40,
                45,
                35,
                "shipurl");
        //when
        ShipDataDTO result = ShipMapper.INSTANCE_SHIP.shipToShipDataDTO(ship);

        //then
        assertEquals(expected, result);
    }

    @Test
    public void fleetShip_Should_Map_To_ShipPlayerDTO() {
        //given
        ShipPlayerDTO expected = new ShipPlayerDTO(
                "toto",
                25,
                10,
                150,
                40,
                45,
                35,
                "shipurl",
                5
        );
        //when
        ShipPlayerDTO result = ShipMapper.INSTANCE_SHIP.fleetShipToShipPlayerDTO(fleetShip);

        //then
        assertEquals(expected, result);
    }
}