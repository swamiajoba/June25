package com.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.AccountDAO;
import com.data.Account;
import com.exception.NoAccountException;
import com.service.AccountService;


public class Demo 
{
	public static void main(String[] args) {
	
	    
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(com.config.AppConfig.class);
		AccountService service=(AccountService)context.getBean("accountService");
			
		
			//insertAccount(service);
		
		
			System.out.println("-------------------");
			List<Account> acclist=service.getAccountList();
			for(Account ob:acclist)
			System.out.println(ob);
			
			System.out.println("-------------------");
			
			try {
				withdrawdeposite(service);
			} catch (NoAccountException e) {
				e.printStackTrace();
			}

	       System.out.println("done");
       }
	
	public static void insertAccount(AccountService service)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number ");
		int aid=sc.nextInt();
		
		
		System.out.println("Enter Customer name");
		String holder=sc.next();
		System.out.println("Enter Initial Balance");
		double bal=sc.nextDouble();
		Account ob=new Account(aid,holder,bal);
		service.saveAccount(ob);
		System.out.println(ob);
		sc.nextLine();
		System.out.println(" record inserted");
		sc.close();
	}
	
	public static void withdrawdeposite(AccountService service) throws NoAccountException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number ");
		//sc.nextLine();
		int aid=sc.nextInt();
		Account ob=service.getAccountById(aid);
		System.out.println("Account before "+ob);
		System.out.println("Enter 1 for withdraw and 2 for deposite");
		int option=sc.nextInt();
		System.out.println("Enter the amount ");
		double amount=sc.nextDouble();
		sc.nextLine();
		
		switch (option) {
		case 1:
			try
			{
			service.withdraw(ob,amount );
			System.out.println(" record updated");
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Withdraw not successfull");
				System.out.println(e);
			}
			break;

		case 2:
			try
			{
			service.deposite(ob,amount );
			System.out.println(" record updated");
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("Deposite not successfull");
				System.out.println(e);
			}
			break;
			default:
				System.out.println("Invalid option. No Action");
		}
		ob=service.getAccountById(aid);
		System.out.println("Account after update "+ob);
		sc.close();
	}
}
