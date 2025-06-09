package com.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
@Entity
public class Student implements Serializable{
	@Id
	private int sid;
	private String sanme;
	@ManyToMany(
	        cascade = {CascadeType.PERSIST, CascadeType.MERGE},
	        mappedBy = "students",
	        targetEntity = Course.class
	    )
	    private Set<Course> courses=new HashSet<Course>();	
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sanme=" + sanme + "]";
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sanme) {
		super();
		this.sid = sid;
		this.sanme = sanme;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSanme() {
		return sanme;
	}
	public void setSanme(String sanme) {
		this.sanme = sanme;
	}
	
	
}
