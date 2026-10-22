package com.CodingBrajmohan.DarlingAI.dto.project;

import com.CodingBrajmohan.DarlingAI.enums.ProjectRole;

import java.time.Instant;

public record ProjectSummaryResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        ProjectRole role
) {
}
