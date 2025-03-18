package com.example.baseball;

import com.example.baseball.validator.BaseballGameReferee;
import com.example.baseball.validator.Validator;
import com.example.baseball.vo.BaseballGameAnswer;
import com.example.baseball.vo.Judgement;

import java.util.Scanner;

public class BaseballGame implements Game {

    private final Scanner player;
    private Validator referee;

    public BaseballGame() {
        this.player = new Scanner(System.in);
        this.referee = new BaseballGameReferee();
    }

    @Override
    public void play() {
        System.out.println("Game start :::");
        boolean keepFlag;

        do {
            Judgement judgement = submit(new BaseballGameAnswer(player.next()));
            keepFlag = !judgement.isCorrect();
            System.out.println(judgement.message());
        } while(keepFlag);

        selectRestart(player);
    }

    private void selectRestart(Scanner player) {
        System.out.println("press X to quit, press any to restart");

        String replay = player.next();
        if (!"X".equalsIgnoreCase(replay)){
            quit(player);
            return;
        }

        replay();
    }

    private void quit(Scanner player) {
        player.close();
        System.out.println("Game closed");
    }

    private void replay() {
        this.referee = new BaseballGameReferee();
        play();
    }

    private Judgement submit(BaseballGameAnswer answer) {
        return referee.judge(answer);
    }
}
