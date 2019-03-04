package com.spring.IoC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/spring.xml"})
public class UserTest {
    @Autowired
    private User user;
    @Test
    public void userLogin(){
        UserLogin userLogin=new UserLogin();
        assertEquals(true,userLogin.userLogin(user));
    }

}