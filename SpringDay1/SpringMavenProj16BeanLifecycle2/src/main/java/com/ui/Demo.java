package com.ui;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.bean.*;
public class Demo {

	public static void main(String[] args) {

//		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(com.config.AppConfig.class);

		Employee e=(Employee)context.getBean("empbean");
	    System.out.println(e);  

	}

}
