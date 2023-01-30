package com.ya.spring2.policeman.impl;

import com.ya.spring2.annotation.InjectByType;
import com.ya.spring2.policeman.Policeman;
import com.ya.spring2.recommendator.Recommendator;

import javax.annotation.PostConstruct;

public class PolicemanImpl implements Policeman {
    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("pif paf");
    }
}
