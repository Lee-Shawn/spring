package com.laughing.spring.service.impl;

import com.laughing.spring.service.AspectJService;
import org.springframework.stereotype.Component;

/**
 * @author : laughing
 * @create : 2021-07-04 21:08
 * @description : AOP
 */
@Component
public class AspectJServiceImpl implements AspectJService {
    @Override
    public void getInfo(String name, Integer age) {
        System.out.println("name: " + name + ", age: " + age);
    }
}
