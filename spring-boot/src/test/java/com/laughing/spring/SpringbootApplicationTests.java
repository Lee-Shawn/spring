package com.laughing.spring;

import com.laughing.spring.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {
	@Autowired
	private HelloService helloService;

	@Test
	void contextLoads() {
		helloService.hello();
	}

}
