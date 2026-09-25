package com.CodingBrajmohan.DarlingAI.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
){

}
