package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.QueueItemDTO;
import com.example.SpaceBack.model.QueueItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QueueItemMapper {

    QueueItemMapper INSTANCE_QUEUE_ITEM = Mappers.getMapper(QueueItemMapper.class);

    // QueueItemDTO
    @Mapping(target = "constructionEndTime", source = "queueItem.constructionEndTime")
    @Mapping(target = "createdAt", source = "queueItem.createdAt")
    QueueItemDTO queueItemWithBuildingToQueueItemDTO(QueueItem queueItem, String name, String constructionURL, int buildingLevel);
}
