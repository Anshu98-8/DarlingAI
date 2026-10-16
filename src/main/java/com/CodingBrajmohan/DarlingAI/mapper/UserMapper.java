package com.CodingBrajmohan.DarlingAI.mapper;

import com.CodingBrajmohan.DarlingAI.dto.auth.SignupRequest;
import com.CodingBrajmohan.DarlingAI.dto.auth.UserProfileResponse;
import com.CodingBrajmohan.DarlingAI.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}
