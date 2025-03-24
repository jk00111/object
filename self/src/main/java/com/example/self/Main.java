package com.example.self;

public class Main {

    public static void main(String[] args) {
        Parent child = new Child();
        System.out.println(child.stats());

        Parent parent = new Parent();
        System.out.println(parent.stats());
    }
}
