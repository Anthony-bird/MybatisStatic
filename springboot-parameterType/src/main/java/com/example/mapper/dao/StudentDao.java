package com.example.mapper.dao;

import com.example.mapper.model.Student;
import com.example.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 一个Java对象作为参数
     * */
    List<Student> selectByObject(Student student);

    List<Student> selectByQueryParam(QueryParam queryParam);

    List<Student> selectByMap(Map<String, Object> map);

    /**
     * 更新
     * */
    int updateStudent(Student student);
}
