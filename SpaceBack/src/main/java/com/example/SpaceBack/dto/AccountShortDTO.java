package com.example.SpaceBack.dto;

import jakarta.validation.constraints.NotBlank;

public record AccountShortDTO (
    @NotBlank
    String username,
    @NotBlank
    String avatarURL
){}
