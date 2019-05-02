package com.my.demo.dao;

import com.my.demo.domain.Aaa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * 注解事务
 */
@Component
public class Demo1 extends JdbcDaoSupport {
    @Autowired
    private DataSource dataSource;

    public void select() {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();
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

    @Transactional
    public void insert() {
        JdbcTemplate jdbcTemplate = getJdbcTemplate();

        if (jdbcTemplate == null) {
            System.out.println("--------");
        }
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                int o = i / 0;
            }
            jdbcTemplate.update("insert into aaa values (?,?)", new Date().getTime(), 10000);

        }
    }

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }
}
