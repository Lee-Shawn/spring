package com.laughing.spring.test;

import com.laughing.spring.entity.Student;
import com.laughing.spring.entity.User;
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
    // 创建spring容器对象，创建容器对象时，会创建配置文件中的所有对象，默认调用无参构造器
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    public void test() {
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }

    @Test
    public void testIoC() {
        // 从容器中获取对象
        SomeService some = context.getBean("some", SomeService.class);
        some.doSome();
    }

    @Test
    public void testDI() {
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testReference() {
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void testConstructor() {
        User laughing = context.getBean("laughing", User.class);
        System.out.println(laughing);
    }
}
