package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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

        @Positive
        int buildingLevel
) {
}
