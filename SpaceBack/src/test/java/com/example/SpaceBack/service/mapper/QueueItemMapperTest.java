package com.example.SpaceBack.service.mapper;

import com.example.SpaceBack.dto.QueueItemDTO;
import com.example.SpaceBack.model.QueueItem;
import com.example.SpaceBack.utils.enums.ConstructionType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class QueueItemMapperTest {

    QueueItem queueItem;
    LocalDateTime constructionEndTime;
    LocalDateTime createdAt;
    String name;
    String constructionURL;

    @BeforeEach
    public void setUp() {
        constructionEndTime = LocalDateTime.now();
        createdAt = LocalDateTime.now();
        queueItem = QueueItem.builder()
                .id(UUID.randomUUID())
                .idToBuild(UUID.randomUUID())
                .constructionEndTime(constructionEndTime)
                .createdAt(createdAt)
                .build();
        name = "test";
        constructionURL = "urlTest";
    }

    @Test
    public void queueItem_With_BuildingLevel_To_QueueItemDTO() {
        // given
        queueItem.setConstructionType(ConstructionType.BUILDING);
        int buildingLevel = 1;
        QueueItemDTO expected = new QueueItemDTO(
                name,
                constructionURL,
                constructionEndTime,
                createdAt,
                buildingLevel
        );

        // when
        QueueItemDTO result = QueueItemMapper.INSTANCE_QUEUE_ITEM.queueItemToQueueItemDTO(queueItem, name, constructionURL, buildingLevel);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void queueItem_Without_BuildingLevel_To_QueueItemDTO() {
        // given
        QueueItemDTO expected = new QueueItemDTO(
                name,
                constructionURL,
                constructionEndTime,
                createdAt,
                0
        );

        // when
        QueueItemDTO result = QueueItemMapper.INSTANCE_QUEUE_ITEM.queueItemToQueueItemDTO(queueItem, name, constructionURL);

        // then
        assertThat(result).isEqualTo(expected);
    }
}