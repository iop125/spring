package com.my.demo.advice;


import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdviceForXML {

    public void before() {
        System.out.println("MyAdviceForXML之前执行了");
    }

    public void after() {
        System.out.println("MyAdviceForXML之后执行了");
    }

    public void returning() {
        System.out.println("MyAdviceForXML返回执行了");
    }

    public void throwLong() {
        System.out.println("MyAdviceForXML出异常执行了");
    }

    public Object around(ProceedingJoinPoint invocation) throws Throwable {
        System.out.println("MyAdviceForXML环绕前");
        Object result = invocation.proceed();
        System.out.println("MyAdviceForXML环绕后");
        return result;
    }

}
