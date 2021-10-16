package com.laughing.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootConfiguration spring boot 配置类注解
 * @EnableAutoConfiguration spring boot 自动化配置
 * @ComponentScan 			spring boot 注解扫描
 * */
@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}
