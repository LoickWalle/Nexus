package com.example.SpaceBack.service;

import com.example.SpaceBack.dto.ConstructionQueueItemDTO;

import java.util.Set;

public interface ConstructionQueueItemService {
    ConstructionQueueItemDTO createConstructionQueueItem(ConstructionQueueItemDTO constructionQueueItemToCreate);
    ConstructionQueueItemDTO deleteConstructionQueueItem(ConstructionQueueItemDTO constructionQueueItemToDelete);
    Set<ConstructionQueueItemDTO> getAllConstructionQueueItems();
}