package com.example.SpaceBack.model;

import com.example.SpaceBack.utils.enums.ConstructionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueueItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID idToBuild;
    private ConstructionType constructionType;
    @DateTimeFormat
    private LocalDateTime constructionEndTime;
    @DateTimeFormat
    private LocalDateTime createdAt;

    @ManyToOne
    private Planet planet;
}
