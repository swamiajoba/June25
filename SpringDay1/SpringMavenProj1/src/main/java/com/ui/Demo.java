package com.ui;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.bean.Employee;

public class Demo {

	public static void main(String[] args) {
		
//		Resource resource=new ClassPathResource("applicationContext.xml");  
//	    BeanFactory factory=new XmlBeanFactory(resource);  // references to the spring container
//	    Employee e=(Employee)factory.getBean("empbean");  
//	    // at this point spring container locates empbean configuration in
//	    //applicationContext.xml and generates Employee object, Address object and inside
//	    // Employee, Address objct is injected via setter injection
//	   System.out.println(e);
//		   
//	   Employee e1=(Employee)factory.getBean("empbean");
//	    System.out.println(e1);

		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=(Employee)context.getBean("empbean");
	    System.out.println(e);
	    
	    Employee e1=(Employee)context.getBean("empbean");
	    System.out.println(e1);
	    
	    
	}

}
