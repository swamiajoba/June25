package com.data;


public class Account {
	private int aid;
	
	private String customer;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int aid, String customer, double balance) {
		super();
		this.aid = aid;
		this.customer = customer;
		this.balance = balance;
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
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", customer=" + customer + ", balance=" + balance + "]";
	}
	
}
