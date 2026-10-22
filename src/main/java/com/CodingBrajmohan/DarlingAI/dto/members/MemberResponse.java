package com.CodingBrajmohan.DarlingAI.dto.members;


import com.CodingBrajmohan.DarlingAI.enums.ProjectRole;
import java.time.Instant;

public record MemberResponse(
        Long userId,
        String username,
        String name,
        ProjectRole role,
        Instant invitedAt
) {
}

