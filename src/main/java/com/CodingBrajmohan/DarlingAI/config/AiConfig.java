package com.CodingBrajmohan.DarlingAI.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.Duration;
import org.springframework.ai.openai.OpenAiChatOptions;

//@Configuration
//public class AiConfig {
//
//    @Bean
//    public ChatClient chatClient(ChatClient.Builder builder) {
//        return  builder
//                .defaultAdvisors(
//                        new SimpleLoggerAdvisor()
//                )
//                .build();
//    }
//}

@Configuration
public class AiConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {

        return builder
                .defaultOptions(
                        OpenAiChatOptions.builder()
                                .model("nvidia/nemotron-3.5-lightning:free")
                                .temperature(0.0)
                                .timeout(Duration.ofMinutes(5))
                )
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .build();
    }
}