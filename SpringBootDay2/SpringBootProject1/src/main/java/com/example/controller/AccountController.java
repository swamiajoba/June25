package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Account;
import com.example.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class AccountController {
	Logger logger=LoggerFactory.getLogger(AccountController.class);
	
	
	@Autowired
	AccountService accountService;
	
	//url = http://localhost:8082/accounts
	@PostMapping("/accounts") 
	public Account insertAccount(@RequestBody Account acc) {
		logger.info("Inserting Account");
		return accountService.save(acc) ;
	}
	
	// url=http://localhost:8082/accounts
	@GetMapping("/accounts")
	public List<Account> getAllAccounts() {
		return accountService.findAll();
	}
	
	// url =http://localhost:8082/accounts/102
	@GetMapping("/accounts/{aid}")
	public Account getAccountById(@PathVariable int aid) {
		logger.info("Getting Account by ID");
		logger.trace("Account id is "+aid);
		return accountService.findById(aid);
	}
	
	// url = http://localhost:8082/accounts/102
	@PutMapping("/accounts/{aid}")
	public Account updateAccount(
			@PathVariable int aid,
			@RequestBody Account acc 	) {
		return accountService.update(aid, acc);
	}
	
	// url =http://localhost:8082/accounts/102
	@DeleteMapping("/accounts/{aid}")
	public void deleteAccountById(@PathVariable int aid) {
		accountService.deleteById(aid);
	}

}




