package com.dao;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.data.Account;

@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO {
	@Autowired
	private HibernateTemplate hbTemplate;


	public void saveAccount(final Account e){  
			hbTemplate.save(e);
	}  	
	

	@Override
	public void updateAccount(Account e) {
			hbTemplate.update(e);
	}


	@Override
	public void deleteAccount(Account e) {
		hbTemplate.delete(e);
	}


	@Override
	public Account getAccountById(int aid)
	{
		Account a=(Account)hbTemplate.get(com.data.Account.class, aid);
		return a;
	}

	@Override
	public List<Account> getAccountList() {
		List<Account> list=new ArrayList<Account>();  
	    list=hbTemplate.loadAll(com.data.Account.class);  
	    return list;  
	}

	
}
