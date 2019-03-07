package com.spring.Aop.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaxApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("practice.xml");
        Max max = (Max) context.getBean("max");
        System.out.println(max.getMax());
    }
}
