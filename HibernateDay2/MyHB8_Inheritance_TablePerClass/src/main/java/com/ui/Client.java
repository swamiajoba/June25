package com.ui;
import java.util.List;
import java.text.ParseException;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;

import com.bean.Bank_Account;
import com.bean.Billing_Details;
import com.bean.Credit_Card;

public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");

		// reads hibernate.cfg.xml file
	//	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
      //  .configure("hibernate.cfg.xml").build();

		// Create a metadata sources using the specified service registry.
	//	Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		// configuration generates session factory
		SessionFactory sf=cfg.buildSessionFactory();
		//SessionFactory sf=metadata.getSessionFactoryBuilder().build();


		// to establish connection to the database representaed by object session
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Bank_Account b1=new Bank_Account();
		b1.setOwner("Manjiri");
		b1.setAccount("Saving");
		b1.setBank_name("ICICI");
		
		session.save(b1);
		Bank_Account b2=new Bank_Account();
		b2.setOwner("Don");
		b2.setAccount("Current");
		b2.setBank_name("City");
		
		session.save(b2);
		
		Credit_Card c1=new Credit_Card();
		c1.setOwner("Samrat");
		c1.setCardnumber("123456789");
		c1.setExp_Month("06");
		c1.setExp_Year("2020");
		session.save(c1);
		
		
		
		// createQuery ====> queries to the POJO class
		Query q=session.createQuery("from Billing_Details");
		List<Billing_Details> elist=q.list();
		for(Billing_Details ee:elist)
		{
						System.out.println(ee);
		}
		tx.commit();
		
		session.close();
		sf.close();


		System.out.println("Record is inseted");
		
		

	}

}
