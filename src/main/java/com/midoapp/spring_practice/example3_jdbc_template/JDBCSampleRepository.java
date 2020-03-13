package com.midoapp.spring_practice.example3_jdbc_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class JDBCSampleRepository {
    @Autowired
    private JdbcTemplate db;

    public Map<String, Object> getPersonById(int id) {
        String query = "select id, name, active from person where id = ?";
        return db.queryForMap(query, id);
    }
}
