package com.laughing.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : laughing
 * @create : 2021-10-17 15:27
 * @description :
 */
@Controller
public class RegisterController {
    @RequestMapping("/register")
    public String register() {
        return "register";
    }
}
