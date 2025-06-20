package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	// select a from Account a where a.customer=:cust
	public List<Account> findByCustomer(String cust);
	
  	//@Query("SELECT a FROM Account a WHERE a.balance between   :minbal AND :maxbal")
	List<Account> findByBalanceBetween(double minbal, double maxbal);
	
	// select a from Account a where a.balance>?
	List<Account> findByBalanceGreaterThan(double amount);
	
	
	// select a from Account a where a.customer like :pattern
	List<Account> findByCustomerLike(String pattern);
	
}

/*
public Entity save(Entity object);   // insert or update
public Entity findById( primary key ) // select * from Entity where pk=?
public void deleteById(pk );  // delete from Entity where pk=?
public List<Entity> findAll(); // select * from Entity
*/




