package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages= {"com.example"})
//@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject1Application.class, args);
	}
}
