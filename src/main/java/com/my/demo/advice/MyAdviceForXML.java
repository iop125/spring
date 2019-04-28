package com.my.demo.advice;


import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdviceForXML {

    public void before() {
        System.out.println("之前执行了");
    }

    public void after() {
        System.out.println("之后执行了");
    }

    public void returning() {
        System.out.println("返回执行了");
    }

    public void throwLong() {
        System.out.println("出异常执行了");
    }

    public Object around(ProceedingJoinPoint invocation) throws Throwable {
        System.out.println("环绕前");
        Object result = invocation.proceed();
        System.out.println("环绕后");
        return result;
    }

}
