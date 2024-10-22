package com.example.SpaceBack.dto;


public record ShipDto (
    String name,
    int hitpoint,
    int attackPower,
    long speed,
    int costMetal,
    int costCristal,
    int costDeuterium
){}
