package com.laughing.spring.controller;

import com.laughing.spring.bean.PageBean;
import com.laughing.spring.domain.Student;
import com.laughing.spring.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : laughing
 * @create : 2021-04-11 0:23
 * @description :
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService service;

    @RequestMapping("/addStudent")
    public ModelAndView addStudent(Student student) {
        ModelAndView mv = new ModelAndView();
        int i = service.registerStudent(student);
        if (i > 0) {
            mv.addObject("msg", "添加成功！");
            mv.setViewName("success");
        } else {
            mv.addObject("msg", "添加失败！");
            mv.setViewName("fail");
        }
        return mv;
    }

    @RequestMapping("/queryStudent")
    @ResponseBody
    public List<Student> queryStudent() {
        return service.queryStudents();
    }

    @RequestMapping("/pageStudent")
    @ResponseBody
    public List<Student> getStudentByPage(int pageNum, int pageSize) {
        PageBean<Student> pageBean = new PageBean<>();
        List<Student> students = null;
        if (pageNum > 0 && pageSize > 0) {
            int totalRecord = service.getAllNum();
            pageBean = new PageBean(pageNum, pageSize, totalRecord);
            int startIndex = (pageNum-1)*pageSize;
            pageBean.setStartIndex(startIndex);
            students = service.getStudents();
            students.forEach(System.out::println);
        }
        return students;
    }
}
