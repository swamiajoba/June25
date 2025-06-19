package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Account;
import com.exception.RecordNotFoundException;
import com.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	

	@Transactional
	@Override
	public Account insertAccount(Account ac) {
		boolean check=accountRepository.existsById(ac.getAid());
		if(check==true) {
			throw new RuntimeException("Duplicate Entry");
		}
		return accountRepository.save(ac);
	}

	@Transactional
	@Override
	public Account updateAccount(Account ac, int aid) {
		Account ob=findAccountById(aid);
		if(ob!=null) {
			ob.setCustomer(ac.getCustomer());
			ob.setBalance(ac.getBalance());
			ob.setEmail(ac.getEmail());
			Account upob=accountRepository.save(ob);
			return upob;
		}
		else {
			return null;
		}
		

	}

	@Transactional
	@Override
	public String deleteAccount(int aid) {
		boolean check=accountRepository.existsById(aid);
		if(check==true) {
			accountRepository.deleteById(aid);
			return "Deleted Scussfully";
		}
		else {
			return "There is no such record of Account to delete";
		}
		
	}

	@Override
	public Account findAccountById(int aid) {
		return accountRepository.findById(aid)
				.orElseThrow(()->new RecordNotFoundException("No Account By aid "+aid));
	}

	@Override
	public List<Account> findAllAccounts() {
		List<Account> accountList=accountRepository.findAll();
		if(accountList.isEmpty()) {
			throw new RecordNotFoundException("No Accounts Found.Empty List");
		}
		return accountList;
	}

	@Override
	public List<Account> getAccountsByCustomer(String cust) {
		if(cust==null || cust.isEmpty()) {
			throw new IllegalArgumentException("Customer name can not be empty");
		}
		List<Account> accountList=accountRepository.findByCustomer(cust);
		if(accountList.isEmpty()) {
			throw new RecordNotFoundException("No Accounts Found by customer "+cust);
		}
		return accountList;
	}

	@Override
	public List<Account> getAccountsByBalanceRange(double minbal, double maxbal) {
		if(minbal<1 || maxbal<1 || (minbal>maxbal)) {
			throw new IllegalArgumentException("Enter valid balance range.");
		}
		List<Account> accountList=accountRepository.findByBalanceBetween(minbal, maxbal);
		if(accountList.isEmpty()) {
			throw new RecordNotFoundException(
					"No Accounts Found between balance "+minbal +" and "+maxbal);
		}
		return accountList;

	}

}
