package com.example.SpaceBack.model;

import com.example.SpaceBack.utils.enums.ResourceType;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductionBuilding extends Building {
    @PositiveOrZero
    private int productionRate;
    @NotNull
    private ResourceType resourceType;
}
