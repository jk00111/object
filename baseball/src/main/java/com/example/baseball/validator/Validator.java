package com.example.baseball.validator;

import com.example.baseball.vo.BaseballGameAnswer;
import com.example.baseball.vo.Judgement;

public interface Validator {

    Judgement judge(BaseballGameAnswer answer);
}
