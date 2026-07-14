package com.project.service.ai;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AIClientService {

    private final ChatClient chatClient;

    public AIClientService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String askAI(String prompt) {

        return chatClient
                .prompt()
                .user(prompt)
                .call()
                .content();
    }
}