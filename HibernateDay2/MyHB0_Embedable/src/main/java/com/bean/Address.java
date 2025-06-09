package com.bean;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class Address implements Serializable{
	private String street;
	private String area;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String area) {
		super();
		this.street = street;
		this.area = area;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", area=" + area + "]";
	}
	
}
