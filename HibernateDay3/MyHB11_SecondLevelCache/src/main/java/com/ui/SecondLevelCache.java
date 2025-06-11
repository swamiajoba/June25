package com.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Emp;

public class SecondLevelCache {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// First session
		Session session1 = factory.openSession();
		Emp e1 = session1.get(Emp.class, 101);  // Hits DB
		System.out.println("First fetch: " + e1);
		session1.close();

		// Second session
		Session session2 = factory.openSession();
		Emp e2 = session2.get(Emp.class, 101);  // Comes from 2nd level cache
		System.out.println("Second fetch: " + e2);
		session2.close();

		factory.close();

	}

}
