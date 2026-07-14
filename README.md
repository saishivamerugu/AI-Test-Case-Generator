# 🤖 AI Test Case Generator

An AI-powered Java Developer Assistant built with **Java 17**, **Spring Boot 3.5**, **Spring AI**, and **Google Gemini** that analyzes Java source code and generates production-ready testing artifacts and code insights.

This project is designed as a portfolio-quality enterprise application following clean architecture, SOLID principles, and modern software engineering practices.

---

# 🖥️ Application Screenshots
<img width="1092" height="867" alt="image" src="https://github.com/user-attachments/assets/e92e3249-0d23-4dcd-8e99-beacff8077d5" />

---
<img width="1267" height="840" alt="image" src="https://github.com/user-attachments/assets/15e963d0-480b-4af2-9501-c9cc8dbf74ad" />

---
# 🚀 Features

##  Features

* Generate JUnit 5 Unit Tests
* Generate Mockito Tests
* Generate Integration Tests
* Security Analysis
* Refactoring Suggestions
* Code Explanation
* Test Coverage Suggestions
* Clean and Responsive UI
* Google Gemini Integration
* Spring AI Integration
* Constructor Injection
* Production Ready Code Structure

---

# 🛠 Tech Stack

## Backend

* Java 17
* Spring Boot 3.5.x
* Spring AI
* Google Gemini
* Maven

## Frontend

* Thymeleaf
* HTML5
* CSS3
* Bootstrap 5
* JavaScript

## AI

* Google Gemini
* Spring AI Google GenAI Starter

## Tools

* Spring Tools Suite(STS)
* Git
* GitHub


---

# 📂 Project Structure

```text
src
└── main
    ├── java
    │   └── com.project
    │       ├── config
    │       ├── controller
    │       ├── dto
    │       ├── model
    │       ├── service
    │       │   ├── ai
    │       │   ├── feature
    │       │   └── prompt
    │       └── AiTestCaseGeneratorApplication.java
    │
    └── resources
        ├── static
        ├── templates
        └── application.properties
```

---

# 📋 Workflow

```text
Paste Java Source Code
          │
          ▼
Analyze Source Code
          │
          ▼
Choose AI Feature
          │
          ▼
Generate AI Response
          │
          ▼
Display Result
```

---

# 🧠 AI Features

## 🧪 Unit Test Generator

Generates production-ready JUnit 5 test cases.

### Includes

* Positive Test Cases
* Negative Test Cases
* Boundary Conditions
* Edge Cases
* Meaningful Test Names

---

## ⚡ Mockito Test Generator

Creates Mockito-based unit tests.

### Includes

* Mock Dependencies
* Verify Interactions
* Exception Testing
* Dependency Isolation

---

## 🌐 Integration Test Generator

Generates Spring Boot integration tests.

### Includes

* MockMvc Tests
* REST API Testing
* Integration Flow Testing
* End-to-End Scenarios

---

## 🛡 Security Analysis

Analyzes Java code for security issues.

### Checks

* OWASP Risks
* SQL Injection
* Input Validation
* Authentication
* Authorization
* Sensitive Data Exposure

---

## ♻ Refactoring Suggestions

Provides code quality improvements.

### Suggestions

* SOLID Principles
* Design Improvements
* Readability
* Performance
* Best Practices

---

## 📖 Code Explanation

Explains Java code in detail.

### Covers

* Class Responsibilities
* Method Explanation
* Design Decisions
* Overall Workflow

---

## 📈 Coverage Suggestions

Suggests additional testing scenarios.

### Includes

* Missing Test Cases
* Exception Scenarios
* Branch Coverage
* Boundary Testing

---

# 🏗 Architecture

```text
Controller
      │
      ▼
AI Service
      │
      ▼
Feature Service
      │
      ▼
Prompt Builder
      │
      ▼
AI Client
      │
      ▼
Google Gemini
```

---

# 🧩 Design Principles

* SOLID Principles
* Constructor Injection
* Clean Code
* Layered Architecture
* Separation of Concerns
* Single Responsibility
* Extensible Feature Modules

---


# ⚙ Getting Started

## Clone Repository

```bash
git clone https://github.com/your-username/ai-test-case-generator.git
```

---

## Navigate

```bash
cd ai-test-case-generator
```

---

## Configure

Add your Google Gemini API key in:

```properties
application.properties
```

Example:

```properties
spring.ai.google.genai.api-key=YOUR_API_KEY
```

---

## Run

```bash
mvn spring-boot:run
```

Application starts at:

```text
http://localhost:8080
```

---

# 🎯 Future Enhancements

* Monaco Code Editor
* AI Chat Assistant
* Prompt Templates
* Streaming Responses
* Syntax Highlighting
* Export as Java Files
* PDF Reports
* Authentication
* Project Workspace

---

# 👨‍💻 Author

**Merugu Sai**

Java Full Stack Developer

---

# ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.

Happy Coding! 🚀
