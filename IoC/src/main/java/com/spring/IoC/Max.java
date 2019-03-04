package com.spring.IoC;

/**
 * 待测程序，求两个数的较大值
 */
public class Max {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int getMax(){
        return a>b?a:b;
    }
}
