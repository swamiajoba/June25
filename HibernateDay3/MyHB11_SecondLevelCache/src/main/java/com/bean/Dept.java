package com.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TESTDEPT")
public class Dept {
	@Id
	private int d_code;
	private String d_name;
	

	@OneToMany(mappedBy="d_code")
	private Set<Emp> emp=new HashSet<Emp>();
	
	
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(int d_code, String d_name) {
		super();
		this.d_code = d_code;
		this.d_name = d_name;
	}

	public Set<Emp> getEmp() {
		return emp;
	}

	public void setEmp(Set<Emp> emp) {
		this.emp = emp;
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
	public String toString(){
		return(d_code +"    "+d_name);
	}
	

}
