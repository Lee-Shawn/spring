package com.laughing.spring.dao;

import com.laughing.spring.domain.Student;

import java.util.List;

/**
 * @author : laughing
 * @create : 2021-04-10 23:06
 * @description :
 */
public interface StudentDao {
    int addStudent(Student student);
    List<Student> getStudents();
    List<Student> getStudentByPage();
    int getAllNum();
}
