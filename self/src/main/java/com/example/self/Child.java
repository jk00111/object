package com.example.self;

public class Child extends Parent {

    @Override
    public String getEvaluationMethod() {
        return "child - get";
    }

    @Override
    public String atavism() {
        return super.atavism();
    }
}
