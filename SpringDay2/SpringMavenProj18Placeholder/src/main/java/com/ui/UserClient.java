package com.ui;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.bean.User;

public class UserClient {

	public static void main(String args[]) throws Exception {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = (User) ctx.getBean("user");
//		System.out.println(user.getUsername());
		
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		PropertyPlaceholderConfigurer cfg = new PropertyPlaceholderConfigurer();
		cfg.setLocation(new ClassPathResource("user.properties"));
		cfg.postProcessBeanFactory(factory);  // register PropertyPlaceholderConfigurer cfg with BeanFactory
		User user = (User) factory.getBean("user");
		System.out.println(user.getUsername());			
		
	}
}
