package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.auth.AuthResponse;
import com.CodingBrajmohan.DarlingAI.dto.auth.LoginRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
