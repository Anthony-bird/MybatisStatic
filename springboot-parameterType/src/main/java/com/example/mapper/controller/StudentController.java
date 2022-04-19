package com.example.mapper.controller;

import com.example.mapper.model.Student;
import com.example.mapper.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    private final static Logger logger =
            LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/query")
    @ResponseBody
    public  String queryStudent(Integer id){
        final Student student = studentService.queryStudent(id);
        return student.toString() ;
    }

    @RequestMapping("/student/queryByEmail")
    @ResponseBody
    public  String queryStudent(String email){
        logger.info("获取到的email为:{}",email);

        final Student student = studentService.queryStudent(email);
        return student.toString() ;
    }

    @RequestMapping("/student/queryByNameOrAge")
    @ResponseBody
    public  String queryStudent(String name,Integer age){
        final StringBuilder sb = new StringBuilder();
        final List<Student> studentList = studentService.queryStudent(name, age);
        studentList.forEach(o->
        sb.append(o.toString()).append("\r\n"));
        return sb.toString() ;
    }
}
