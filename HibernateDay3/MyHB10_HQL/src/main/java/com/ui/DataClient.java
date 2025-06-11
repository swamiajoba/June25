package com.ui;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bean.Dept;
import com.bean.Emp;


public class DataClient {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		
		// reads hibernate.cfg.xml file


		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();
		//SessionFactory sf=metadata.getSessionFactoryBuilder().build();


		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// code for inserting records
		
		Date doj=sdf.parse("21-05-2003 09:30:00");		
		Emp e=new Emp(100,"king",24000.00,doj);
		doj=sdf.parse("20-07-2003 09:30:00");
		Emp e1=new Emp(101,"raja",30000.00,doj);
		doj=sdf.parse("11-04-2003 09:30:00");
		Emp e2=new Emp(102,"AAa",32000.00,doj);
		doj=sdf.parse("11-05-2003 09:30:00");
		Emp e3=new Emp(103,"Apurva",25000.00,doj);
		doj=sdf.parse("01-05-2003 09:30:00");
		Emp e4=new Emp(104,"Wasim",28000.00,doj);
		doj=sdf.parse("01-07-2003 09:30:00");
		Emp e5=new Emp(105,"Rancho",37000.00,doj);
		
		Dept d1=new Dept(10,"IT");

		Set<Emp> eset1=new HashSet<Emp>();
		eset1.add(e);
		e.setD_code(d1);
		eset1.add(e1);
		e1.setD_code(d1);
		eset1.add(e4);
		e4.setD_code(d1);
		eset1.add(e5);
		e5.setD_code(d1);
		d1.setEmp(eset1);
		
		Dept d2=new Dept(20,"HR");
		Set<Emp> eset2=new HashSet<Emp>();
		eset2.add(e2);
		e2.setD_code(d2);
		eset2.add(e3);
		e3.setD_code(d2);
		d2.setEmp(eset2);
		
		session.save(e);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		
		
		tx.commit();
		
		session.close();
		sf.close();
		System.out.println("Record is inseted");
		
		

	}

}
