package com.spring.Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Applocation {
    public static void main(String[] args) {
        @SuppressWarnings("rescource")
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Tiger tiger = context.getBean(Tiger.class);
        tiger.walk();
    }
}
