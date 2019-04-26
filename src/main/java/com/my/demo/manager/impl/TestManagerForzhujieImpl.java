package com.my.demo.manager.impl;

import com.my.demo.manager.TestManager;
import org.springframework.stereotype.Component;

/**
 * 注解倒入bean
 */
@Component
public class TestManagerForzhujieImpl implements TestManager {

    @Override
    public String testAdd() {
        System.out.println("--------------添加ok--注解");
        return null;
    }
}
