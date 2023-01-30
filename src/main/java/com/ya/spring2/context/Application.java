package com.ya.spring2.context;

import com.ya.spring2.config.impl.JavaConfig;
import com.ya.spring2.context.ApplicationContext;
import com.ya.spring2.factory.ObjectFactory;

import java.util.Map;

public class Application {
    public static ApplicationContext run(String packageToScan, Map<Class,Class> ifc2ImplClass){
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        context.setFactory(objectFactory);
        return context;
    }
}
