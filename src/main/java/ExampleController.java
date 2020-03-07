import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class ExampleController {

    @RequestMapping("/")
    String home() {
        return "Hello Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleController.class, args);
    }
}