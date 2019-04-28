package com.my.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.Date;


public class Demo2 {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Resource(name = "jdbcTemplate2")
    private JdbcTemplate jdbcTemplate2;
    public void run(){
        if(jdbcTemplate == null){
            System.out.println("--------");
        }
        jdbcTemplate.update("insert into aaa values (?,?)", 12,10000);
    }

    public void run2(){
        if(jdbcTemplate == null){
            System.out.println("--------");
        }
        jdbcTemplate2.update("insert into aaa values (?,?)", new Date().getTime(),10000);
    }
}
