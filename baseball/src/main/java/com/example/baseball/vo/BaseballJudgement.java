package com.example.baseball.vo;

import com.example.baseball.config.BaseballGameConfig;
import com.example.baseball.config.GameConfig;

public class BaseballJudgement implements Judgement{

    private final int strike;
    private final int ball;
    private final int level;

    public BaseballJudgement(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
        this.level = GameConfig.defaultConfig().getLevel();
    }

    public BaseballJudgement(int strike, int ball, BaseballGameConfig config) {
        this.strike = strike;
        this.ball = ball;
        this.level = config.getLevel();
    }

    @Override
    public boolean isCorrect() {
        return this.strike == this.level;
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
