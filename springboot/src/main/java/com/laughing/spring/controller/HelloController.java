package com.laughing.spring.controller;

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

    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot...";
    }
}
