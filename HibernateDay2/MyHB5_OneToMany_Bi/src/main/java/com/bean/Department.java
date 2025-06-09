package com.bean;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="dept4")
public class Department {
	private int did;
	private String dname;
	
	private Set<Employee> employees=new HashSet<Employee>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="department")
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	
	@Id  //propery based
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
	
}
