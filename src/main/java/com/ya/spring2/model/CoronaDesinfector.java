package com.ya.spring2.model;

import com.ya.spring2.annotation.InjectByType;
import com.ya.spring2.announcer.Announcer;
import com.ya.spring2.policeman.Policeman;

public class CoronaDesinfector {
    @InjectByType
    private Announcer announcer ;
    @InjectByType
    private Policeman policeman ;

    public void start(Room room){
        announcer.announce("Начинаем дезинфекцию");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Закончили");
    }

    public void desinfect(Room room){
        System.out.println("молитва");
    }
}
