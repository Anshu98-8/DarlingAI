package com.CodingBrajmohan.DarlingAI.dto.project;

import com.CodingBrajmohan.DarlingAI.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
