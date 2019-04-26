package com.my.demo.manager.impl;

import com.my.demo.manager.TestManager;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * xml配置倒入bean
 */
public class TestManagerImpl implements TestManager {
    private String string;
    private Map<String,String> map;
    private List<TestManagerFactory> listObject;
    private List<String> listString;
    private Set<String> setString;
    private TestManagerFactory testManagerFactory;


    @Override
    public String testAdd() {
        System.out.println("--------------添加ok");
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
