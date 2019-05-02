package com.my.demo.main;

import com.my.demo.dao.AaaMapper;
import com.my.demo.dao.test.Demo1;
import com.my.demo.dao.test.Demo2;
import com.my.demo.manager.TestManager;
import com.my.demo.manager.impl.TestAdviceForGUwen;
import com.my.demo.manager.impl.TestManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    private ApplicationContext context;

    public TestMain(ApplicationContext context) {
        this.context = context;
    }

    public void doApplicationContext() {
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

    public void testDao() {
        Demo2 demo2 = (Demo2) context.getBean("demo2");
        //jdbc
//        demo2.insert();
        //数据源
        demo2.select();
    }
    public void testDaoForTransaction() {
        Demo1 demo1 = (Demo1) context.getBean("demo1");
        //jdbc
        demo1.insert();
        //数据源
//        demo2.run2();
    }
    /**
     * xml 配置注解
     */
    public void adviceForXml() {
        TestManager TestManagerImpl1 = (TestManager) context.getBean("testAdviceForXml");
//        TestManagerImpl1.testAdd();
//          TestManagerImpl1.testAdd3();//有异常也触发
//        TestManagerImpl1.testAdd4();//after-returning 有异常不触发
//        TestManagerImpl1.testAdd5();//after-throwing  有异常才触发
        TestManagerImpl1.testAdd6();//around
    }

    /**
     * 需要配置开启aop自动代理 <aop:aspectj-autoproxy></aop:aspectj-autoproxy/>
     */
    public void adviceForAnnotation() {
        TestManager TestManagerImpl1 = (TestManager) context.getBean("testAdviceForAnnotationImpl");
        TestManagerImpl1.testAdd();
        TestManagerImpl1.testAdd3();//有异常也触发
        TestManagerImpl1.testAdd4();//after-returning 有异常不触发
        TestManagerImpl1.testAdd6();//around
        TestManagerImpl1.testAdd5();//after-throwing  有异常才触发
    }

    /**
     * 需要配置开启aop自动代理 <aop:aspectj-autoproxy></aop:aspectj-autoproxy/>
     * aop:advisor
     */
    public void advice() {
        TestAdviceForGUwen TestAdviceForGUwen = (TestAdviceForGUwen) context.getBean("testAdviceForGUwen");
        TestAdviceForGUwen.testAdd("123123123");

    }

    public void AaaMapper() {
        AaaMapper AaaMapper = (AaaMapper) context.getBean("aaaMapper");
        System.out.println(AaaMapper.getA("10000"));

    }

    public static void main(String[] a) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestMain t = new TestMain(context);
//        t.doApplicationContext();
//        t.testDao();
//        t.testDaoForTransaction();
//        t.advice();
//        t.adviceForAnnotation();
//        t.adviceForXml();
        t.AaaMapper();

    }

}
