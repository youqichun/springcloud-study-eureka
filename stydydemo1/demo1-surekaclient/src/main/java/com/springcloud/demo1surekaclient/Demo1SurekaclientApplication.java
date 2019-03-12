package com.springcloud.demo1surekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient	//标识当前为服务提供者Client
@RestController
public class Demo1SurekaclientApplication {
	@Value("${server.port}")		//获取yml文件的配置
	String port;

	public static void main(String[] args) {
		SpringApplication.run(Demo1SurekaclientApplication.class, args);
	}

	@RequestMapping("/index")
	public String index(@RequestParam String name){
		return "current "+name+" get port value="+port;
	}

}
