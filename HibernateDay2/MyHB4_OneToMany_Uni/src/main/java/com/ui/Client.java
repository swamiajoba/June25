package com.ui;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bean.Department;
import com.bean.Employee;

public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// reads hibernate.cfg.xml file
		Configuration cfg=new Configuration().configure();
		//Configuration cfg=new AnnotationConfiguration().configure();
		
		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();
		// to establish connection to the database representaed by object session
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// code for inserting records
		
		Date doj=sdf.parse("21-05-2003 09:30:00");		
		Employee e=new Employee(100,"king",24000.00,doj);
		doj=sdf.parse("20-07-2003 09:30:00");
		Employee e1=new Employee(101,"raja",30000.00,doj);
		doj=sdf.parse("11-04-2003 09:30:00");
		Employee e3=new Employee(102,"AAa",32000.00,doj);
		
		Department d1=new Department(10,"IT");
		Set<Employee> eset1=new HashSet<Employee>();
		eset1.add(e);
		eset1.add(e1);
		d1.setEmployees(eset1);
		
		Department d2=new Department(20,"HR");
		Set<Employee> eset2=new HashSet<Employee>();
		eset2.add(e3);
		d2.setEmployees(eset2);
		
		session.save(d1);
		session.save(d2);
		
		// createQuery ====> queries to the POJO class
		Query q=session.createQuery("from Department");
		List<Department> dlist=q.list();
		for(Department d:dlist)
		{
						System.out.println(d);
		}
		tx.commit();
		
		session.close();
		sf.close();
		
		
		

	}

}
