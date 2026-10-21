package com.CodingBrajmohan.DarlingAI.service.Implementation;




import com.CodingBrajmohan.DarlingAI.dto.chat.ChatResponse;
import com.CodingBrajmohan.DarlingAI.entity.ChatMessage;
import com.CodingBrajmohan.DarlingAI.entity.ChatSession;
import com.CodingBrajmohan.DarlingAI.entity.ChatSessionId;
import com.CodingBrajmohan.DarlingAI.mapper.ChatMapper;
import com.CodingBrajmohan.DarlingAI.repository.ChatMessageRepository;
import com.CodingBrajmohan.DarlingAI.repository.ChatSessionRepository;
import com.CodingBrajmohan.DarlingAI.security.AuthUtil;
import com.CodingBrajmohan.DarlingAI.service.Interfaces.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatSessionRepository chatSessionRepository;
    private final AuthUtil authUtil;
    private final ChatMapper chatMapper;

    @Override
    public List<ChatResponse> getProjectChatHistory(Long projectId) {
        Long userId = authUtil.getCurrentUserId();

        ChatSession chatSession = chatSessionRepository.getReferenceById(
                new ChatSessionId(projectId, userId)
        );

        List<ChatMessage> chatMessageList = chatMessageRepository.findByChatSession(chatSession);

        return chatMapper.fromListOfChatMessage(chatMessageList);
    }
}

