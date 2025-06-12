package com.ui;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

import com.bean.Address;
public class Demo {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);
	    Address e=(Address)factory.getBean("addrbean");
	    System.out.println(e); 
	    

//		ApplicationContext context=
//	    			new ClassPathXmlApplicationContext("applicationContext.xml");
//
//		Address e=(Address)context.getBean("addrbean");
//	    System.out.println(e);  
	}

}
