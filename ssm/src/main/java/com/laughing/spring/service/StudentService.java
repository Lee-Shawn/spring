package com.laughing.spring.service;

import com.laughing.spring.domain.Student;

import java.util.List;

/**
 * @author : laughing
 * @create : 2021-04-11 0:15
 * @description :
 */
public interface StudentService {
    int registerStudent(Student student);
    List<Student> queryStudents();
    List<Student> getStudents();
    int getAllNum();
}
