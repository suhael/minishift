package com.suhael.minishift.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @Value("${greeter.message}")
    private String greeterMessageFormat;

    @Value("${greeter.prefix}")
    private String greeterPrefix;

    @GetMapping("/greet/{user}")
    public String greet(@PathVariable("user") String user) {
        String prefix = greeterPrefix;
        System.out.printf("Prefix :{} and User:{}", prefix, user);
        if (prefix == null) {
            prefix = "Hello!";
        }

        return prefix + greeterMessageFormat +    user;
    }
}