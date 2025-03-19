package com.example.baseball.generator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseballGameQuestionGenerator implements QuestionGenerator {

    private final Integer DEFAULT_LEVEL = 3;

    public BaseballGameQuestionGenerator() {
    }

    @Override
    public String generate() {
        Character[] questionPool = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        List<Character> questionList = new ArrayList<>(List.of(questionPool));
        Collections.shuffle(questionList);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < DEFAULT_LEVEL; i++) {
            builder.append(questionList.get(i));
        }

        return builder.toString();
    }
}
