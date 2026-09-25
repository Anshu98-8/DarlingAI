package com.CodingBrajmohan.DarlingAI.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
