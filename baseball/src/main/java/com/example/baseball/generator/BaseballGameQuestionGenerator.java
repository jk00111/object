package com.example.baseball.generator;

import com.example.baseball.config.GameConfig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseballGameQuestionGenerator implements QuestionGenerator {

    private final GameConfig config;

    public BaseballGameQuestionGenerator() {
        this.config = GameConfig.defaultConfig();
    }

    public BaseballGameQuestionGenerator(GameConfig config) {
        this.config = config;
    }

    @Override
    public String generate() {
        Character[] questionPool = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        ArrayList<Character> questionList = new ArrayList<>(List.of(questionPool));
        Collections.shuffle(questionList);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < config.getLevel(); i++) {
            builder.append(questionList.get(i));
        }

        return builder.toString();
    }
}
