package com.bean;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="Empl1")
public class Employee implements Serializable{
	// Owner class
	@Id
	@Column(nullable=false,name="empid")
	private int eid;
	@Column(name="empname")
	private String ename;
	@Column(name="empsalary")
	private double salary;
	
	//@Column(name="doj")
	@Temporal(TemporalType.TIMESTAMP)
	private Date doj;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adharid")
	private Adhar adhar;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary,Date doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.doj=doj;
	}
	
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
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
	
	
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", doj=" + doj + ", adhar=" + adhar
				+ "]";
	}
	
	
	
	
}
