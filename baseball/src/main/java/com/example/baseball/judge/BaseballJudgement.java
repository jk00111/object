package com.example.baseball.judge;

public class BaseballJudgement implements Judgement{

    private final int strike;
    private final int ball;

    public BaseballJudgement(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    @Override
    public boolean isCorrect() {
        final int level = 3;
        return this.strike == level;
    }

    @Override
    public String message() {
        if (isCorrect()) {
            return "correct!";
        }

        if (nothing()) {
            return "nothing";
        }

        return hint();
    }

    private boolean nothing() {
        return this.strike == 0 && this.ball == 0;
    }

    private String hint() {
        return "strike: " + this.strike + " ball: " + this.ball;
    }
}
