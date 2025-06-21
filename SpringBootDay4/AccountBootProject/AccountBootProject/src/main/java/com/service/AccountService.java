package com.service;

import java.util.List;

import com.bean.Account;

public interface AccountService {
	public Account insertAccount(Account ac);
	public Account updateAccount(Account ac,int aid);
	public String deleteAccount(int aid);
	public Account findAccountById(int aid);
	public List<Account> findAllAccounts();
	public List<Account> getAccountsByCustomer(String cust) ;
	
	public List<Account> getAccountsByBalanceRange(double minbal,double maxbal) ;
	

}
