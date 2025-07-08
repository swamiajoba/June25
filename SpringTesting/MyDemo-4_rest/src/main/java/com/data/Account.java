package com.data;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="account")
public class Account implements java.io.Serializable{
	
	@Id
	//@GeneratedValue 
	private int aid;
	
	@NotBlank(message = "Customer name can not be blank")
	@Size(min=2,message="Name should be minimum 2 chars")
	@Column(name="holder")
	private String customer;
	
	@Min(value=2000,message="Balance should be minimum 2000")
	private double balance;
	
	@Email(message="Invalid Email")
	private String email;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int aid, String customer, double balance, String email) {
		super();
		this.aid = aid;
		this.customer = customer;
		this.balance = balance;
		this.email = email;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", customer=" + customer + ", balance=" + balance + ", email=" + email + "]";
	}
		
}
