package com.example.lombokdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
@MapperScan("com.example.lombokdemo.mapper")
@EnableCaching
@SpringBootApplication
public class LombokdemoApplication {
//hutaoying tsest
    public static void main(String[] args) {
        SpringApplication.run(LombokdemoApplication.class, args);
    }
}
