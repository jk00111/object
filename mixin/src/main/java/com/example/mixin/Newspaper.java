package com.example.mixin;

import java.util.List;

public class Newspaper {

    private Subscribers subscribers;


    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public List<Subscriber> primeSubscribers() {
        // 프라임 구독자 반환 로직
        return subscribers.primeSubscribers();
    }

    public List<Subscriber> advertisementTarget() {
        // 신문만 사용하는 메서드
        return null;
    }
}
