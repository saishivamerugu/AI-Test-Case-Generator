package com.project.service.feature;

import org.springframework.stereotype.Service;

import com.project.dto.AIResponse;
import com.project.service.ai.AIClientService;
import com.project.service.prompt.PromptBuilderService;

@Service
public class CoverageService {

    private final PromptBuilderService promptBuilderService;
    private final AIClientService aiClientService;

    public CoverageService(PromptBuilderService promptBuilderService, AIClientService aiClientService) {
        this.promptBuilderService = promptBuilderService;
        this.aiClientService = aiClientService;
    }

    public AIResponse generate(String javaCode) {
        String prompt = promptBuilderService.buildCoverageSuggestionPrompt(javaCode);
        String response = aiClientService.askAI(prompt);
        return new AIResponse(response);
    }
}
