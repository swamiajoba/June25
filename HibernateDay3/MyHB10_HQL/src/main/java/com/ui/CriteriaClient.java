package com.ui;
import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;


import com.bean.Emp;
import com.bean.Emp_Dept;


public class CriteriaClient {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();

		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();

		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		
		System.out.println("e_name and salary of all employees");

		CriteriaQuery<Object[]> cq1 = cb.createQuery(Object[].class);
		Root<Emp> root1 = cq1.from(Emp.class);
		cq1.multiselect(root1.get("e_name"), root1.get("salary"));
		TypedQuery<Object[]> q1= session.createQuery(cq1);
		List<Object[]> elist1 = q1.getResultList();

		for (Object[] row : elist1) {
		    System.out.println("Name: " + row[0] + ", Salary: " + row[1]);
		}
		
		System.out.println("==================================");
		System.out.println("Top 3 employees by salary");
		CriteriaQuery<Emp> cq2 = cb.createQuery(Emp.class);
		Root<Emp> root2 = cq2.from(Emp.class);
		cq2.orderBy(cb.desc(root2.get("salary")));

		TypedQuery q2=session.createQuery(cq2);
		List<Emp> elist2 = q2.setMaxResults(3).getResultList();
		for(Emp e:elist2) {
			System.out.println(e.getE_code() +" "+e.getE_name() +" "+e.getSalary());
		}
		System.out.println("==================================");
		System.out.println("Aggregate functions");
		CriteriaQuery<Object[]> cq3 = cb.createQuery(Object[].class);
		Root<Emp> root3 = cq3.from(Emp.class);

		cq3.multiselect(
		    cb.avg(root3.get("salary")),
		    cb.sum(root3.get("salary")),
		    cb.max(root3.get("salary")),
		    cb.count(root3.get("e_name"))
		);
		
		TypedQuery<Object[]> q3=session.createQuery(cq3);
		
		Object[] result3 = q3.getSingleResult();
		System.out.println("Avg: " + result3[0] + ", Sum: " + result3[1] + ", Max: " + result3[2] + ", Count: " + result3[3]);
		System.out.println("==================================");
		
		System.out.println("Name contains 'a' and salary > value");
		CriteriaQuery<Emp> cq4 = cb.createQuery(Emp.class);
		Root<Emp> root4 = cq4.from(Emp.class);

		Predicate nameLike = cb.like(root4.get("e_name"), "%a%");
		Predicate salaryGt = cb.gt(root4.get("salary"), 25000.0);
		cq4.select(root4).where(cb.and(nameLike, salaryGt));

		TypedQuery<Emp> q4=session.createQuery(cq4);
		
		List<Emp> elist4 = q4.getResultList();
		for(Emp e:elist4) {
			System.out.println(e.getE_name() +" "+e.getSalary());
		}
		
		System.out.println("==================================");
		System.out.println("Between two dates");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date start = sdf.parse("01-06-2003");
		Date end = sdf.parse("31-12-2003");

		CriteriaQuery<Emp> cq5 = cb.createQuery(Emp.class);
		Root<Emp> root5 = cq5.from(Emp.class);

		Predicate dateBetween = cb.between(root5.get("join_date"), start, end);
		cq5.select(root5).where(dateBetween);
		
		TypedQuery<Emp> q5=session.createQuery(cq5);

		List<Emp> elist5 = q5.getResultList();
		for(Emp e:elist5) {
			System.out.println(e.getE_name() +" "+e.getSalary() +" "+e.getJoin_date());
		}
		
		System.out.println("==================================");
		
		
		tx.commit();
		
		session.close();

	}

}
