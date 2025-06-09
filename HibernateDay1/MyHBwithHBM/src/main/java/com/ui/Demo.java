package com.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Employee;

public class Demo {

	public static void main(String[] args) throws ParseException {
		Configuration cfg=new Configuration();
		cfg.configure();  // configures hibernate.cfg.xml
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		// establish connection to the database and open session for a perticular user
		Session session=sf.openSession();  
		/*
		// code for inserting records
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
        Date doj=sdf.parse("21-05-2003 09:30:00");
        Employee e1=new Employee(100,"king",24000.00,doj);
        
        Date doj1=sdf.parse("05-05-2001 09:30:00");
        Employee e2=new Employee(101,"Ram",35000.00,doj1);
        
        Transaction tx=session.beginTransaction();
        	session.save(e1);  // inserting record
        	session.save(e2);       
        tx.commit();
		*/
		
		/*
		// code for updating record
		
		Transaction tx1=session.beginTransaction();
		// select reocrd  = select * from Employee where eid=2;
		Employee upe=session.get(com.model.Employee.class, 2);
		System.out.println("Before update employee is "+upe);
		
		upe.setSalary(50000.00);
		session.saveOrUpdate(upe);
		
		  upe= session.get(com.model.Employee.class,new Integer(2));
	        System.out.println("After update "+upe);
	
		tx1.commit();
		*/
	
		/*
		// code for delete
		Transaction tx=session.beginTransaction();
	    Employee myemp1= session.get(com.model.Employee.class,new Integer(2));
	    System.out.println("Before delete "+myemp1);
	    session.remove(myemp1);
	    tx.commit();
		 */
        
        // fetch records
        Query q=session.createQuery("from Employee"); 
        // this is a query to the class ie . select * from Employee
        // where Employee is a class and mapped to employee1 table
        // so the query is converted to select * from employee1
        
        List<Employee> elist=q.list();
        // executes select query and every record of employee1 table
        // is converted to Employee object and added to the list
        
        for(Employee ee:elist)
        {
            System.out.println(ee);
        }

        session.close();
        sf.close();

		
		
		
	}

}
