package com.demo.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xiemingjie
 * @version 1.0.0
 * @Type Application
 * @Desc
 * @Date 2017/8/16
 */
@ComponentScan("abc.aaa")
@MapperScan("abc.aaa.dao")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
