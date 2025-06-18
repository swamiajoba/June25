package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Account;
import com.example.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account save(Account ob) {
		return accountRepository.save(ob);
	}

	@Override
	public Account update(int aid, Account ob) {
		return accountRepository.update(aid, ob);
	}

	@Override
	public void deleteById(int aid) {
		accountRepository.deleteById(aid);		
	}

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account findById(int aid) {
		return accountRepository.findById(aid);
	}

}
