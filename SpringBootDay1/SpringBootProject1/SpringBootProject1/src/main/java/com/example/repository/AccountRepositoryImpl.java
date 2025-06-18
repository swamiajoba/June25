package com.example.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bean.Account;

@Repository("accountRepository")
public class AccountRepositoryImpl implements AccountRepository{
	List<Account> accDb=new ArrayList<>();
	
	@Override
	public Account save(Account ob) {
		boolean inserted=accDb.add(ob);
		if(inserted==true)
		{
			return ob;
		}
		else {
			return null;
		}
	}

	@Override
	public Account update(int aid, Account ob) {
		Account oldAc=null;
		int index=0;
		for(Account ac:accDb) {
			if(ac.getAid()==aid) {
				oldAc=ac;
				oldAc.setAid(ob.getAid());
				oldAc.setCustomer(ob.getCustomer());
				oldAc.setBalance(ob.getBalance());
				accDb.set(index, oldAc); // replace the oldAc with updated Account
			}
			index++;
		}
		
		return oldAc;
	}

	@Override
	public void deleteById(int aid) {
		Account oldAc=null;
		Iterator<Account> it=accDb.iterator();
		
		while(it.hasNext()) {
				oldAc=it.next();
				if(oldAc.getAid()==aid)
				{
					it.remove();
				}
		}
	}

	@Override
	public List<Account> findAll() {
		return accDb;
	}

	@Override
	public Account findById(int aid) {
		Account oldAc=null;
		Iterator<Account> it=accDb.iterator();
		
		while(it.hasNext()) {
				oldAc=it.next();
		}
		return oldAc;
	}

}
