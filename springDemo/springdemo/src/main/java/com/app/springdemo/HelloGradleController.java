package com.app.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloGradleController {
    
    @GetMapping
    public String getHello() {
        return "Hello Spring Boot with Gradle";
    }
}
