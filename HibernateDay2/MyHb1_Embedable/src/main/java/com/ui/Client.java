package com.ui;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bean.Adhar;
import com.bean.Employee;

public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		
		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();


		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// code for inserting records
		
		Adhar ad1=new Adhar(1111,"aaa");
		Adhar ad2=new Adhar(1112,"bbb");
		
		
		Date doj=sdf.parse("21-05-2003 09:30:00");		
		Employee e1=new Employee(100,"king",24000.00,doj,ad1);
		doj=sdf.parse("20-07-2003 09:30:00");
		Employee e2=new Employee(101,"raja",30000.00,doj,ad2);
	
		session.save(e1);
		session.save(e2);
		tx.commit();
		// createQuery ====> queries to the POJO class
		Query q=session.createQuery("from Employee");
		List<Employee> elist=q.list();
		for(Employee ee:elist)
		{
						System.out.println(ee);
		}
		
		
		session.close();
		System.out.println("Record is inseted");
		
		

	}

}
