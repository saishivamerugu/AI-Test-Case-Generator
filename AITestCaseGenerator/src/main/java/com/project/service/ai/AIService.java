package com.project.service.ai;

import com.project.dto.AIResponse;

public interface AIService {

    AIResponse generateUnitTests(String javaCode);

    AIResponse generateMockitoTests(String javaCode);

    AIResponse generateIntegrationTests(String javaCode);

    AIResponse generateSecurityAnalysis(String javaCode);

    AIResponse generateRefactoringSuggestions(String javaCode);

    AIResponse explainCode(String javaCode);

    AIResponse generateCoverageSuggestions(String javaCode);
}