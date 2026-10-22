package com.CodingBrajmohan.DarlingAI.service.Interfaces;

import com.CodingBrajmohan.DarlingAI.dto.chat.StreamResponse;
import reactor.core.publisher.Flux;

public interface AiGenerationService {
    Flux<StreamResponse> streamResponse(String message, Long projectId);
}
