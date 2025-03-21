package com.example.baseball.referee;

import com.example.baseball.vo.BaseballGameAnswer;
import com.example.baseball.judgement.Judgement;

public interface Referee {

    Judgement judge(BaseballGameAnswer answer);
}
