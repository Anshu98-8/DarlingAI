package com.CodingBrajmohan.DarlingAI.entity;


import com.CodingBrajmohan.DarlingAI.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
