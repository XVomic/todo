package com.xxc.todo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.xxc.todo.dao")
//也可以在配置文件中定义扫描路径
public class TodoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
