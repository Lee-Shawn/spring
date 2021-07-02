package com.laughing.spring.controller;

import com.laughing.spring.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : laughing
 * @create : 2021-04-05 12:31
 * @description : springmvc控制器
 */
@Controller // 表示当前类为处理器
@RequestMapping("/hello")
public class HelloController {

    /**
     * 处理用户的请求
     * @RequestMapping 请求映射，把一个请求地址和一个方法绑定在一起
     *      value: String，表示请求的地址（some.do），值必须唯一
     *             使用 RequestMapping 修饰的方法叫做处理器方法或者控制器方法
     *             使用 @RequestMapping 修饰的方法可以处理请求，类似 servlet 的 doGet 或者 doPost
     * @return ModelAndView
     *      model: 数据，请求处理完成后显示给用户的数据
     *      view:  视图，jsp等
     */
    @RequestMapping(value = {"/some.do","first.do"}, method = RequestMethod.GET)
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        // 添加数据，框架在请求的最后把数据放入到 request 作用域
        // request.setAttribute("msg", "使用SpringMVC开发");
        mv.addObject("msg", "使用SpringMVC开发");
        mv.addObject("fun", "执行doSome方法");
        // 指定视图，指定视图的完整路径
        // request.getRequestDispatcher("/show.jsp").forward(..)
        mv.setViewName("show");
        return mv;
    }

    /**
     * POST 提交
     * @return
     */
    @RequestMapping(value = "/other.do", method = RequestMethod.POST)
    public ModelAndView doOther() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "获取other数据");
        mv.addObject("fun", "执行doOther方法");
        mv.setViewName("other");
        return mv;
    }

    /**
     * 框架接收请求参数
     *     1. 使用 request 对象接收请求参数
     *     String name = request.getParameter("name");
     *     String age = request.getParameter("age");
     *     2. springmvc 通过 DispatcherServlet调用 getParam 方法，按对应的名称把接收的参数赋值给形参
     *     框架会将 string 相应的转换成 int，double 等类型
     * @param name 形参名称必须与接收的参数名称一致
     * @param age
     * @return
     */
    @RequestMapping(value = "/param.do", method = RequestMethod.POST)
    public ModelAndView getParam(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        // request.setAttribute("myName",name);
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        mv.setViewName("param");
        return mv;
    }

    /**
     * 请求参数名和处理器方法形参名不一致
     * @RequestParam 解决请求参数名和形参名不一致的问题
     *      value 请求参数名称
     *      require 默认是 true，表示次参数必须传递值
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/different.do")
    public ModelAndView getDifferentParam(@RequestParam(value = "lName") String name,
                                          @RequestParam(value = "lAge", required = false) Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        mv.setViewName("different");
        return mv;
    }

    /**
     * 处理器方法形参是Java对象，对象的属性名和请求的参数名一致
     * @param student
     * @return
     */
    @RequestMapping(value = "/student.do")
    public ModelAndView object(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", student.getName());
        mv.addObject("myAge", student.getAge());
        mv.addObject("myStudent", student);
        mv.setViewName("student");
        return mv;
    }
}
