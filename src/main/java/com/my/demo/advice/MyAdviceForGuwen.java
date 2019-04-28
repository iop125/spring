package com.my.demo.advice;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
@Aspect
@Service
public class MyAdviceForGuwen  implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(this.getClass().getSimpleName()+"   之前执行"+method.getName());
        System.out.println(o);
        for(Object p :objects){
            System.out.println(p);
        }
//        method.invoke(o);

    }
}
