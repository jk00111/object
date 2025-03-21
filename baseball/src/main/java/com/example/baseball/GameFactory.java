package com.example.baseball;

import com.example.baseball.generator.BaseballGameQuestionGenerator;
import com.example.baseball.referee.BaseballGameReferee;
import com.example.baseball.referee.Referee;

public class GameFactory {

    public static Game createDefaultBaseballGame() {
        return new BaseballGame(
                new BaseballGameReferee(
                        new BaseballGameQuestionGenerator()
                )
        );
    }

    public static Game createbaseballGame(Referee referee) {
        return new BaseballGame(referee);
    }
}
