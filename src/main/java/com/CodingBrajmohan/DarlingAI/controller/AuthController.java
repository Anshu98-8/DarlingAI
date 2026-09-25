package com.CodingBrajmohan.DarlingAI.controller;

import com.CodingBrajmohan.DarlingAI.dto.auth.AuthResponse;
import com.CodingBrajmohan.DarlingAI.dto.auth.LoginRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.SignupRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.UserProfileResponse;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.AuthService;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest signupRequest){
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }


}
