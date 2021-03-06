package com.example.distributedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author eddie.lee
 * @ProjectName distributed-lock
 * @Package PACKAGE_NAME
 * @ClassName com.example.distributedemo.Application
 * @description
 * @date created in 2020-12-10 15:22
 * @modified by
 */
@SpringBootApplication
@MapperScan("com.example.distributedemo.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
