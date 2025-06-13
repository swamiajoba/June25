package com.ui;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.User;

public class UserClient {

	public static void main(String args[]) throws Exception {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(com.config.AppConfig.class);
		User user = (User) ctx.getBean("user");
		System.out.println(user.getUsername());
		
	
		
	}
}
