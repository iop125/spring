package com.my.demo.dao;

import com.my.demo.domain.Aaa;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


public class Demo2 extends JdbcDaoSupport {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Resource(name = "jdbcTemplate2")
    private JdbcTemplate jdbcTemplate2;


    public void select() {
        if (jdbcTemplate == null) {
            System.out.println("--------");
        }
        List<Aaa> Demo2 = jdbcTemplate.query("select * from aaa ", new RowMapper<Aaa>() {

            @Override
            public Aaa mapRow(ResultSet rs, int rowNum) throws SQLException {
                Aaa aaa = new Aaa();
                aaa.setId(rs.getLong("id"));
                aaa.setName(rs.getString("name"));


                return aaa;
            }
        });
        System.out.println(Demo2);
    }

    public void insert() {
        if (jdbcTemplate2 == null) {
            System.out.println("--------");
        }
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                int o = i / 0;
            }
            jdbcTemplate2.update("insert into aaa values (?,?)", new Date().getTime(), 10000);

        }
    }
}
