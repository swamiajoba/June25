package com.config;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.*;

@Configuration
public class AppConfig {

	@Bean(name="addrbean")
	public Address getAddr() 	{
		Address addr=new Address(111,"Mumbai","400 012",emps());
		return addr;
	}
	
	//@Bean
	public List<String> emps() 	{
		
		return Arrays.asList("Amit Pawar","Pooja C.","Jitesh Gurav","Jitesh Gurav");
	}
}
