package com.spring.Aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户自定义的前置增强对象
 */
public class MyBeforeAdvice {
    private static final Logger logger=  LoggerFactory.getLogger(MyBeforeAdvice.class);
    public void beforeMethod(){

      logger.debug("this is a before pfz");
//        System.out.println("This is a before method");
    }
}
