package com.spring_aop.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MyInvocationHandler implements InvocationHandler {
    // receive Proxy Object
    private Object object = null;

    // return Proxy Object
    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " method params are: " + Arrays.toString(args));
        Object result = method.invoke(this.object, args);
        System.out.println(method.getName() + " method result is " + result);
        return result;
    }
}
