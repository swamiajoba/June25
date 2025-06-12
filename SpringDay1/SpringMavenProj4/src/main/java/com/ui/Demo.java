package com.ui;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.bean.Employee;
public class Demo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(com.config.AppConfig.class);
		Employee e=(Employee)context.getBean("empbean");
	    System.out.println(e);  
	    
	    Employee e1=(Employee)context.getBean("empbean");
	    System.out.println(e1); 
	}

}
