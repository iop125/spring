package com.my.demo.main;

import com.my.demo.dao.Demo2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    private ApplicationContext context;

    public TestMain(ApplicationContext context) {
        this.context = context;
    }

    public void doApplicationContext() {
        //构造器
//        TestManagerImpl TestManagerImpl1 = (TestManagerImpl) context.getBean("testManager");
//        TestManagerImpl1.testAdd();
//        //动态工厂
//        TestManagerImpl TestManagerImpl2 = (TestManagerImpl)context.getBean("testManagerByFactory");
//        TestManagerImpl2.testAdd();
//        //注解
//        TestManagerForzhujieImpl TestManagerForzhujieImpl = (TestManagerForzhujieImpl)context.getBean("testManagerForzhujieImpl");
//        TestManagerForzhujieImpl.testAdd();
    }

    public void testDao() {
        Demo2 demo2 = (com.my.demo.dao.Demo2) context.getBean("demo2");
        //jdbc
//        demo2.run();
        //数据源
        demo2.run2();
    }

    public static void main(String[] a) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestMain t = new TestMain(context);
//        t.doApplicationContext();
        t.testDao();
    }

}
