package com.woniuxy.movie.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.woniuxy.movie.controller")
@ComponentScan("com.woniuxy.movie.service.imp")
@MapperScan("com.woniuxy.movie.dao")
@EnableEurekaClient//代表客户端
public class Applicationmovie {
	public static void main(String[] args) {
		SpringApplication.run(Applicationmovie.class, args);
	}
}
