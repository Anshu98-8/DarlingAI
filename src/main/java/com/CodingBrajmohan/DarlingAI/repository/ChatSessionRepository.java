package com.CodingBrajmohan.DarlingAI.repository;

import com.CodingBrajmohan.DarlingAI.entity.ChatSession;
import com.CodingBrajmohan.DarlingAI.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}

