package com.project;


import com.project.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void testA() throws IOException {
              //使用文件流读取核心配置文件SqlMapConfig.xml
         InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
         SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //取出SqlSession的对象
         SqlSession sqlSession = factory.openSession();
        //完成查询操作
         List<Student> list = sqlSession.selectList("zar.getAll");
        list.forEach(student -> System.out.println(student));
        //关闭sqlSession
        sqlSession.close();
    }

}
