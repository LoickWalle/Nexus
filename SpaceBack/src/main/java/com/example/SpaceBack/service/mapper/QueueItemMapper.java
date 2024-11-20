package com.example.SpaceBack.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QueueItemMapper {

    QueueItemMapper INSTANCE_QUEUE_ITEM = Mappers.getMapper(QueueItemMapper.class);
}
