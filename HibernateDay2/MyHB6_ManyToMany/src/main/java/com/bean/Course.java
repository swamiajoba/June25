package com.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
public class Course implements Serializable{
	@Id
	private int cid;
	private String cname;
	
	@ManyToMany(
	        targetEntity= Student.class,
	        cascade={CascadeType.ALL}
	    )
	    @JoinTable(
	        name="Enrollment",
	        joinColumns=@JoinColumn(name="c_code"),
	        inverseJoinColumns=@JoinColumn(name="s_id")
	    )
	    private Set<Student>  students=new HashSet<Student>();
	
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", students="
				+ students + "]";
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
