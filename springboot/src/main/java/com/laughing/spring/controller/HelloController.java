package com.laughing.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : laughing
 * @create : 2021-07-08 22:58
 * @description :
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @Value("${database}")
    private String name;

    @Value("${person.name}")
    private String pName;

    @Value("${language[0]}")
    private String language;

    @Value("${go}")
    private String golang;

    @GetMapping("/name")
    public String getName() {
        return name + " " + pName + " " + language;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot...";
    }
}
