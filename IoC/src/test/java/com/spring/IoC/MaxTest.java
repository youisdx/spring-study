package com.spring.IoC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/practice.xml"})
public class MaxTest {
    @Autowired
    private Max max;

    @Test
    public void getMax()throws Exception {
        assertEquals(5,max.getMax());
    }
}