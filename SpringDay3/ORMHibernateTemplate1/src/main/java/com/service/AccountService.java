package com.service;

import java.util.List;

import com.data.Account;
import com.exception.NoAccountException;

public interface AccountService {
	public void saveAccount(Account ac);
	public void deposite(Account ac,double amount);
	public void withdraw(Account ac,double amount);
	public void deleteAccount(Account ac);
	public Account getAccountById(int aid) throws NoAccountException ;
	public List<Account> getAccountList();
}
