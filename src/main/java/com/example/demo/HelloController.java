package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello World!</h1><p>The Spring Boot app is running and connected to MySQL.</p>";
    }
}
