package com.example.repository;

import java.util.List;

import com.example.bean.Account;

public interface AccountRepository {
	public Account save(Account ob);
	public Account update(int aid,Account ob);
	public void deleteById(int aid);
	public List<Account> findAll();
	public Account findById(int aid);
	
	

}
