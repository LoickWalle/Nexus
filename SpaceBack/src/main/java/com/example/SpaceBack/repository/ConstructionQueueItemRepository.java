package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.ConstructionQueueItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConstructionQueueItemRepository extends JpaRepository<ConstructionQueueItem, UUID> {
}
