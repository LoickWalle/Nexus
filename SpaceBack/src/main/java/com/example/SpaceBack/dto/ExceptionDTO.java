package com.example.SpaceBack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionDTO {
    private String message;
    private int status;
    private LocalDateTime dateTime;
}