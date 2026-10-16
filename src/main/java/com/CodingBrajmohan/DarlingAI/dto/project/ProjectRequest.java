package com.CodingBrajmohan.DarlingAI.dto.project;

import jakarta.validation.constraints.NotBlank;

public record ProjectRequest(
        @NotBlank
        String name
) {
}
