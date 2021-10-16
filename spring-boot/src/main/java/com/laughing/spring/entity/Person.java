package com.laughing.spring.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : laughing
 * @create : 2021-07-11 18:21
 * @description :
 */
@Component
@ConfigurationProperties(prefix = "person") // 读取配置文件，前缀是person的属性
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
