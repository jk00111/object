package com.example.baseball.config;

public interface GameConfig {

    int getLevel();

    static BaseballGameConfig defaultConfig() {
        return new BaseballGameConfig(3);
    }
}
