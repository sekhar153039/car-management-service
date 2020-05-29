package com.quickwash.carmanagentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories(basePackages = "com.quickwash.carmanagentservice.repository")
public class CarManegementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarManegementServiceApplication.class, args);
	}

}
