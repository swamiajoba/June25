package com.bean;

import java.util.Date;

public class Emp_Dept {
	private int d_code;
	private String d_name;
	private int e_code;
	private String e_name;
	private double salary;
	private Date join_date;
	public Emp_Dept(Dept d,Emp e) {
		d_code=d.getD_code();
		d_name=d.getD_name();
		e_code=e.getE_code();
		e_name=e.getE_name();
		salary=e.getSalary();
		join_date=e.getJoin_date();
	}
	public int getD_code() {
		return d_code;
	}
	public void setD_code(int d_code) {
		this.d_code = d_code;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public int getE_code() {
		return e_code;
	}
	public void setE_code(int e_code) {
		this.e_code = e_code;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp_Dept [d_code=" + d_code + ", d_name=" + d_name + ", e_code=" + e_code + ", e_name=" + e_name
				+ ", salary=" + salary + ", join_date=" + join_date + "]";
	}
	

}
