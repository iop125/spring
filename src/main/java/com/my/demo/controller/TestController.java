package com.my.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class TestController {
    @Value("${plugin-cente.jdbc.password}")
    private String s;

    @RequestMapping("/ss")
    public String ss(){
        System.out.println("--------ss--");
        return "index";
    }
    @RequestMapping("/sss")
    public String sss(){
        System.out.println("---------sss-");
        return "index";
    }
}
