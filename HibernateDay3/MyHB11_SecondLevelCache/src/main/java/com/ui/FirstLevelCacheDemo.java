package com.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Emp;

public class FirstLevelCacheDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        System.out.println("Fetching employee with e_code = 101 first time...");
        Emp emp1 = session.get(Emp.class, 101);  // Hits DB
        System.out.println(emp1);

        //session.clear();
        
        System.out.println("Fetching employee with e_code = 101 second time...");
        Emp emp2 = session.get(Emp.class, 101);  // Cached
        System.out.println(emp2);

        System.out.println("Are emp1 and emp2 same object? " + (emp1 == emp2));  // true

        session.close();
        factory.close();
    }
}
