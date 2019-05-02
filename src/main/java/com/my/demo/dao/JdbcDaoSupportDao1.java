package com.my.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.Date;


public class JdbcDaoSupportDao1 extends JdbcDaoSupport {


    public void run() {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
        if (jdbcTemplate == null) {
            System.out.println("--------");
        }
        jdbcTemplate.update("insert into aaa values (?,?)", 12, 10000);
        jdbcTemplate.queryForObject("", Demo2.class);
    }

}
