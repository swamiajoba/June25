package com.bean;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Emp4")
@IdClass(EmpIdClass.class)
public class Employee implements Serializable{

	@Id
	private int eid;
	@Id
	private int ssn;

	@Column(name="empname")
	private String ename;
	@Column(name="empsalary")
	private double salary;
	
	//@Column(name="doj")
	@Temporal(TemporalType.TIMESTAMP)
	private Date doj;
	
	@Embedded
	private Address adr;

	@ElementCollection
	private List<MyContacts> contacts;

	@Enumerated(value=EnumType.STRING)
	private Gender gender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, int ssn, String ename, double salary, Date doj, Address adr, List<MyContacts> contacts, Gender gender) {
		this.eid = eid;
		this.ssn = ssn;
		this.ename = ename;
		this.salary = salary;
		this.doj = doj;
		this.adr = adr;
		this.contacts = contacts;
		this.gender = gender;
	}

	public int getEid() {
		return eid;
	}

	public List<MyContacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<MyContacts> contacts) {
		this.contacts = contacts;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
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


	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"eid=" + eid +
				", ssn=" + ssn +
				", ename='" + ename + '\'' +
				", salary=" + salary +
				", doj=" + doj +
				", adr=" + adr +
				", contacts=" + contacts +
				", gender=" + gender +
				'}';
	}
}
