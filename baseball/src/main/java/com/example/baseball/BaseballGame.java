package com.example.baseball;

import com.example.baseball.judgement.Judgement;
import com.example.baseball.player.BaseballPlayer;
import com.example.baseball.player.Player;
import com.example.baseball.referee.BaseballGameReferee;
import com.example.baseball.referee.Referee;
import com.example.baseball.vo.BaseballGameAnswer;

public class BaseballGame implements Game {

    private final Player player;
    private Referee referee;
    private int reclusiveCount = 0;

    public BaseballGame() {
        this.player = new BaseballPlayer();
        this.referee = new BaseballGameReferee();
    }

    public BaseballGame(Referee referee) {
        this.player = new BaseballPlayer();
        this.referee = referee;
    }

    @Override
    public void play() {
        System.out.println("Game start :::");
        boolean keepFlag;

        do {
            Judgement judgement = submit(new BaseballGameAnswer(player.submit()));
            keepFlag = !judgement.isCorrect();
            System.out.println(judgement.message());
        } while(keepFlag);

        afterPlay();
    }

    private void afterPlay() {
        if(isEscapeCount()) {
            quit();
            return;
        }

        selectRestart();
    }

    private void selectRestart() {
        System.out.println("press X to quit, press any to restart");

        String replay = player.submit();
        if ("X".equalsIgnoreCase(replay)){
            quit();
            return;
        }

        replay();
    }

    private boolean isEscapeCount() {
        final int ESCAPE_COUNT = 10;
        return this.reclusiveCount == ESCAPE_COUNT;
    }

    private void quit() {
        player.logout();
        System.out.println("Game closed");
    }

    private void replay() {
        this.referee = new BaseballGameReferee();
        reclusiveCount++;
        play();
    }

    private Judgement submit(BaseballGameAnswer answer) {
        return referee.judge(answer);
    }
}
