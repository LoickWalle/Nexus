package com.example.SpaceBack.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AccountDTO(
    @NotBlank
    String username,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String avatarURL,
    @NotNull
    LocalDateTime createdAt
){}
