package com.spring.Aop.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserLoginApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserLogin userlogin= context.getBean(UserLogin.class);
        System.out.println(userlogin);
    }
}
