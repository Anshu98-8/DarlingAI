package com.CodingBrajmohan.DarlingAI.dto.chat;

import com.CodingBrajmohan.DarlingAI.entity.ChatEvent;
import com.CodingBrajmohan.DarlingAI.entity.ChatSession;
import com.CodingBrajmohan.DarlingAI.enums.MessageRole;

import java.time.Instant;
import java.util.List;

public record ChatResponse(
        Long id,
        MessageRole role,
        List<ChatEventResponse> events,
        String content,
        Integer tokensUsed,
        Instant createdAt

) {
}