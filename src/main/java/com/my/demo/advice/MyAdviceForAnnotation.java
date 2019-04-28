package com.my.demo.advice;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdviceForAnnotation {
    @Before("execution(* *..*.*.TestAdviceForAnnotationImpl.testAdd(..))")
    public void before() {
        System.out.println("之前执行了");
    }

    @After("execution(* *..*.*.TestAdviceForAnnotationImpl.testAdd3(..))")

    public void after() {
        System.out.println("之后执行了");
    }

    @AfterReturning("execution(* *..*.*.TestAdviceForAnnotationImpl.testAdd4(..))")

    public void returning() {
        System.out.println("返回执行了");
    }

    @AfterThrowing("execution(* *..*.*.TestAdviceForAnnotationImpl.testAdd5(..))")

    public void throwLong() {
        System.out.println("出异常执行了");
    }

    @Around("execution(* *..*.*.TestAdviceForAnnotationImpl.testAdd6(..))")

    public Object around(ProceedingJoinPoint invocation) throws Throwable {
        System.out.println("环绕前");
        Object result = invocation.proceed();
        System.out.println("环绕后");
        return result;
    }

}
