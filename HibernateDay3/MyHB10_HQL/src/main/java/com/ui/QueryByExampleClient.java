package com.ui;
import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.bean.Emp;
import com.bean.Emp_Dept;


public class QueryByExampleClient {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();

		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();

		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Emp exampleEmp = new Emp();
		exampleEmp.setE_name("king");  // only setting the fields you want to match
		exampleEmp.setSalary(24000.00); // you can add more fields if needed
		
		Example empExample = Example.create(exampleEmp)
                .enableLike()        // Enables LIKE match
                .ignoreCase();       // Case-insensitive

		Criteria crit1 = session.createCriteria(Emp.class)
				.add(empExample);

		List<Emp> result1 = crit1.list();

		for (Emp e : result1) {
			System.out.println(e.getE_code() + " " + e.getE_name()+" "+e.getSalary());
		}
		
		System.out.println("========================");
		
		
		tx.commit();
		
		session.close();
		sf.close();

	}

}
