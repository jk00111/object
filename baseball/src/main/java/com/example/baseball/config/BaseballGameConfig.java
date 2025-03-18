package com.example.baseball.config;

public class BaseballGameConfig implements GameConfig {

    private final int level;

    public BaseballGameConfig(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }
}
