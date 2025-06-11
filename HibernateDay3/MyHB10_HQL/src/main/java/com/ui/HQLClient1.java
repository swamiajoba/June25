package com.ui;
import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.*;

import com.bean.Emp;
import com.bean.Emp_Dept;


public class HQLClient1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();

		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();

		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		System.out.println("Fetch all employees with department. Join");
		Query q1 = session.createQuery("from Emp e join fetch e.d_code", Emp.class);	
		List<Emp> elist1=q1.list();
		for(Emp e:elist1) {
			System.out.println(e + " ,"+e.getD_code());
		}
		
		System.out.println("================================");
		
		System.out.println("Custom DTO mapping:");
		Query q2=session.createQuery(
			 "select new com.bean.Emp_Dept(e.d_code, e) from Emp e", Emp_Dept.class
			);
		List<Emp_Dept> elist2=q2.list();
		for(Emp_Dept e:elist2) {
			System.out.println(e);
		}
		System.out.println("================================");
		
		  System.out.println("HQL for fetching names and salary of employees");
		  
		  Query q3=session.createQuery("select e.e_name,e.salary from Emp e");
		  List<Object[]> results1=q3.list();
		  
		  for (Object[] row : results1) {
			    String eName = (String) row[0];
			    Double salary = (Double) row[1];
			    System.out.println("Employee Name: " + eName + ", Salary: " + salary);
			}
		  
		 System.out.println("================================");  

		 System.out.println("Employees order by salary top 3 records ");
		  //top 3 earning employees HQL
		 Query q4=session.createQuery(" from Emp e order by e.salary desc");
		       q4 .setMaxResults(3);
		       
		 List<Emp> topEmployees = q4.list();
		 
		 for (Emp e : topEmployees) {
			    System.out.println("Emp Code: " + e.getE_code() + ", Name: " + e.getE_name() + ", Salary: " + e.getSalary());
			}
		 System.out.println("================================");  
		       
		       
		System.out.println("Aggregate functions");

	      //Aggregate Functions
		  Query q5=session.createQuery("select avg(e.salary), sum(e.salary), max(e.salary),count(e_name) from Emp e");
		  Object[] result5 = (Object[])q5.uniqueResult();
		  
		  Double avgSalary = (Double) result5[0];
		  Double sumSalary = (Double) result5[1];
		  Double maxSalary = (Double) result5[2];
		  Long empCount   = (Long) result5[3];

		  System.out.println("Average Salary: " + avgSalary);
		  System.out.println("Total Salary: " + sumSalary);
		  System.out.println("Max Salary: " + maxSalary);
		  System.out.println("Employee Count: " + empCount);
		  
		  System.out.println("================================");
		  
		  System.out.println("Finding Max Salary only");
		  String hql = "select max(e.salary) from Emp e";
		  Query q6=session.createQuery(hql, Double.class);
		  Double maxSalary1 =(Double) q6.uniqueResult();
		  System.out.println("Max Salary: " + maxSalary1);
		  
		  System.out.println("================================");
			System.out.println("Named parameters");
			//named parameter queries
			
		  String hql7 = "from Emp e where e.e_name like :namePattern and e.salary > :minSalary";
		  TypedQuery<Emp> q7 = session.createQuery(hql7, Emp.class);
		  q7.setParameter("namePattern", "%a%");         // name contains 'a'
		  q7.setParameter("minSalary", 25000.0);         // replace with your threshold
		  List<Emp> elist7 = q7.getResultList();
		  
		  for (Emp e : elist7) {
			    System.out.println("Emp Code: " + e.getE_code() + ", Name: " + e.getE_name() + ", Salary: " + e.getSalary());
			}
		  System.out.println("================================");
		 
		  System.out.println("Positional parameters");
		  //positional parameter queries
		  String hql8 = "from Emp e where e.e_name like ?1 and e.salary > ?2";
		  TypedQuery<Emp> q8 = session.createQuery(hql8, Emp.class);

		  q8.setParameter(1, "%a%");         // Position 1 → name pattern
		  q8.setParameter(2, 25000.0);       // Position 2 → minimum salary

		  List<Emp> elist8 = q8.getResultList();
		  for (Emp e : elist7) {
			    System.out.println("Emp Code: " + e.getE_code() + ", Name: " + e.getE_name() + ", Salary: " + e.getSalary());
			}
		  System.out.println("================================");
		  
		  
	
		  String hql9 = "from Emp e where e.join_date between :startDate and :endDate";
		  TypedQuery<Emp> q9 = session.createQuery(hql9, Emp.class);

		  // Example date range
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		  Date start = sdf.parse("01-06-2003");
		  Date end = sdf.parse("31-12-2003");

		  q9.setParameter("startDate", start);
		  q9.setParameter("endDate", end);

		  List<Emp> elist9 = q9.getResultList();
		  
		  for (Emp e : elist9) {
			    System.out.println(e.getE_code() + " - " + e.getE_name() + " - " + e.getJoin_date());
			}
		  
		  
		

		  System.out.println("========================== after 3.5");
		  Query q10=session.createSQLQuery("SELECT * FROM TESTEMP")
				  .addEntity(Emp.class);

		  //automatically maps to Emp class
		  List<Emp> elist10=q10.list();
		 for(Emp o:elist10) {
			  System.out.println("ecode "+o.getE_code()+" ename "+o.getE_name()
					  +" joindate "+o.getJoin_date());
		  }
		
		  System.out.println("========================== Named query ");
		  
		  TypedQuery<Emp> q11 = session.createNamedQuery("Emp.findByNamePattern", Emp.class);
		  q11.setParameter("namePattern", "%a%");

		  List<Emp> elist11 = q11.getResultList();

		  // Display
		  for (Emp e : elist11) {
		      System.out.println(e.getE_code() + " - " + e.getE_name());
		  }
		  System.out.println("================================");
		  
		  TypedQuery<Emp> q12 = session.createNamedQuery("Emp.findByNameAndMinSalary", Emp.class);
		  q12.setParameter("namePattern", "%a%");
		  q12.setParameter("minSalary", 25000.0);

		  List<Emp> elist12 = q12.getResultList();

		  for (Emp e : elist12) {
		      System.out.println(e.getE_code() + " - " + e.getE_name() + " - " + e.getSalary());
		  }

 
		tx.commit();
		
		session.close();
		sf.close();


		

	}

}
