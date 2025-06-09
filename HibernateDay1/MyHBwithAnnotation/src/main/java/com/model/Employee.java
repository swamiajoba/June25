package com.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="myemp")
public class Employee {
    @Id
    @Column(name = "e_id")
	private int eid;
    
    @Column(name = "e_name")
	private String ename;
    
	private double salary;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date doj;
	
	public Employee() {
		
	}
	public Employee(int eid,String ename,double salary,Date doj) {
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.doj=doj;
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
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
}
