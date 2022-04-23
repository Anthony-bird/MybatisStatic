package com.example.mapper.service;

import com.example.mapper.model.Student;
import com.example.vo.QueryParam;

import java.util.List;
import java.util.Map;

public interface StudentService {
   public   Student queryStudent(Integer id);
   public   Student queryStudent(String email);

   public  List<Student> queryStudent(String name,Integer age);

   public  List<Student> queryStudent(Student student);
   public  List<Student> queryStudent(QueryParam queryParam);
   public  List<Student> queryStudent(Map<String, Object> map);

   public String updateStudent(Student student);
}
