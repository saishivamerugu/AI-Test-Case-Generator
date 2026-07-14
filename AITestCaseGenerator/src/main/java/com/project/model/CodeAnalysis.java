package com.project.model;

import java.util.ArrayList;
import java.util.List;

public class CodeAnalysis {

    private String packageName;

    private String className;

    private List<String> imports = new ArrayList<>();

    private List<String> classAnnotations = new ArrayList<>();

    private List<String> dependencies = new ArrayList<>();

    private List<MethodMetadata> methods = new ArrayList<>();

    public CodeAnalysis() {
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<String> getImports() {
        return imports;
    }

    public void setImports(List<String> imports) {
        this.imports = imports;
    }

    public List<String> getClassAnnotations() {
        return classAnnotations;
    }

    public void setClassAnnotations(List<String> classAnnotations) {
        this.classAnnotations = classAnnotations;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    public List<MethodMetadata> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodMetadata> methods) {
        this.methods = methods;
    }

}