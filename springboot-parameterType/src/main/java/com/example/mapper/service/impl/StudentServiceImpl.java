package com.example.mapper.service.impl;

import com.example.mapper.dao.StudentDao;
import com.example.mapper.model.Student;
import com.example.mapper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        final Student student = studentDao.selectById(id);
        return student;
    }

    @Override
    public Student queryStudent(String email) {
        final Student student = studentDao.selectByEmail(email);
        return student;
    }

    @Override
    public List<Student> queryStudent(String name, Integer age) {
        final List<Student> studentList = studentDao.selectByNameOrAge(name, age);
        return studentList;
    }
}
