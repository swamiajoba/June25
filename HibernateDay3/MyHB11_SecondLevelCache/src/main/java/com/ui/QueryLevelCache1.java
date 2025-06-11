package com.ui;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bean.Emp;

public class QueryLevelCache1 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session1 = factory.openSession();
		Query query1 = session1.createQuery("from Emp where salary > :sal", Emp.class);
		query1.setParameter("sal", 25000.0);
		query1.setCacheable(true);
		List<Emp> list1 = query1.list();  // Hits DB
		list1.forEach(System.out::println);
		session1.close();

		System.out.println("Another Session");
		Session session2 = factory.openSession();
		Query<Emp> query2 = session2.createQuery("from Emp where salary > :sal", Emp.class);
		query2.setParameter("sal", 25000.0);
		query2.setCacheable(true);
		List<Emp> list2 = query2.list();  // Comes from cache
		list2.forEach(System.out::println);
		session2.close();

		factory.close();
	}

}
