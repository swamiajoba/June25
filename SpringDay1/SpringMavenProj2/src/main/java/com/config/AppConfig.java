package com.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bean.*;

@Configuration
public class AppConfig {

	@Bean(name="address")
	public Address getAddr() 	{
		Address addr=new Address();
		addr.setAid(111);
		addr.setCity("Mumbai");
		addr.setZip("400 012");
		return addr;
	}
	
	@Bean
	//@Scope(value="prototype")
	public Employee empbean()  {  /// method name will act as bean id or name
		Employee e=new Employee();
		e.setEid(100);
		e.setEname("Pooja");
		e.setSalary(35000.00);
		e.setAddress(getAddr());
		return e;
	}
}
