package com.ya.spring2.recommendator.impl;

import com.ya.spring2.recommendator.Recommendator;
import com.ya.spring2.annotation.InjectProperty;
import com.ya.spring2.annotation.Singleton;

@Singleton
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("wisky")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from covid, drink " + alcohol);
    }
}
