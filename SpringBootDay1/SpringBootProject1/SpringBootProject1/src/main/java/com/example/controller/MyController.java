package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	// url = http://localhost:8082/hello
	@RequestMapping("/hello")
	public String sayHello() {
		return "Welcome to Spring Boot. Hello Everybody!!!!";
	}

}
