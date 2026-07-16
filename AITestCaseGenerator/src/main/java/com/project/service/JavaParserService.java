package com.project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.project.model.CodeAnalysis;
import com.project.model.MethodMetadata;

@Service
public class JavaParserService {

    public CodeAnalysis analyzeCode(String javaCode) {

        CodeAnalysis analysis = new CodeAnalysis();

        CompilationUnit compilationUnit = StaticJavaParser.parse(javaCode);

        extractPackage(compilationUnit, analysis);

        extractClass(compilationUnit, analysis);

        extractImports(compilationUnit, analysis);

        extractClassAnnotations(compilationUnit, analysis);

        extractMethods(compilationUnit, analysis);

        return analysis;
    }

    private void extractPackage(CompilationUnit compilationUnit,  CodeAnalysis analysis) {

        Optional<String> packageName = compilationUnit
                .getPackageDeclaration()
                .map(packageDeclaration -> packageDeclaration.getNameAsString());
        analysis.setPackageName(packageName.orElse("Default Package"));
    }

    private void extractClass(CompilationUnit compilationUnit, CodeAnalysis analysis) {
        Optional<ClassOrInterfaceDeclaration> classDeclaration = compilationUnit.findFirst(ClassOrInterfaceDeclaration.class);
        classDeclaration.ifPresent(value -> analysis.setClassName(value.getNameAsString()));
    }

    private void extractImports(CompilationUnit compilationUnit, CodeAnalysis analysis) {
        for (ImportDeclaration importDeclaration : compilationUnit.getImports()) {
            analysis.getImports().add(importDeclaration.getNameAsString());
        }
    }

    private void extractClassAnnotations(CompilationUnit compilationUnit, CodeAnalysis analysis) {
        Optional<ClassOrInterfaceDeclaration> classDeclaration = compilationUnit.findFirst(ClassOrInterfaceDeclaration.class);

        if (classDeclaration.isPresent()) {
            for (AnnotationExpr annotation : classDeclaration.get().getAnnotations()) {
                analysis.getClassAnnotations().add(annotation.getNameAsString());
            }
        }
    }

    private void extractMethods(CompilationUnit compilationUnit, CodeAnalysis analysis) {
        for (MethodDeclaration method : compilationUnit.findAll(MethodDeclaration.class)) {
            MethodMetadata methodMetadata = new MethodMetadata();
            methodMetadata.setMethodName(method.getNameAsString());
            methodMetadata.setReturnType(method.getType().asString());
            for (Parameter parameter : method.getParameters()) {
                methodMetadata.getParameters().add(parameter.getTypeAsString() + " " + parameter.getNameAsString());
            }

            for (AnnotationExpr annotation : method.getAnnotations()) {
                methodMetadata.getAnnotations().add(annotation.getNameAsString());
            }
            analysis.getMethods().add(methodMetadata);

        }

    }

}
