package com.my.demo.main;

import com.my.demo.manager.impl.TestManagerForzhujieImpl;
import com.my.demo.manager.impl.TestManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    private ApplicationContext context;

    public TestMain(ApplicationContext context) {
        this.context = context;
    }

    public void doApplicationContext(){
        //构造器
        TestManagerImpl TestManagerImpl1 = (TestManagerImpl) context.getBean("testManager");
        TestManagerImpl1.testAdd();
//        //动态工厂
//        TestManagerImpl TestManagerImpl2 = (TestManagerImpl)context.getBean("testManagerByFactory");
//        TestManagerImpl2.testAdd();
//        //注解
//        TestManagerForzhujieImpl TestManagerForzhujieImpl = (TestManagerForzhujieImpl)context.getBean("testManagerForzhujieImpl");
//        TestManagerForzhujieImpl.testAdd();
    }


    public static void main(String [] a){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestMain t= new TestMain(context);
        t.doApplicationContext();
    }

}
