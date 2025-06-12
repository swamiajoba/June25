package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myaddress")
public class Address {
	@Value("10")
	private int aid;

	@Value("Mumbai")
	private String city;

	@Value("India")
	private String country;

	public Address() {
		// TODO Auto-generated constructor stub
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", country=" + country + "]";
	}
	
}
