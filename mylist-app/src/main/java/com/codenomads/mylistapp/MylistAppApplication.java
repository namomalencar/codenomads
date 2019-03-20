package com.codenomads.mylistapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MylistAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MylistAppApplication.class, args);
	}

}
