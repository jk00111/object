package com.example.mixin;

import java.util.List;

public class Magazine {

    private Subscribers subscribers;

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public List<Subscriber> primeSubscribers() {
        // 프라임 구독자 반환 로직
        return subscribers.primeSubscribers();
    }

    public List<Subscriber> yearlySubscribers() {
        // 잡지만 사용 하는 메서드
        return null;
    }
}
