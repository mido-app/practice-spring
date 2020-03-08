package com.midoapp.spring_practice.rest_comsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestConsumerController {
    private static final Logger logger = LoggerFactory.getLogger(RestConsumerController.class);

    private final RestTemplate restTemplate;

    public RestConsumerController(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    @GetMapping("/rest-consumer")
    public Quote get() {
        Quote quote = this.restTemplate.getForObject(
            "https://gturnquist-quoters.cfapps.io/api/random",
            Quote.class
        );
        return quote;
    }
}
