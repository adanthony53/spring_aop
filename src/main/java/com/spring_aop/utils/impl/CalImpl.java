package com.spring_aop.utils.impl;

import com.spring_aop.utils.Calculator;

public class CalImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        //System.out.println("add method params are " + a + " and " + b);
        //System.out.println("result is " + res);
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        //System.out.println("sub method params are " + a + " and " + b);
        //System.out.println("result is " + res);
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        //System.out.println("mul method params are " + a + " and " + b);
        //System.out.println("result is " + res);
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        //System.out.println("div method params are " + a + " and " + b);
        //System.out.println("result is " + res);
        return a/b;
    }
}
