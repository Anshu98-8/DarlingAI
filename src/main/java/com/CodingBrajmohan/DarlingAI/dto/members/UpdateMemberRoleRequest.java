package com.CodingBrajmohan.DarlingAI.dto.members;

import com.CodingBrajmohan.DarlingAI.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull
        ProjectRole role

) {
}
