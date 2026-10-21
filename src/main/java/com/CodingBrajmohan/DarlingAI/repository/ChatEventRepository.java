package com.CodingBrajmohan.DarlingAI.repository;


import com.CodingBrajmohan.DarlingAI.entity.ChatEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatEventRepository extends JpaRepository<ChatEvent, Long> {
}
