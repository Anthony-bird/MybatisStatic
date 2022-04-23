package com.example.mapper.service.impl;

import com.example.mapper.dao.StudentDao;
import com.example.mapper.model.Student;
import com.example.mapper.service.StudentService;
import com.example.vo.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Student> queryStudent(Student student) {
        final List<Student> studentList = studentDao.selectByObject(student);
        return studentList;
    }

    @Override
    public List<Student> queryStudent(QueryParam queryParam) {
        final List<Student> studentList = studentDao.selectByQueryParam(queryParam);
        return studentList;
    }

    @Override
    public List<Student> queryStudent(Map<String, Object> map) {
        final List<Student> studentList = studentDao.selectByMap(map);
        return studentList;
    }

    @Override
    public String updateStudent(Student student) {
        final int i = studentDao.updateStudent(student);
        if (i==0) {
            return "更新失败";
        } else {
            return  "更新成功";
        }

    }
}
