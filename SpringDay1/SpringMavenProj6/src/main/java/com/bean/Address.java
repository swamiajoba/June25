package com.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Address {
	private int aid;
	private String city;
	private String zip;
	private List<String> people;
	//private Set<String> people;
	//private Map<String,String> people;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	/*
	public Address(int aid, String city, String zip,Map<String,String> people) {
		super();
		System.out.println("Address Constructor");
		this.aid = aid;
		this.city = city;
		this.zip = zip;
		this.people=people;
	}

	
	public Map<String,String> getPeople() {
		return people;
	}

	public void setPeople(Map<String,String> people) {
		this.people = people;
	}
	*/
	/*
	public Address(int aid, String city, String zip,Set<String> people) {
		super();
		System.out.println("Address Constructor");
		this.aid = aid;
		this.city = city;
		this.zip = zip;
		this.people=people;
	}

	
	public Set<String> getPeople() {
		return people;
	}

	public void setPeople(Set<String> people) {
		this.people = people;
	}
*/
	
	
	public Address(int aid, String city, String zip,List<String> people) {
		super();
		System.out.println("Address Constructor");
		this.aid = aid;
		this.city = city;
		this.zip = zip;
		this.people=people;
	}

	
	public List<String> getPeople() {
		return people;
	}

	public void setPeople(List<String> people) {
		this.people = people;
	}

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", zip=" + zip + "\n People are \n "+people+"]";
	}
	
}
