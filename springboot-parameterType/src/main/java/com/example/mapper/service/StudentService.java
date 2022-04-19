package com.example.mapper.service;

import com.example.mapper.model.Student;

import java.util.List;

public interface StudentService {
   public   Student queryStudent(Integer id);
   public   Student queryStudent(String email);

   public  List<Student> queryStudent(String name,Integer age);
}
