package com.ya.spring2.configurators.object.impl;

import com.ya.spring2.context.ApplicationContext;
import com.ya.spring2.annotation.InjectByType;
import com.ya.spring2.configurators.object.ObjectConfigurator;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @SneakyThrows
    @Override
    public void configure(Object t, ApplicationContext context) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)){
                field.setAccessible(true);
                Object object = context.getObject(field.getType());
                field.set(t,object);
            }
        }
    }
}
