package com.laughing.spring.service.impl;

import com.laughing.spring.service.AspectJService;

/**
 * @author : laughing
 * @create : 2021-07-04 21:08
 * @description : AOP
 */
public class AspectJServiceImpl implements AspectJService {
    @Override
    public void getInfo(String name, Integer age) {
        System.out.println("name: " + name + ", age: " + age);
    }
}
