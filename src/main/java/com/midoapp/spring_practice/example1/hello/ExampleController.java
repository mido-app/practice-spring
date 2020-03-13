package com.midoapp.spring_practice.example1.hello;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 * Hello, World!
 */
@RestController
@EnableAutoConfiguration
public class ExampleController {

    @GetMapping("/example")
    public ExampleResponse home(@RequestParam(defaultValue = "World") String name) {
        return new ExampleResponse(String.format("Hello, %s!", name));
    }
}