package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"hello"})
public class HelloController {
    @GetMapping
    User hello() {
        return new User(1, "aitaso", "alitaso@gmail.com");
    }
}
