package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanetDefense {

    @EmbeddedId
    private PlanetDefenseId id;

    @PositiveOrZero
    private int quantity;

    @ManyToOne
    @MapsId("planetId")
    private Planet planet;

    @ManyToOne
    @MapsId("defenseId")
    private Defense defense;

    // static nested class for embedded id
    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class PlanetDefenseId implements Serializable {

        private UUID planetId;
        private UUID defenseId;
    }
}
