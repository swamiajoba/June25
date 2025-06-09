package com.bean;
import javax.persistence.*;


@Entity
@Table(name="BankAccount1")
@PrimaryKeyJoinColumn(name="bank_billing_id")
public class Bank_Account extends Billing_Details{
	private String account;
	private String bank_name;
	public Bank_Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	@Override
	public String toString() {
		return "Bank_Account [account=" + account + ", bank_name=" + bank_name
				+ "]"+super.toString();
	}
	
}
