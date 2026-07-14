package com.project.service;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.dto.AIResponse;

@Service
public class ResponseParserService {

    private final ObjectMapper objectMapper;

    public ResponseParserService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public AIResponse parseResponse(String aiResponse) {

        try {

            String cleanedResponse = cleanResponse(aiResponse);

            return objectMapper.readValue(cleanedResponse, AIResponse.class);

        } catch (Exception exception) {

            throw new RuntimeException("Failed to parse AI response.", exception);

        }

    }

    private String cleanResponse(String response) {

        if (response == null) {
            return "";
        }

        response = response.trim();

        if (response.startsWith("```json")) {
            response = response.substring(7);
        }

        if (response.startsWith("```")) {
            response = response.substring(3);
        }

        if (response.endsWith("```")) {
            response = response.substring(0, response.length() - 3);
        }

        return response.trim();

    }

}