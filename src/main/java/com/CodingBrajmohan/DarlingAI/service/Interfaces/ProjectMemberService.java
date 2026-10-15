package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.members.InviteMemberRequest;
import com.CodingBrajmohan.DarlingAI.dto.members.MemberResponse;
import com.CodingBrajmohan.DarlingAI.dto.members.UpdateMemberRoleRequest;
import com.CodingBrajmohan.DarlingAI.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    void removeProjectMember(Long projectId, Long memberId, Long userId);
}
