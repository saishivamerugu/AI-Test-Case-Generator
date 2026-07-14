package com.project.dto;

public class AIResponse {

    private String generatedContent;

    public AIResponse() {
    }

    public AIResponse(String generatedContent) {
        this.generatedContent = generatedContent;
    }

    public String getGeneratedContent() {
        return generatedContent;
    }

    public void setGeneratedContent(String generatedContent) {
        this.generatedContent = generatedContent;
    }
}