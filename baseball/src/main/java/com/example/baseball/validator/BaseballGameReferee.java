package com.example.baseball.validator;

import com.example.baseball.generator.BaseballGameQuestionGenerator;
import com.example.baseball.vo.BaseballGameAnswer;
import com.example.baseball.vo.BaseballJudgement;
import com.example.baseball.vo.Judgement;

public class BaseballGameReferee implements Validator {

    private final String question;

    public BaseballGameReferee() {
        BaseballGameQuestionGenerator questionGenerator = new BaseballGameQuestionGenerator();
        this.question = questionGenerator.generate();
    }

    @Override
    public Judgement judge(BaseballGameAnswer answer) {
        char[] answerCharacters = answer.getAnswerCharacters();
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < answerCharacters.length; i++) {
            boolean correctDetail = isCorrectDetail(answerCharacters[i], i);
            if (correctDetail) {
                strike++;
                continue;
            }

            boolean contains = contains(answerCharacters[i]);
            if (contains) {
                ball++;
            }
        }

        return new BaseballJudgement(strike, ball);
    }

    private boolean isCorrectDetail(char c, int order) {
        return question.toCharArray()[order] == c;
    }

    private boolean contains(Character c) {
        for (char ch : question.toCharArray()) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }
}
