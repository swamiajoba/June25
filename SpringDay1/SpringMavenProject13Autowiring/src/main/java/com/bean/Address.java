package com.bean;

public class Address {
	private int aid;
	private String city;
	private String zip;
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, String city, String zip) {
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
