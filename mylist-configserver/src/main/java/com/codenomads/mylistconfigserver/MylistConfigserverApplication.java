package com.codenomads.mylistconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MylistConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MylistConfigserverApplication.class, args);
	}

}
