package com.example.mapper.dao;

import com.example.mapper.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);

    /**
    * 简单接口查询
    * */
    Student selectByEmail(String email);

    /**
     * 多个简单类型的参数
     * 使用@Param命名参数，在形参定义的前面，
     * value自定义参数的名称，可以省略
     * */
    List<Student> selectByNameOrAge(@Param("myname") String name,
                                 @Param("myage")  Integer age);
}
