package com.example.SpaceBack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int coordinateX;

    private int coordinateY;

    @NotBlank
    @Size(max = 20)
    private String name;

    @ColumnDefault("100")
    @PositiveOrZero
    private long currentMetalStock;

    @ColumnDefault("100")
    @PositiveOrZero
    private long currentCristalStock;

    @ColumnDefault("100")
    @PositiveOrZero
    private long currentDeuteriumStock;

    @ColumnDefault("50")
    private long currentEnergy;

    @DateTimeFormat
    private LocalDateTime refreshedAt;

    @ManyToOne
    private Account owner;

    @OneToMany(mappedBy = "planet")
    @Builder.Default
    private Set<QueueItem> queueItems = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "planet_building",
            joinColumns = @JoinColumn(name = "planet_id"),
            inverseJoinColumns = @JoinColumn(name = "building_id")
    )
    @Builder.Default
    private Set<Building> buildings = new HashSet<>();

    @OneToMany(mappedBy = "planet")
    @Builder.Default
    private Set<PlanetDefense> planetDefenses = new HashSet<>();
}
