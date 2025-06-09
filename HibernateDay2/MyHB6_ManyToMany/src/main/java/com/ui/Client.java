package com.ui;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.ParseException;

import org.hibernate.*;
import org.hibernate.cfg.*;

import com.bean.Course;
import com.bean.Student;
public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		// reads hibernate.cfg.xml file

		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();

		// to establish connection to the database representaed by object session
		Session session=sf.openSession();

		Transaction tx=session.beginTransaction();
		Student s1=new Student(1,"aa");
		Student s2=new Student(2,"bb");
		
		Course c1=new Course(100,"Java");
		Set<Student> eset1=new HashSet<Student>();
		eset1.add(s1);
		eset1.add(s2);
		c1.setStudents(eset1);
		
		Course c2=new Course(101,"Oracle");
		Set<Student> eset2=new HashSet<Student>();
		eset2.add(s2);
		c2.setStudents(eset2);
		
		session.save(c1);
		session.save(c2);
		
		// createQuery ====> queries to the POJO class
		Query q=session.createQuery("from Course");
		List<Course> clist=q.list();
		for(Course ee:clist)
		{
						System.out.println(ee);
		}
		tx.commit();
		
		session.close();
		sf.close();
	
		
		

	}

}
