package example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ExampleController {

    @GetMapping("/example")
    public ExampleResponse home(@RequestParam(defaultValue = "World") String name) {
        return new ExampleResponse(String.format("Hello, %s!", name));
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleController.class, args);
    }
}