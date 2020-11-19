package com.hrproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hrproject.dao")  //用于springboot扫描dao包下的内容
public class HrProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrProjectApplication.class, args);
    }

}
