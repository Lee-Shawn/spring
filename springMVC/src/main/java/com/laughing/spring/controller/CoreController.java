package com.laughing.spring.controller;

import com.laughing.spring.exception.AgeException;
import com.laughing.spring.exception.MyUserException;
import com.laughing.spring.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author : laughing
 * @create : 2021-04-11 13:40
 * @description :
 */
@Controller
@RequestMapping("/core")
public class CoreController {

    /**
     * 处理器方法返回ModelAndView，实现转发到其他的视图页面
     * forward不和视图解析器一同工作
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/forward")
    public ModelAndView forward(String name, Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        // 显式指定转发操作
        mv.setViewName("forward:/WEB-INF/view/param.jsp");
        // 转发到视图解析器未配置的地址
        //mv.setViewName("forward:/hello.jsp");
        return mv;
    }

    /**
     * 处理器方法返回ModelAndView，实现重定向到其他的视图页面
     * @return
     */
    @RequestMapping("/redirect")
    public ModelAndView redirect(String name, Integer age) {
        System.out.println(name + "," + age);
        ModelAndView mv = new ModelAndView();
        // 重定向不能访问WEB-INF下面的内容
        mv.setViewName("redirect:/hello.jsp");
        return mv;
    }

    @RequestMapping("/handler")
    public ModelAndView handler(String name, Integer age) throws MyUserException {
        ModelAndView mv = new ModelAndView();
        if (!"lyj".equals(name)) {
            throw new NameException("姓名不正确！");
        }
        if (age > 100) {
            throw new AgeException("年龄值太大！");
        }
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        mv.setViewName("param");
        return mv;
    }

    @RequestMapping("/interceptor")
    public ModelAndView interceptor(String name, Integer age, HttpSession session) {
        System.out.println("执行interceptor()");
        ModelAndView mv = new ModelAndView();
        mv.addObject("myName", name);
        mv.addObject("myAge", age);
        mv.setViewName("param");
        session.setAttribute("attr", "session中的数据");
        return mv;
    }

    @RequestMapping("/system")
    public ModelAndView system() {
        System.out.println("进入系统");
        return new ModelAndView("system");
    }
}
