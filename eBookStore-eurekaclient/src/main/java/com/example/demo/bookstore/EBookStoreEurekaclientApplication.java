package com.example.demo.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EBookStoreEurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBookStoreEurekaclientApplication.class, args);
	}

}
