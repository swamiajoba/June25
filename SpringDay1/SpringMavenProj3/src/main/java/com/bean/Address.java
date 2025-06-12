package com.bean;

public class Address {
	private int aid;
	private String city;
	private String zip;
	
	
	public Address() {
		System.out.println("Address Default constructor");
	}
	
	
	public Address(int aid, String city, String zip) {
		super();
		System.out.println("Address Parameterized Constructor");
		this.aid = aid;
		this.city = city;
		this.zip = zip;
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
		return "Address [aid=" + aid + ", city=" + city + ", zip=" + zip + "]";
	}
	
}
