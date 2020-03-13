package com.midoapp.spring_practice.example3_jdbc_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDBCSampleController {

    @Autowired
    private JDBCSampleService service;

    @GetMapping("/example3/person")
    public Person get(@RequestParam int id) {
        return service.getById(id);
    }
}
