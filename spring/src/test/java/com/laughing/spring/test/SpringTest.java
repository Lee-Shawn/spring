package com.laughing.spring.test;

import com.laughing.spring.config.EmployeeConfig;
import com.laughing.spring.entity.Employee;
import com.laughing.spring.entity.Student;
import com.laughing.spring.entity.User;
import com.laughing.spring.service.AspectJService;
import com.laughing.spring.service.SomeService;
import com.laughing.spring.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    @Test
    public void testByName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void testByType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = context.getBean("testUser", User.class);
        System.out.println(user);
    }

    @Test
    public void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee employee = context.getBean("emp", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void testAOPXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        AspectJService proxy = context.getBean("serviceTarget", AspectJService.class);
        proxy.getInfo("laughing", 20);
    }

    /*@Test
    public void testAoP() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        AspectJServiceImpl service = context.getBean("service", AspectJServiceImpl.class);
        System.out.println(service);
    }*/
}
