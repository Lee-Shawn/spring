package com.laughing.spring.service.impl;

import com.laughing.spring.dao.StudentDao;
import com.laughing.spring.domain.Student;
import com.laughing.spring.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : laughing
 * @create : 2021-04-11 0:16
 * @description :
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public int registerStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public List<Student> queryStudents() {
        return studentDao.getStudents();
    }

    @Override
    public List<Student> getStudents() {
        return studentDao.getStudentByPage();
    }

    @Override
    public int getAllNum() {
        return studentDao.getAllNum();
    }
}
