package com.CodingBrajmohan.DarlingAI.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {

    Project project;

    User user;

    String title;

    Instant createdAt;
    Instant updatedAt;

    Instant deletedAt; //soft delete
}
