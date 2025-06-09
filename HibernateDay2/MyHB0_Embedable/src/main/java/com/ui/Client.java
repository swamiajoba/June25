package com.ui;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bean.*;


public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// reads hibernate.cfg.xml file
		Configuration cfg=new Configuration().configure();
	
		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();
		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		/*
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// code for inserting records
		
		Date doj=sdf.parse("21-05-2003 09:30:00");
		List<MyContacts> ph1=new ArrayList<>();
		ph1.add(new MyContacts("1111"));
		ph1.add(new MyContacts("2222"));

		Employee e=new Employee(100,11,"king",24000.00,doj,new Address("mystreet","MUMBAI"), ph1,Gender.M);
		doj=sdf.parse("20-07-2003 09:30:00");

		List<MyContacts> ph2=new ArrayList<>();
		ph2.add(new MyContacts("5555"));
		ph2.add(new MyContacts("6666"));
		Employee e1=new Employee(100,12,"raja",30000.00,doj,new Address("mystreet","MUMBAI"),ph2, Gender.F);

		session.save(e);
		session.save(e1);

		*/

 

		Query q=session.createQuery("from Employee");
		List<Employee> elist=q.list();
		for(Employee ee:elist)
		{
						System.out.println(ee);
		}

		System.out.println("============================");

		Query q1=session.createQuery("select e.ename,e.salary from Employee e where e.eid=100 and e.ssn=12");
		ScrollableResults rs=q1.scroll();
		while(rs.next()){
			System.out.print("=>");
			System.out.println(rs.get(0)+" "+ rs.get(1) );

		}System.out.println("============================");

		Query q2=session.createQuery("select e.eid,e.ssn, c.contactId from Employee e join e.contacts c where e.eid=100 and e.ssn=12");
		
		ScrollableResults rs1=q2.scroll();
		while(rs1.next()){
			System.out.print("=>");
			System.out.println(rs1.get(0)+" "+ rs1.get(1)+" "+ rs1.get(2));
		}







		tx.commit();
		
		session.close();
		sf.close();
		
		
		

	}

}
