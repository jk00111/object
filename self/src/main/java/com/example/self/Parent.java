package com.example.self;

public class Parent {

    public String stats() {
        return "Parent - stats " + getEvaluationMethod();
    }

    public String getEvaluationMethod() {
        return "Parent - get";
    }
}
