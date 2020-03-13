package com.midoapp.spring_practice.example3_jdbc_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class JDBCSampleService {
    @Autowired
    private JDBCSampleRepository repository;

    public Person getById(int id) {
        Map<String, Object> personMap = repository.getPersonById(id);
        Person person = new Person();
        person.setId((int)personMap.get("id"));
        person.setName((String)personMap.get("name"));
        person.setActive((boolean)personMap.get("active"));
        return person;
    }
}
