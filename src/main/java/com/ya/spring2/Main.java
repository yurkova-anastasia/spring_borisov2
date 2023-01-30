package com.ya.spring2;

import com.ya.spring2.context.Application;
import com.ya.spring2.context.ApplicationContext;
import com.ya.spring2.model.CoronaDesinfector;
import com.ya.spring2.model.Room;
import com.ya.spring2.policeman.Policeman;
import com.ya.spring2.policeman.impl.PolicemanImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = Application.run("com.ya.spring2", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}