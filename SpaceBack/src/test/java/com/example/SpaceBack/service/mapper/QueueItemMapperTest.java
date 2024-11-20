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
import static org.junit.jupiter.api.Assertions.*;

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
    public void queueItem_With_Building_To_QueueItemDTO() {
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
        QueueItemDTO result = QueueItemMapper.INSTANCE_QUEUE_ITEM.queueItemWithBuildingToQueueItemDTO(queueItem, name, constructionURL, buildingLevel);

        // then
        assertThat(result).isEqualTo(expected);
    }
}