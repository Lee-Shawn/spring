package com.laughing.spring.test;

import com.laughing.spring.service.SomeService;
import com.laughing.spring.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : laughing
 * @create : 2021-07-02 20:54
 * @description :
 */
public class SpringTest {
    @Test
    public void test() {
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }

    @Test
    public void testIoC() {
        // 创建spring容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 从容器中获取对象
        SomeService some = context.getBean("some", SomeService.class);
        some.doSome();
    }
}
