package com.example.demo.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String doGetHelloWorkd()
    {
        return "Hello World";
    }
}
