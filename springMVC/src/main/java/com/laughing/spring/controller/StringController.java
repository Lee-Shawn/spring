package com.laughing.spring.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laughing.spring.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : laughing
 * @create : 2021-04-05 20:14
 * @description :
 */
@Controller
@RequestMapping("/string")
public class StringController {
    /**
     * 处理器方法返回string，表示逻辑视图名称，需要配置视图解析器
     * @return
     */
    @RequestMapping(value = "returnString.do")
    public String returnString(HttpServletRequest request, Student student) {
        request.setAttribute("myName", student.getName());
        request.setAttribute("myAge", student.getAge());
        request.setAttribute("myStudent", student);
        return "student";
    }

    @RequestMapping(value = "/ajax.do")
    public void ajax(String name, Integer age, HttpServletResponse response) throws IOException {
        // 调用service处理请求，把处理结果转为一个对象存储
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        // 使用jackson工具库，把student转化为json
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(student);
        System.out.println("json"+json);
        // 使用HttpServletResponse输出到浏览器
        PrintWriter printWriter = response.getWriter();
        printWriter.println(json);
        printWriter.flush();
        printWriter.close();
    }

    /**
     * 处理器方法返回Student，转换为json，响应ajax请求
     * @ResponseBody 把返回对象转换成json，通过HttpServletResponse输出数据，响应ajax请求
     */
    @RequestMapping(value = "/json.do")
    @ResponseBody
    public Student json() {
        // 调用service处理请求，把处理结果转为一个对象存储
        Student student = new Student();
        student.setName("laughing");
        student.setAge(22);
        return student;
    }

    /**
     * 处理器方法返回List，转换为json array，响应ajax请求
     * @ResponseBody 把返回对象转换成json array，通过HttpServletResponse输出数据，响应ajax请求
     */
    @RequestMapping(value = "/list.do")
    @ResponseBody
    public List<Student> arrayList() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("lyj");
        s1.setAge(22);
        list.add(s1);
        Student s2 = new Student();
        s2.setName("laughing");
        s2.setAge(28);
        list.add(s2);
        System.out.println(list);
        return list;
    }

    /**
     * 处理器方法返回String，表示数据，不是视图
     * 有@ResponseBody注解的表示数据，没有的表示视图
     * @return
     */
    @RequestMapping(value = "/toString", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String toString() {
        return "spring mvc 数据";
    }
}
