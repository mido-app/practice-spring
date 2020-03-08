package com.midoapp.spring_practice.example;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ExampleController {

    @GetMapping("/example")
    public ExampleResponse home(@RequestParam(defaultValue = "World") String name) {
        return new ExampleResponse(String.format("Hello, %s!", name));
    }
}