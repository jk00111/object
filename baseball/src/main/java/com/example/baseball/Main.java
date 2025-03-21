package com.example.baseball;

import com.example.baseball.generator.BaseballGameQuestionGenerator;
import com.example.baseball.referee.BaseballGameReferee;

public class Main {

    public static void main(String[] args) {
        Game baseballGame = new BaseballGame(
                                  new BaseballGameReferee(
                                            new BaseballGameQuestionGenerator()
                ));

        Game defaultBaseballGame = new BaseballGame();

        Game defaultBaseballGameByFactory = GameFactory.createDefaultBaseballGame();
        Game baseballGameByFactory = GameFactory.createbaseballGame(new BaseballGameReferee());
    }
}
