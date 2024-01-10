package com.email.api.model;

public record CustomerOrder(
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String carMake,
        String carModel,
        String carYear
) {
}
