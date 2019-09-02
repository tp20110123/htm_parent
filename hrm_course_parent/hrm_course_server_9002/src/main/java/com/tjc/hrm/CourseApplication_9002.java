package com.tjc.hrm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.tjc.hrm.mapper")
public class CourseApplication_9002 {
    public static void main(String[] args) {
        SpringApplication.run(CourseApplication_9002.class,args);
    }
}
