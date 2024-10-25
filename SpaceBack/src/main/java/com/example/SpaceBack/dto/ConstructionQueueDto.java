package com.example.SpaceBack.dto;

import jakarta.validation.constraints.Positive;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public record ConstructionQueueDto(
        String buildingUrl,

        @Positive
        int buildingLevel,

        @DateTimeFormat
        LocalDateTime constructionEndTime
) {
}
