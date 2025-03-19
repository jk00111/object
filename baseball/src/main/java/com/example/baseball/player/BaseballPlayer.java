package com.example.baseball.player;

import java.util.Scanner;

public class BaseballPlayer implements Player {

    private final Scanner scanner;

    public BaseballPlayer() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String submit() {
        return scanner.next();
    }

    @Override
    public void logout() {
        this.scanner.close();
    }
}
