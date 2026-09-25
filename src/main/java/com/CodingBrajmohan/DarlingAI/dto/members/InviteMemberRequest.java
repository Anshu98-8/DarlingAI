package com.CodingBrajmohan.DarlingAI.dto.members;

import com.CodingBrajmohan.DarlingAI.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
