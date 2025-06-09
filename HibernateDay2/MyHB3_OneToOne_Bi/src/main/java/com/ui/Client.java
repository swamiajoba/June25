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
		Adhar ad1=new Adhar(1111,"aaa");
		Adhar ad2=new Adhar(1112,"bbb");

		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// code for inserting records
		
		Date doj=sdf.parse("21-05-2003 09:30:00");		
		Employee e1=new Employee(100,"king",24000.00,doj);
		e1.setAdhar(ad1);
		ad1.setEmployee(e1);
		
		doj=sdf.parse("20-07-2003 09:30:00");
		Employee e2=new Employee(101,"raja",30000.00,doj);
		e2.setAdhar(ad2);
		ad2.setEmployee(e2);

		session.save(e1);
		session.save(e2);
		
		// createQuery ====> queries to the POJO class
		Query q=session.createQuery("from Adhar");
		List<Adhar> alist=q.list();
		for(Adhar aa:alist)
		{
						System.out.println(aa);
						Employee e=aa.getEmployee();
						System.out.println(e);
		}
		tx.commit();
		
		session.close();
		sf.close();
	
		


	}

}
