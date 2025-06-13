package com.dao;

import java.util.List;

import com.data.Account;
import com.exception.NoAccountException;

public interface AccountDAO {
	public void saveAccount(Account ac);
	public void updateAccount(Account ac);
	public void deleteAccount(Account ac);
	public Account getAccountById(int aid) ;
	public List<Account> getAccountList();
}
