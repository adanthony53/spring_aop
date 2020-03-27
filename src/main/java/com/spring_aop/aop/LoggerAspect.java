package com.spring_aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAspect {

    @Before(value = "execution(public int com.spring_aop.utils.impl.CalImpl.*(..))")
    public void before(JoinPoint joinPoint) {
        // get method name
        String name = joinPoint.getSignature().getName();
        // get args
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name + " method params are: " + args + " ...");
    }

    @After(value = "execution(public int com.spring_aop.utils.impl.CalImpl.*(..))")
    public void after(JoinPoint joinPoint) {
        // get method name
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " is done");
    }

    @AfterReturning(value = "execution(public int com.spring_aop.utils.impl.CalImpl.*(..))", returning = "res")
    public void afterReturning(JoinPoint joinPoint, Object res) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " result is " + res);
    }

    @AfterThrowing(value = "execution(public int com.spring_aop.utils.impl.CalImpl.*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + " throws exception: " + exception);
    }
}

