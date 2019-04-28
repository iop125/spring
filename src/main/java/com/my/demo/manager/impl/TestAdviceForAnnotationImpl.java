package com.my.demo.manager.impl;

import com.my.demo.manager.TestManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * xml配置倒入bean
 */
@Service("testAdviceForAnnotationImpl")
public class TestAdviceForAnnotationImpl implements TestManager {
    private String string;
    private Map<String,String> map;
    private List<TestManagerFactory> listObject;
    private List<String> listString;
    private Set<String> setString;
    private TestManagerFactory testManagerFactory;


    @Override
    public String testAdd() {
        System.out.println("----TestAdviceForAnnotationImpl----------添加ok");
        return null;
    }

    @Override
    public String testAdd3() {
        System.out.println("-------TestAdviceForAnnotationImpl-------添加ok3");
        return null;
    }

    @Override
    public String testAdd4() {
        System.out.println("-------TestAdviceForAnnotationImpl-------添加ok4");
        return null;
    }

    @Override
    public String testAdd5() {
        System.out.println("--------TestAdviceForAnnotationImpl------添加ok5");
        int i=1/0;
        return null;
    }

    @Override
    public String testAdd6() {
        System.out.println("-----TestAdviceForAnnotationImpl---------添加ok6");
        return null;
    }

    public String testAdd2() {
        System.out.println("------TestAdviceForAnnotationImpl--------添加ok2");
        return null;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public List<String> getListString() {
        return listString;
    }

    public void setListString(List<String> listString) {
        this.listString = listString;
    }

    public Set<String> getSetString() {
        return setString;
    }

    public void setSetString(Set<String> setString) {
        this.setString = setString;
    }

    public TestManagerFactory getTestManagerFactory() {
        return testManagerFactory;
    }

    public void setTestManagerFactory(TestManagerFactory testManagerFactory) {
        this.testManagerFactory = testManagerFactory;
    }

    public void setListObject(List<TestManagerFactory> listObject) {
        this.listObject = listObject;
    }
}
