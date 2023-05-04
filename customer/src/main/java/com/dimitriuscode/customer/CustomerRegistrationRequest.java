package com.dimitriuscode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
