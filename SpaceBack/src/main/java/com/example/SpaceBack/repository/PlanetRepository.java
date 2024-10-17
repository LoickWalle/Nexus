package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, UUID> {
    Planet findByName(String name);
}
