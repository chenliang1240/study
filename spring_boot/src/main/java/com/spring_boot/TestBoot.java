package com.spring_boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring_boot.dao")
public class TestBoot {
	public static void main(String[] args) {
		SpringApplication.run(TestBoot.class, args);
	}
}
