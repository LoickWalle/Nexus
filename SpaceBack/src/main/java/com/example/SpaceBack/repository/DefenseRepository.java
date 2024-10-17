package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Defense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DefenseRepository extends JpaRepository<Defense, UUID> {
}
