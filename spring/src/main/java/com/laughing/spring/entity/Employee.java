package com.laughing.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : laughing
 * @create : 2021-07-03 11:03
 * @description : 注解开发
 *
 * @Component: 创建对象，等同于xml中<bean>的功能
 *      属性：value是对象的名称，等同于bean的id值，value值是唯一的
 *      位置：放在类的上面
 *      @Component(value = "emp") <==> <bean id="emp" class="com.laughing.spring.entity.Employee" />
 *      value可以省略，@Component("emp")
 *      value值也可以省略，省略值，spring提供默认的对象名称，名称为类型首字母小写
 *
 * @Repository 用于对 DAO 实现类进行注解
 * @Service 用于对 Service 实现类进行注解
 *      创建业务层对象，业务层对象可以加入事务功能
 * @Controller 用于对 Controller 实现类进行注解
 *      创建的对象可以作为处理器接收用户的请求
 */
@Component(value = "emp")
public class Employee {
    /**
     * @Value 注入简单类型属性的值
     *      使用该注解完成属性注入时，类中无需setter
     *      若属性有 setter，则也可将其加到setter上
     */
    @Value("laughing")
    private String name;
    @Value("22")
    private Integer age;
    /**
     * 引用类型
     * @Autowired 实现引用类型的自动注入
     * spring中通过注解给引用类型赋值，使用的是自动注入原理，支持byName，byType
     * 默认使用byType主动注入，放在属性上面无须setter方法
     */
    @Autowired
    private Company company;

    public Employee() {
        System.out.println("Employee无参构造器...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company=" + company +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}