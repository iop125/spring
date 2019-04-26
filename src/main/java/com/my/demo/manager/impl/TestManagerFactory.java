package com.my.demo.manager.impl;

import com.my.demo.manager.TestManager;

/**
 * xml配置倒入bean
 */
public class TestManagerFactory {

    public TestManager createTestManagerImpl() {
        System.out.println("--------------xml配置Factory创建bean成功");
        return new TestManagerImpl();
    }
}
