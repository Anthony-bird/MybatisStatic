package com.example.mapper.controller;

import com.example.mapper.model.Student;
import com.example.mapper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public  String queryStudent(Integer id){
        final Student student = studentService.queryStudent(id);
        return student.toString() ;
    }
}
