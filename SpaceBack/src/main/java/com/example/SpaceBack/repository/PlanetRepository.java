package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlanetRepository extends JpaRepository<Planet, UUID> {
    Planet findByName(String name);
}
