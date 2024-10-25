package com.example.SpaceBack.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AccountModifiedDto (
    String newUsername,
    @Email
    @NotBlank
    String email,
    String newPassword,
    String previousPassword,
    String newAvatarUrl,
    // for identification purpose (with email)
    @NotNull
    LocalDateTime createdAt
){}
