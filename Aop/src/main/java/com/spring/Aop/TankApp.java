package com.spring.Aop;

public class TankApp {
    public static void main(String[] args) {
        Move t1= new Tank();
        Move t2= new Car();
        Move moveProxy = new TankProxy(t1);
//        Move move1Proxy = new TankProxy(t2);
        moveProxy.move();
//        move1Proxy.move();

    }
}
