package com.example.mapper.controller;

import com.example.mapper.model.Student;
import com.example.mapper.service.StudentService;
import com.example.vo.QueryParam;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/student/queryByObject")
    @ResponseBody
    public  String queryStudent(Student student){
        final StringBuilder sb = new StringBuilder();
        final List<Student> studentList = studentService.queryStudent(student);
        studentList.forEach(studentDO->
                sb.append(studentDO.toString()).append("\r\n"));
        return sb.toString() ;
    }

    @RequestMapping("/student/queryByParam")
    @ResponseBody
    public  String queryStudents(Student student){
        final StringBuilder sb = new StringBuilder();
        final QueryParam queryParam = new QueryParam();
        queryParam.setParam1(student.getName());
        queryParam.setParam2(student.getAge());
        final List<Student> studentList = studentService.queryStudent(queryParam);
        studentList.forEach(studentDO->
                sb.append(studentDO.toString()).append("\r\n"));
        return sb.toString() ;
    }

    @RequestMapping("/student/queryByMap")
    @ResponseBody
    public  String queryStudentByMap(Student student){
        final StringBuilder sb = new StringBuilder();
        final Map<String, Object> map = new HashMap<>(16);
        map.put("name",student.getName());
        map.put("age",student.getAge());
        final List<Student> studentList = studentService.queryStudent(map);
        studentList.forEach(studentDO->
                sb.append(studentDO.toString()).append("\r\n"));
        return sb.toString() ;
    }

    @RequestMapping("/student/updateStudent")
    @ResponseBody
    public  String updateStudent(@NotNull Student student){
        return studentService.updateStudent(student);
    }

}

