package com.CodingBrajmohan.DarlingAI.mapper;

import com.CodingBrajmohan.DarlingAI.dto.chat.ChatResponse;
import com.CodingBrajmohan.DarlingAI.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
