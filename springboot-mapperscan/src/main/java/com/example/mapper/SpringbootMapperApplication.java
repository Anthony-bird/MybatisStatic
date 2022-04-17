package com.example.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan: 找到Dao接口和所在的Mapper文件,
 *    替代在每一个Dao接口上面写Mapper注解
 *    basePackages : Dao接口所在的包名 ,可以是一个数组，匹配多个包名，
 *    例如：@MapperScan(basePackages =
 *    {"com.bjpowernode.dao","com.bjpowernode.mapper"})
 *    */
@SpringBootApplication
@MapperScan(basePackages = "com.example.mapper.dao")
public class SpringbootMapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMapperApplication.class, args);
	}

}
