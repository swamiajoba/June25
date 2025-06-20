package com.bean;

public class Product {
	private int pid;
	private String name;
	private double price;
	private int qty;
	public Product() {
		// TODO Auto-generated constructor stub
	}	
	
	public Product(int pid, String name, double price, int qty) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
