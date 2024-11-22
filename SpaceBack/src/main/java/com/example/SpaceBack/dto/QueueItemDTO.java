package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public record QueueItemDTO(

        @NotBlank
        String name,

        @NotNull
        String constructionURL,

        @DateTimeFormat
        LocalDateTime constructionEndTime,

        @DateTimeFormat
        LocalDateTime createdAt,

        @PositiveOrZero
        int buildingLevel
) {
}
