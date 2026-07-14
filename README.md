# AI Test Case Generator

An AI-powered web application that automatically generates **JUnit test cases**, **Mockito tests**, **edge case scenarios**, **integration tests**, and **code quality suggestions** from Java source code.

Built using **Java 17**, **Spring Boot**, **Spring AI**, **JavaParser**, and **Thymeleaf**, this project helps developers reduce the time spent writing test cases while improving code quality through AI-assisted analysis.

---

## 📌 Features

### ✅ Test Generation
- Generate JUnit 5 test cases
- Generate Mockito-based unit tests
- Generate Spring Boot integration tests
- Generate edge case test scenarios
- Exception handling test cases
- Test data generation suggestions

### 🔍 AI Code Analysis
- Explain uploaded Java code
- Suggest code refactoring
- Detect possible security vulnerabilities
- Recommend missing test scenarios
- Code coverage recommendations

### 📂 File Support
- Upload Java source files
- Paste Java code directly
- Download generated test cases

### 🧠 Intelligent Parsing
Instead of sending raw code to the AI model, the application first analyzes the code using **JavaParser** to extract:
- Classes
- Methods
- Parameters
- Return types
- Exceptions
- Annotations
- Dependencies

This structured information enables more accurate and context-aware AI-generated test cases.

---

# 🏗️ Tech Stack

## Backend
- Java 17
- Spring Boot 3.5.x
- Spring AI
- Maven
- JavaParser
- Lombok
- Jakarta Validation

## AI
- Gemini API (Google AI)
- Spring AI ChatClient

## Frontend
- Thymeleaf
- Bootstrap 5
- HTML5
- CSS3
- JavaScript

## Testing
- JUnit 5
- Mockito

---

# 📁 Project Structure

```
AITestCaseGenerator
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com
│   │       └── aitestgenerator
│   │
│   │           ├── config
│   │           │      AIConfig.java
│   │           │
│   │           ├── controller
│   │           │      HomeController.java
│   │           │      TestCaseController.java
│   │           │
│   │           ├── service
│   │           │      AIService.java
│   │           │      PromptBuilderService.java
│   │           │      JavaParserService.java
│   │           │
│   │           ├── dto
│   │           │      CodeRequest.java
│   │           │      AIResponse.java
│   │           │
│   │           ├── parser
│   │           │      JavaParserUtil.java
│   │           │
│   │           ├── util
│   │           │      PromptTemplates.java
│   │           │
│   │           └── AiTestCaseGeneratorApplication.java
│   │
│   └── resources
│       ├── templates
│       │      index.html
│       │      result.html
│       │
│       ├── static
│       │      ├── css
│       │      ├── js
│       │      └── images
│       │
│       └── application.properties
│
└── pom.xml
```

---

# ⚙️ How It Works

```
User Uploads Java File
           │
           ▼
JavaParser Extracts Code Metadata
           │
           ▼
Prompt Builder Creates AI Prompt
           │
           ▼
Spring AI ChatClient
           │
           ▼
Gemini AI
           │
           ▼
Generated Test Cases
           │
           ▼
Displayed in Thymeleaf UI
```

---

# 🚀 REST APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | / | Home Page |
| POST | /generate | Generate AI Test Cases |
| POST | /upload | Upload Java File |
| POST | /explain | Explain Source Code |
| POST | /security | Security Analysis |
| POST | /refactor | Refactoring Suggestions |
| GET | /download/{id} | Download Generated Tests |

---

# 📷 Application Workflow

1. Upload a Java source file or paste Java code.
2. JavaParser extracts structural information.
3. Spring AI builds an optimized prompt.
4. Gemini analyzes the code.
5. AI generates:
   - Unit Tests
   - Integration Tests
   - Mockito Tests
   - Edge Cases
   - Security Suggestions
   - Refactoring Recommendations
6. Results are displayed in a clean UI.
7. Users can download the generated test cases.

---

# 💡 Example Input

```java
public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

}
```

---

# 🤖 Example Output

```java
@Test
void shouldAddTwoNumbers() {

    Calculator calculator = new Calculator();

    assertEquals(5, calculator.add(2,3));

}
```

---

# ✨ Future Enhancements

- Project-wide source code analysis
- GitHub repository integration
- CI/CD pipeline integration
- AI-generated documentation
- Mutation testing suggestions
- RAG-powered organization coding standards
- Vector database support (pgvector)
- Multi-module Maven project support
- Chat-based AI developer assistant
- PDF report generation

---

# 🛠️ Installation

### Clone Repository

```bash
git clone https://github.com/your-username/AI-TestCase-Generator.git
```

### Open Project

Open the project in **Spring Tool Suite (STS)** or **IntelliJ IDEA**.

### Configure API Key

Update the following in `application.properties`.

```properties
spring.ai.openai.api-key=YOUR_API_KEY

spring.ai.openai.base-url=https://generativelanguage.googleapis.com/v1beta/openai

spring.ai.openai.chat.options.model=gemini-2.5-flash
```

### Run the Application

```bash
mvn spring-boot:run
```

Application URL

```
http://localhost:8080
```

---

# 📚 Learning Outcomes

This project demonstrates practical knowledge of:

- Spring Boot
- Spring AI
- JavaParser
- Prompt Engineering
- REST API Development
- AI Integration
- Java 17
- JUnit 5
- Mockito
- Thymeleaf
- Enterprise Application Design

---

# 🎯 Resume Highlights

- Developed an AI-powered test case generation platform using Spring AI and JavaParser.
- Automated the creation of JUnit, Mockito, integration, and edge-case tests.
- Implemented intelligent code parsing to improve AI prompt quality.
- Built a modern web interface using Thymeleaf and Bootstrap.
- Integrated Google Gemini AI through Spring AI for enterprise-grade code analysis.

---

# 👨‍💻 Author

**Merugu Sai**

Aspiring Java Full Stack & AI Developer

- Java
- Spring Boot
- Spring AI
- SQL
- REST APIs
- AI & Machine Learning

---

## ⭐ If you found this project helpful, consider giving it a Star!
