package com.laughing.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : laughing
 * @create : 2021-07-03 12:06
 * @description :
 */
@Component
public class Company {
    @Value("Tencent")
    private String name;
    @Value("Beijing")
    private String address;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
