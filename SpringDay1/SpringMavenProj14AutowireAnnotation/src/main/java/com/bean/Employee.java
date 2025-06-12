package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myemp")   // bean id=myemp
public class Employee {
	@Value("100")
	private int eid;

	@Value("Ram")
	private String ename;

	@Value("25000.00")
	private double salary;
	
	@Autowired
	//@Resource
	//@Qualifier("myaddress")    /// Address with bean id=myaddress injected
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary) {
		super();
		System.out.println("eid,ename,salary"+eid+" "+ename+" "+salary);
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	//@Autowired
	public Employee(int eid, String ename, double salary, Address address) {
		super();
		System.out.println("eid,ename,salary,address"+eid+" "+ename+" "+salary+" "+address);
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired
	public void setAddress(Address address) {
		System.out.println("setter address");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + " address="+address+"]";
	}
	
}
