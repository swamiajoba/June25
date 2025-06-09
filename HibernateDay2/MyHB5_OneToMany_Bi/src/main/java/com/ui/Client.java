package com.ui;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bean.Department;
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
		
		Date doj=sdf.parse("21-05-2003 09:30:00");		
		Employee e=new Employee(100,"king",24000.00,doj);
		doj=sdf.parse("20-07-2003 09:30:00");
		Employee e1=new Employee(101,"raja",30000.00,doj);
		doj=sdf.parse("11-04-2003 09:30:00");
		Employee e3=new Employee(102,"AAa",32000.00,doj);
		
		Department d1=new Department(10,"IT");
		e.setDepartment(d1);
		e1.setDepartment(d1);
		
		Department d2=new Department(20,"HR");
		e3.setDepartment(d2);
		
		session.save(e);
		session.save(e1);
		session.save(e3);
		// createQuery ====> queries to the POJO class
		Query q=session.createQuery("from Employee");
		List<Employee> elist=q.list();
		for(Employee ee:elist)
		{
						System.out.println(ee + "  "+ee.getDepartment());
		}
		tx.commit();
		
		session.close();
		sf.close();
		
		

	}

}
