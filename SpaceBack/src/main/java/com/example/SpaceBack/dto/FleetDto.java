package com.example.SpaceBack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FleetDto {
    private String name;
    private int destinationX;
    private int destinationY;
    private LocalDate arrivalDate;
}
