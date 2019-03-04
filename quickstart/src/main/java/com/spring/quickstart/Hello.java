package com.spring.quickstart;

import org.springframework.stereotype.Component;

/**
 * 采用注解开发的bean
 * @Compent用于类级别
 */
@Component
public class Hello {
    public String getHello(){
        return"HelloWorld";
    }
}
