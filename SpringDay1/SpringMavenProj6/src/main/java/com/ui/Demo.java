package com.ui;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.bean.Address;
public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(com.config.AppConfig.class);
		Address e=(Address)context.getBean("addrbean");
	    System.out.println(e);  
	    System.out.println("-----------------------------");
//	    List<String> emp=(List<String>) context.getBean("emps");
//	    System.out.println(emp);
	}

}
