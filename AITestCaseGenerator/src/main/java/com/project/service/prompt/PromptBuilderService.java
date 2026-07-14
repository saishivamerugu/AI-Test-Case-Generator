package com.project.service.prompt;

import org.springframework.stereotype.Service;

@Service
public class PromptBuilderService {

    public String buildUnitTestPrompt(String javaCode) {

        return """
                You are a Senior Java Developer and JUnit 5 expert.

                Analyze the following Java class and generate production-ready JUnit 5 test cases.

                Instructions:
                1. Use JUnit 5.
                2. Cover positive and negative test cases.
                3. Include edge cases wherever applicable.
                4. Use meaningful test method names.
                5. Return only Java code.
                6. Do not include markdown.
                7. Do not include explanations.

                Java Source Code:
                ----------------------------------------
                """
                + javaCode;
    }

    public String buildMockitoTestPrompt(String javaCode) {

        return """
                You are a Senior Java Developer and Mockito expert.

                Analyze the following Java class and generate production-ready Mockito-based unit tests.

                Instructions:
                1. Use JUnit 5 and Mockito.
                2. Mock all external dependencies.
                3. Verify interactions where appropriate.
                4. Cover success, failure and edge cases.
                5. Return only Java code.
                6. Do not include markdown.
                7. Do not include explanations.

                Java Source Code:
                ----------------------------------------
                """
                + javaCode;
    }

    public String buildIntegrationTestPrompt(String javaCode) {

        return """
                You are a Spring Boot integration testing expert.

                Analyze the following Java class and generate production-ready integration tests.

                Instructions:
                1. Use Spring Boot Test.
                2. Use MockMvc where appropriate.
                3. Cover important application flows.
                4. Return only Java code.
                5. Do not include markdown.
                6. Do not include explanations.

                Java Source Code:
                ----------------------------------------
                """
                + javaCode;
    }

    public String buildSecurityAnalysisPrompt(String javaCode) {

        return """
                You are a Java Security Expert.

                Analyze the following Java code.

                Identify:
                - Security vulnerabilities
                - OWASP risks
                - Input validation issues
                - Authentication or authorization concerns
                - Recommended fixes

                Return only the analysis.
                Do not use markdown.

                Java Source Code:
                ----------------------------------------
                """
                + javaCode;
    }

    public String buildRefactoringPrompt(String javaCode) {

        return """
                You are a Senior Java Software Architect.

                Review the following code.

                Suggest:
                - SOLID improvements
                - Design improvements
                - Performance improvements
                - Readability improvements
                - Best practices

                Return only the suggestions.
                Do not use markdown.

                Java Source Code:
                ----------------------------------------
                """
                + javaCode;
    }

    public String buildCodeExplanationPrompt(String javaCode) {

        return """
                You are a Senior Java Mentor.

                Explain the following Java code in detail.

                Include:
                - Overall purpose
                - Class responsibilities
                - Method explanations
                - Design decisions
                - Possible improvements

                Return only the explanation.
                Do not use markdown.

                Java Source Code:
                ----------------------------------------
                """
                + javaCode;
    }

    public String buildCoverageSuggestionPrompt(String javaCode) {

        return """
                You are a Java Test Coverage Expert.

                Analyze the following Java code.

                Suggest:
                - Missing test scenarios
                - Boundary conditions
                - Exception cases
                - Branch coverage improvements
                - Additional assertions

                Return only the suggestions.
                Do not use markdown.

                Java Source Code:
                ----------------------------------------
                """
                + javaCode;
    }
}