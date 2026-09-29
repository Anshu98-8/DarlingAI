package com.CodingBrajmohan.DarlingAI.controller;

import com.CodingBrajmohan.DarlingAI.dto.auth.AuthResponse;
import com.CodingBrajmohan.DarlingAI.dto.auth.LoginRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.SignupRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.UserProfileResponse;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.AuthService;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthController {

    AuthService authService;
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(@RequestBody SignupRequest signupRequest) {
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile() {
        Long userId = 1L;
        return ResponseEntity.ok(userService.getProfile(userId));
    }


}
