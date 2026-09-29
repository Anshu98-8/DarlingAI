package com.CodingBrajmohan.DarlingAI.service.Implementation;

import com.CodingBrajmohan.DarlingAI.dto.auth.AuthResponse;
import com.CodingBrajmohan.DarlingAI.dto.auth.LoginRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.SignupRequest;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
