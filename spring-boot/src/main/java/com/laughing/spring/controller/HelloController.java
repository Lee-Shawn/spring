package com.laughing.spring.controller;

import com.laughing.spring.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : laughing
 * @create : 2021-07-08 22:58
 * @description : 获取配置文件属性
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

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @GetMapping("/name")
    public String getName() {
        System.out.println(golang);
        System.out.println(env.getProperty("language[1]"));
        System.out.println(person);
        return name + " " + pName + " " + language;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot...";
    }
}
