package com.my.demo.manager.impl;

import com.my.demo.manager.TestManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * xml配置倒入bean
 */
@Service("testAdviceForGUwen")
public class TestAdviceForGUwen{



    public String testAdd(String a) {
        System.out.println("----TestAdviceForGUwen----------添加ok"+a);
        return null;
    }






}
