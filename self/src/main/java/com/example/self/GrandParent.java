package com.example.self;

public class GrandParent {

    public String stats() {
        return "GrandParent - stats " + getEvaluationMethod();
    }

    public String getEvaluationMethod() {
        return "GrandParent - get";
    }

    public String atavism() {
        return "only have grand-child : Grand";
    }
}
