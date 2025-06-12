package com.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bean.*;

@Configuration
public class AppConfig {

	@Bean(name="address")
	public Address getAddr()
	{
		Address addr=new Address(111,"Mumbai","400 012");
		return addr;
	}
	
	@Bean
	//@Scope(value="prototype")
	public Employee empbean()
	{
		Employee e=new Employee(100,"Amit",50000.00,getAddr());
		return e;
	}
}
