package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AccountDAO;
import com.data.Account;
import com.exception.NoAccountException;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDAO accountDAO;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void saveAccount(Account ac) {
		accountDAO.saveAccount(ac);
	}

	@Transactional
	@Override
	public void deleteAccount(Account ac) {
		accountDAO.deleteAccount(ac);
	}

	@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
	@Override
	public Account getAccountById(int aid) throws NoAccountException{
		Account ob=accountDAO.getAccountById(aid);
		if(ob==null) {
			throw new NoAccountException("No Such Account by aid = "+aid);
		}
		return ob;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Account> getAccountList() {
		return accountDAO.getAccountList();
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public void deposite(Account ac, double amount) {
		double originalbalance=ac.getBalance();
		double changedbalance=originalbalance+amount;
		if(amount>500)
		{
			ac.setBalance(changedbalance);
		}
		else
		{
			throw new IllegalArgumentException("No valid Amount.Minimum amount should be 500 Amount was "+amount);
		}
		accountDAO.updateAccount(ac);
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public void withdraw(Account ac, double amount) {
		double originalbalance=ac.getBalance();
		double changedbalance=originalbalance-amount;
		if(amount>1000)
		{
			ac.setBalance(changedbalance);
		}
		else
		{
			throw new IllegalArgumentException("No valid Amount.Minimum amount should be 1000 Amount was "+amount);
		}
		accountDAO.updateAccount(ac);
	}

}
