package com.email.api.model;

public record CustomerMessage(
        String firstName,
        String lastName,
        String email,
        String message
) {
}
