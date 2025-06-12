package com.bean;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
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
