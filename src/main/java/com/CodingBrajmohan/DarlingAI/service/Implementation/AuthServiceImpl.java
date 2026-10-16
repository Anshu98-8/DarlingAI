package com.CodingBrajmohan.DarlingAI.service.Implementation;

import com.CodingBrajmohan.DarlingAI.dto.auth.AuthResponse;
import com.CodingBrajmohan.DarlingAI.dto.auth.LoginRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.SignupRequest;
import com.CodingBrajmohan.DarlingAI.entity.User;
import com.CodingBrajmohan.DarlingAI.exception.BadRequestException;
import com.CodingBrajmohan.DarlingAI.mapper.UserMapper;
import com.CodingBrajmohan.DarlingAI.repository.UserRepository;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.AuthService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class AuthServiceImpl implements AuthService {

    UserRepository userRepository;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder;

    @Override
    public AuthResponse signup(SignupRequest request) {
        userRepository.findByUsername(request.username()).ifPresent(user -> {
            throw new BadRequestException("User already exists with username: "+request.username());
        });

        User user = userMapper.toEntity(request);
        user.setPassword(passwordEncoder.encode(request.password()));
        user = userRepository.save(user);

        return new AuthResponse("dummy", userMapper.toUserProfileResponse(user));
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
