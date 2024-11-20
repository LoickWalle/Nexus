package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.QueueItemDTO;

import java.util.Set;

public interface ConstructionQueueItemService {
    QueueItemDTO createConstructionQueueItem(QueueItemDTO constructionQueueItemToCreate);
    QueueItemDTO deleteConstructionQueueItem(QueueItemDTO constructionQueueItemToDelete);
    Set<QueueItemDTO> getAllConstructionQueueItems();
}