package com.example.eventplanner.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record CreateEventRequest(
        @NotBlank
        String title,

        String description,

        @NotBlank
        String organizerName,

        @NotBlank
        @Email
        String organizerEmail
) {}