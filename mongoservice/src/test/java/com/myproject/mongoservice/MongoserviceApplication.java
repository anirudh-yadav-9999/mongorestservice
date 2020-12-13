package com.myproject.mongoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication


@EnableAutoConfiguration

@ComponentScan(basePackages="com.myproject")

@EnableMongoRepositories("com.spring.app.repository")
public class MongoserviceApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext context=
		SpringApplication.run(MongoserviceApplication.class, args);
		System.out.println("Main method");
	}

}
