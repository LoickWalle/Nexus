package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FleetRepository extends JpaRepository<Fleet, UUID> {
}
