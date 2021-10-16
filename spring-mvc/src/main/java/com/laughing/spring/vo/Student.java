package com.laughing.spring.vo;

/**
 * @author : laughing
 * @create : 2021-04-05 16:55
 * @description :
 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
