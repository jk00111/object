package com.example.baseball.vo;

public class BaseballGameAnswer {

    private final String answer;

    public BaseballGameAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }

    public char[] getAnswerCharacters() {
        return this.answer.toCharArray();
    }
}
