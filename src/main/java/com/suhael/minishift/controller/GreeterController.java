package com.suhael.minishift.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @Value("${greeter.message}")
    private String greeterMessageFormat;

    @Value("${greeter.prefix}")
    private String greeterPrefix;

    @GetMapping("/greet")
    public String greet() {
        String prefix = greeterPrefix;
        if (prefix == null) {
            prefix = "Hello!";
        }

        return prefix + ": " + greeterMessageFormat;
    }
}