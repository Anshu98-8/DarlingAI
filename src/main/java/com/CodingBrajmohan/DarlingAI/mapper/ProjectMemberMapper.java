package com.CodingBrajmohan.DarlingAI.mapper;


import com.CodingBrajmohan.DarlingAI.dto.members.MemberResponse;
import com.CodingBrajmohan.DarlingAI.entity.ProjectMember;
import com.CodingBrajmohan.DarlingAI.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMemberMapper {

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "projectRole", constant = "OWNER")
    MemberResponse toProjectMemberResponseFromOwner(User owner);

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "username", source = "user.username")
    @Mapping(target = "name", source = "user.name")
    MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember);
}
