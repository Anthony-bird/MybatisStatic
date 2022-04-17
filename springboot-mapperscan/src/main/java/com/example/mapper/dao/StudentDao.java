package com.example.mapper.dao;

import com.example.mapper.model.Student;
import org.apache.ibatis.annotations.Param;


public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
