package com.springcloud.demo1eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer		//启动一个服务注册中心,这个注解需要再Springboot工程的启动application类加上
public class Demo1Eureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Eureka1Application.class, args);
	}

}
