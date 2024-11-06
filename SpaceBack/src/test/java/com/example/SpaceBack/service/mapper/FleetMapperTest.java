package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.FleetDTO;
import com.example.SpaceBack.dto.ShipPlayerDTO;
import com.example.SpaceBack.model.Fleet;
import com.example.SpaceBack.model.FleetShip;
import com.example.SpaceBack.model.Ship;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FleetMapperTest {

    @Test
    public void fleet_Should_Map_To_FleetDTO() {

        //given
        LocalDateTime arrival =  LocalDateTime.now();
        UUID identifiant1 = UUID.randomUUID();
        UUID identifiant2 = UUID.randomUUID();
        UUID identifiant3 = UUID.randomUUID();
        UUID identifiant4 = UUID.randomUUID();
        UUID identifiant5 = UUID.randomUUID();

        Ship ship1 = Ship.builder()
                .id(identifiant1)
                .name("toto")
                .hitpoint(25)
                .attackPower(10)
                .speed(150)
                .costMetal(40)
                .costCristal(45)
                .costDeuterium(35)
                .shipAvatarURL("shipurl1")
                .build();

        ShipPlayerDTO ship1DTO = new ShipPlayerDTO(
                "toto",
                25,
                10,
                150,
                40,
                45,
                35,
                "shipurl1",
                5
        );

        Ship ship2 = Ship.builder()
                .id(identifiant2)
                .name("tutu")
                .hitpoint(2)
                .attackPower(100)
                .speed(15)
                .costMetal(4)
                .costCristal(5)
                .costDeuterium(350)
                .shipAvatarURL("shipurl2")
                .build();

        ShipPlayerDTO ship2DTO = new ShipPlayerDTO(
                "tutu",
                2,
                100,
                15,
                4,
                5,
                350,
                "shipurl2",
                3
        );

        Fleet fleet = Fleet.builder()
                .id(identifiant3)
                .name("nomDelaFlotte")
                .destinationX(15)
                .destinationY(20)
                .arrivalTime(arrival)
                .build();

        FleetShip fleetShip1 = FleetShip.builder()
                .id(identifiant4)
                .fleet(fleet)
                .ship(ship1)
                .quantity(5)
                .build();

        FleetShip fleetShip2 = FleetShip.builder()
                .id(identifiant5)
                .fleet(fleet)
                .ship(ship2)
                .quantity(3)
                .build();

        Set<FleetShip> fleetShips = new HashSet<>();
        fleetShips.add(fleetShip1);
        fleetShips.add(fleetShip2);

        fleet.setFleetShips(fleetShips);

        Set<ShipPlayerDTO> shipDTOs = new HashSet<>();
        shipDTOs.add(ship1DTO);
        shipDTOs.add(ship2DTO);

        FleetDTO expected = new FleetDTO(
                identifiant3,
                "nomDelaFlotte",
                15,
                20,
                arrival,
                shipDTOs
                );

        //when
        System.out.println(fleet.getArrivalTime());
        FleetDTO result = FleetMapper.INSTANCE_FLEET.fleetToFleetDTO(fleet);

        //then
        assertEquals(expected, result);
    }

}