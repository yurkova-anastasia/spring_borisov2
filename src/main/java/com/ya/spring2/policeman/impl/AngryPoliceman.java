package com.ya.spring2.policeman.impl;

import com.ya.spring2.policeman.Policeman;

public class AngryPoliceman implements Policeman {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убью");
    }
}
