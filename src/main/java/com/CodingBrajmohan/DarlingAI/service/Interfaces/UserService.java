package com.CodingBrajmohan.DarlingAI.service.Interfaces;
import com.CodingBrajmohan.DarlingAI.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
