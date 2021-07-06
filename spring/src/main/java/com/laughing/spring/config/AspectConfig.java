package com.laughing.spring.config;

import com.laughing.spring.aspect.MyAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : laughing
 * @create : 2021-07-04 21:47
 * @description :
 */
// 启动AspectJ自动代理
@Configuration
// @EnableAspectJAutoProxy(proxyTargetClass = true) true使用cglib动态代理，false（默认）用jdk动态代理
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.laughing.spring.service.impl")
public class AspectConfig {
    // 切面对象
    @Bean
    public MyAspect myAspect() {
        return new MyAspect();
    }
}
