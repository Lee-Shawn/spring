package com.laughing.spring.service.impl;

import com.laughing.spring.service.SomeService;

/**
 * @author : laughing
 * @create : 2021-07-02 20:46
 * @description :
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行doSome方法...");
    }
}
