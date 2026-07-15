package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.dto.AIResponse;
import com.project.dto.CodeRequest;
import com.project.service.ai.AIService;

import jakarta.validation.Valid;

@Controller
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/generate/unit-tests")
    public String generateUnitTests(@Valid CodeRequest codeRequest, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";
        AIResponse response = aiService.generateUnitTests(codeRequest.getCode());
        model.addAttribute("response", response);
        return "result";
    }

    @PostMapping("/generate/mockito-tests")
    public String generateMockitoTests(@Valid CodeRequest codeRequest, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";
        AIResponse response = aiService.generateMockitoTests(codeRequest.getCode());
        model.addAttribute("response", response);
        return "result";
    }

    @PostMapping("/generate/integration-tests")
    public String generateIntegrationTests(@Valid CodeRequest codeRequest, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";
        AIResponse response = aiService.generateIntegrationTests(codeRequest.getCode());
        model.addAttribute("response", response);
        return "result";
    }

    @PostMapping("/generate/security-analysis")
    public String generateSecurityAnalysis(@Valid CodeRequest codeRequest, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";
        AIResponse response = aiService.generateSecurityAnalysis(codeRequest.getCode());
        model.addAttribute("response", response);
        return "result";
    }

    @PostMapping("/generate/refactoring")
    public String generateRefactoringSuggestions(@Valid CodeRequest codeRequest, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors())  return "index";
        AIResponse response = aiService.generateRefactoringSuggestions(codeRequest.getCode());
        model.addAttribute("response", response);
        return "result";
    }

    @PostMapping("/generate/explanation")
    public String explainCode(@Valid CodeRequest codeRequest, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors())  return "index";
        AIResponse response = aiService.explainCode(codeRequest.getCode());
        model.addAttribute("response", response);
        return "result";
    }

    @PostMapping("/generate/coverage")
    public String generateCoverageSuggestions(@Valid CodeRequest codeRequest, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";
        AIResponse response = aiService.generateCoverageSuggestions(codeRequest.getCode());
        model.addAttribute("response", response);
        return "result";
    }
}
