package com.example.SpaceBack.model;

import com.example.SpaceBack.utils.enums.ConstructionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConstructionQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private UUID idToBuild;
    private ConstructionType constructionType;
    @DateTimeFormat
    private LocalDate constructionEndTime;

    @ManyToOne
    private Planet planet;
}
