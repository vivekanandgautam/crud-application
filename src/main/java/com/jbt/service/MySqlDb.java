package com.jbt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MySqlDb {
    @Autowired
    public JdbcTemplate jdbcTemplate;


    public void method(){
        jdbcTemplate.execute("select * from customer");
    }
}
