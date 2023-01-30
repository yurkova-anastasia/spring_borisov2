package com.ya.spring2.configurators.object;

import com.ya.spring2.context.ApplicationContext;

public interface ObjectConfigurator {
    void configure(Object t, ApplicationContext context);
}
