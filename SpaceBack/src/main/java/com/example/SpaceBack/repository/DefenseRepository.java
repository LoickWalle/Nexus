package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Defense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DefenseRepository extends JpaRepository<Defense, UUID> {
}
