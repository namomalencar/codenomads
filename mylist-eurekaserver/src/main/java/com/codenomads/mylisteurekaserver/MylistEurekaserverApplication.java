package com.codenomads.mylisteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MylistEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MylistEurekaserverApplication.class, args);
	}

}
