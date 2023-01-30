package com.ya.spring2.announcer.impl;

import com.ya.spring2.recommendator.Recommendator;
import com.ya.spring2.annotation.InjectByType;
import com.ya.spring2.announcer.Announcer;

public class ConsoleAnnouncer implements Announcer {
    @InjectByType
    private Recommendator recommendator;

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
