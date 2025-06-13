package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.bean.User;

@Configuration
@PropertySource("classpath:user.properties")
public class AppConfig {
	  @Autowired
	   private Environment env;
	  
	  @Bean
	  public User user() {
		  User ob=new User();
		  ob.setUsername(env.getProperty("myname"));
		  ob.setPassword(env.getProperty("password"));
		  return ob;
	  }

}
