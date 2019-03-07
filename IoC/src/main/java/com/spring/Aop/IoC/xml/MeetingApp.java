package com.spring.Aop.IoC.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MeetingApp {
    public static void main(String[] args) {
        @SuppressWarnings("resources")
        ApplicationContext context = new ClassPathXmlApplicationContext("practice.xml");
        Meeting meeting = context.getBean(Meeting.class);
        System.out.println(meeting);
    }


}
