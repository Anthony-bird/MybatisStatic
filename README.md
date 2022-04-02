# MybatisStatic
mybatis框架学习资料
1.三层架构：界面层：接受客户端的输入，调用业务逻辑层进行功能处理，返回结果给客服端，servlet就是界面层的功能
业务逻辑层：进行项目的业务逻辑处理，上面连接界面层提供处理结果，下面连接数据访问层拿数据
数据访问层：进行数据的增删改查，上面连接业务逻辑层
界面层《---》业务逻辑层《---》数据访问层

2.SSM: Spring 是整合其它框架的框架。它的核心是IOC和AOP
SpringMVC：它是Spring家族的一员，专门用来优化控制器servlet
MyBatis：是持久化的一个框架，进行数据库优化，专注于sql，简化JDBC

3.<!DOCTYPE configuration PUBLIC
        "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd"> 是mybatis头文件约束

4.数据库连接池：客服端通过数据库连接池连接数据库