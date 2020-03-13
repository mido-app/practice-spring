package com.midoapp.spring_practice.example1.hello;

public class ExampleResponse {
    private final String message;

    public ExampleResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
