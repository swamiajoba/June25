package com.ui;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.bean.Employee;

public class Demo 
{
	public static void main(String[] args) {

		ApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=(Employee)context.getBean("myemp");
	    System.out.println(e);  
	}
}
