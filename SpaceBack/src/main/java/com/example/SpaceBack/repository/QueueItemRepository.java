package com.example.SpaceBack.repository;

import com.example.SpaceBack.model.QueueItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface QueueItemRepository extends JpaRepository<QueueItem, UUID> {
}
