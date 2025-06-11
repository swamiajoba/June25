package com.ui;
import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.bean.Emp;
import com.bean.Emp_Dept;


public class LegacyCriteriaClient {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();

		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();

		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();

		
		System.out.println("e_name and salary of all employees");

		Criteria crit1 = session.createCriteria(Emp.class)
                .setProjection(Projections.projectionList()
                    .add(Projections.property("e_name"))
                    .add(Projections.property("salary")));

		List<Object[]> result1 = crit1.list();

		for (Object[] row : result1) {
			System.out.println("Name: " + row[0] + ", Salary: " + row[1]);
		}

		
		System.out.println("==================================");
		System.out.println("Top 3 employees by salary");
		Criteria crit2 = session.createCriteria(Emp.class);
		crit2.addOrder(Order.desc("salary"));
		crit2.setMaxResults(3);

		List<Emp> topEmployees = crit2.list();
		for(Emp e:topEmployees) {
			System.out.println(e.getE_code() +"\t"+e.getE_name() +"\t"+e.getSalary());
		}
		
		
		System.out.println("==================================");
		System.out.println("Aggregate functions");
		Criteria crit3 = session.createCriteria(Emp.class)
			    .setProjection(Projections.projectionList()
			        .add(Projections.avg("salary"))
			        .add(Projections.sum("salary"))
			        .add(Projections.max("salary"))
			        .add(Projections.count("e_name")));

			Object[] result3 = (Object[]) crit3.uniqueResult();

			System.out.println("Avg: " + result3[0] + ", Sum: " + result3[1] +
			                   ", Max: " + result3[2] + ", Count: " + result3[3]);
		System.out.println("==================================");
		System.out.println("Name contains 'a' and salary > value");
		Criteria crit4 = session.createCriteria(Emp.class);
		crit4.add(Restrictions.like("e_name", "%a%"));
		crit4.add(Restrictions.gt("salary", 25000.0));

		List<Emp> result4 = crit4.list();
		for(Emp e:result4) {
			System.out.println(e.getE_code()+"\t"+e.getE_name()+"\t"+e.getSalary());
		}
		

		System.out.println("==================================");
		System.out.println("Between two dates");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = sdf.parse("01-06-2003");
		Date d2 = sdf.parse("31-12-2003");

		Criteria crit5 = session.createCriteria(Emp.class);
		crit5.add(Restrictions.between("join_date", d1, d2));

		List<Emp> elist5 = crit5.list();
		
		for(Emp e:elist5) {
			System.out.println(e.getE_name() +"\t"+e.getSalary() +"\t"+e.getJoin_date());
		}
		
		System.out.println("==================================");
		
		
		tx.commit();
		
		session.close();
		sf.close();

	}

}
