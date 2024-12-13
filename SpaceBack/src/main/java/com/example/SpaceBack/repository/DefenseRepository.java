package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.Defense;
import com.example.SpaceBack.model.PlanetDefense;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Repository
public interface DefenseRepository extends JpaRepository<Defense, UUID> {
    // 1) sous-requête id planet
    // 2) requête defense by planet (planetdefense) id
    @Transactional
    @Query(value = "select pd from PlanetDefense pd where pd.planet.coordinateX = :coordinateX and pd.planet.coordinateY = :coordinateY")
    Set<PlanetDefense> findAllPlanetDefensesByPlanetCoordinates(int coordinateX, int coordinateY);

    Optional<Defense> findDefenseByName(@NotBlank String name);
}
