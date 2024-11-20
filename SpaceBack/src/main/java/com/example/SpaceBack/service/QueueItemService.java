package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.QueueItemDTO;

import java.util.Set;

public interface QueueItemService {
    QueueItemDTO createConstructionQueueItem(QueueItemDTO constructionQueueItemToCreate);
    QueueItemDTO deleteConstructionQueueItem(QueueItemDTO constructionQueueItemToDelete);
    Set<QueueItemDTO> getAllConstructionQueueItems();
}