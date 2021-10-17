package com.laughing.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : laughing
 * @create : 2021-10-17 13:36
 * @description :
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
