package com.spring_aop.test;

import com.spring_aop.utils.Calculator;
import com.spring_aop.utils.MyInvocationHandler;
import com.spring_aop.utils.impl.CalImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;

public class Test {
    public static void main(String[] args) {

//        Calculator cal = new CalImpl();
//        cal.add(1,1);
//        cal.sub(2,1);
//        cal.mul(2,3);
//        cal.div(6,3);

//        Calculator cal = new CalImpl();
//        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
//        Calculator proxy = (Calculator) myInvocationHandler.bind(cal); //Proxy
//        // Proxy has all the methods of the original Object (Calculator)
//        // And the Proxy has the additional statements/operations in the invoke method
//        proxy.add(1,2);
//        proxy.sub(2,1);
//        proxy.mul(2,3);
//        proxy.div(6,3);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        Calculator proxy = (Calculator) applicationContext.getBean("calImpl");
        proxy.add(1,2);
        proxy.sub(2,1);
        proxy.mul(2,3);
        proxy.div(6,2);
        proxy.div(6,0);
    }
}
