package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShipRepository extends JpaRepository<Ship, UUID> {
}
