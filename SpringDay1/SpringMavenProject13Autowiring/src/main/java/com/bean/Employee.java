package com.bean;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private Address address;
	public Employee() {
		System.out.println("Employee Constructor");
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, double salary) {
		System.out.println("Employee - 3 parameter constructor eid,ename,salary");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee(int eid, String ename, double salary, Address address) {
		System.out.println("Employee - 4 parameter constructor eid,ename,salary,address");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Address setter method in Employee");
		this.address = address;
	}

	public int getEid() {
		
		return eid;
	}
	public void setEid(int eid) {
		System.out.println("setEid("+eid+")");
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
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + " address = "+address+"]";
	}
	
}
