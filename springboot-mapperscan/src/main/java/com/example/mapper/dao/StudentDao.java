package com.example.mapper.dao;

import com.example.mapper.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * @Mapper:告诉Mybatis是Dao接口，创建接口的代理对象
 *      位置:在类的上面
 *  */
@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
