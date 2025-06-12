package com.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bean.Employee;
import com.bean.Company;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp = (Employee) context.getBean("empbean");
        System.out.println(emp);

        Company company = context.getBean(Company.class);
        System.out.println(company);
    }
}