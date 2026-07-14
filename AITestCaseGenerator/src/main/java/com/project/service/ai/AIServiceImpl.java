package com.project.service.ai;

import org.springframework.stereotype.Service;

import com.project.dto.AIResponse;
import com.project.service.feature.CodeExplanationService;
import com.project.service.feature.CoverageService;
import com.project.service.feature.IntegrationTestService;
import com.project.service.feature.MockitoService;
import com.project.service.feature.RefactoringService;
import com.project.service.feature.SecurityAnalysisService;
import com.project.service.feature.UnitTestService;

@Service
public class AIServiceImpl implements AIService {

    private final UnitTestService unitTestService;
    private final MockitoService mockitoService;
    private final IntegrationTestService integrationTestService;
    private final SecurityAnalysisService securityAnalysisService;
    private final RefactoringService refactoringService;
    private final CodeExplanationService codeExplanationService;
    private final CoverageService coverageService;

    public AIServiceImpl(UnitTestService unitTestService,
                         MockitoService mockitoService,
                         IntegrationTestService integrationTestService,
                         SecurityAnalysisService securityAnalysisService,
                         RefactoringService refactoringService,
                         CodeExplanationService codeExplanationService,
                         CoverageService coverageService) {

        this.unitTestService = unitTestService;
        this.mockitoService = mockitoService;
        this.integrationTestService = integrationTestService;
        this.securityAnalysisService = securityAnalysisService;
        this.refactoringService = refactoringService;
        this.codeExplanationService = codeExplanationService;
        this.coverageService = coverageService;
    }

    @Override
    public AIResponse generateUnitTests(String javaCode) {
        return unitTestService.generate(javaCode);
    }

    @Override
    public AIResponse generateMockitoTests(String javaCode) {
        return mockitoService.generate(javaCode);
    }

    @Override
    public AIResponse generateIntegrationTests(String javaCode) {
        return integrationTestService.generate(javaCode);
    }

    @Override
    public AIResponse generateSecurityAnalysis(String javaCode) {
        return securityAnalysisService.generate(javaCode);
    }

    @Override
    public AIResponse generateRefactoringSuggestions(String javaCode) {
        return refactoringService.generate(javaCode);
    }

    @Override
    public AIResponse explainCode(String javaCode) {
        return codeExplanationService.generate(javaCode);
    }

    @Override
    public AIResponse generateCoverageSuggestions(String javaCode) {
        return coverageService.generate(javaCode);
    }
}