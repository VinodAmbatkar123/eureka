package com.example.demo.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EBookStoreEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBookStoreEurekaserverApplication.class, args);
	}

}
