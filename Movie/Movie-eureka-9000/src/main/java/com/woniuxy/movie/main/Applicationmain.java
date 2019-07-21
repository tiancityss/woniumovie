package com.woniuxy.movie.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class Applicationmain {
public static void main(String[] args) {
	SpringApplication.run(Applicationmain.class, args);
}
}
