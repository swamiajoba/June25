package com.controller;

import java.util.InputMismatchException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Account;
import com.service.AccountService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	// url = http://localhost:8082/accounts
	@GetMapping("/accounts")
	public List<Account> getAllAccounts(){
		return accountService.findAllAccounts();

	}
	
	// url = http://localhost:8082/accounts
	@PostMapping("/accounts")
	public ResponseEntity<?> insertAccount(@RequestBody Account acc){ // @RequestBody converts JSON object into java Account object
		Account ob=accountService.insertAccount(acc) ;
		if(ob==null) {
			return new ResponseEntity<String>("Can not insert account",
											HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Account>(ob,HttpStatus.CREATED);
	}
	
	//url = http://localhost:8082/accounts/102
	@PutMapping("/accounts/{aid}")
	public Account updateAccount(@RequestBody Account acc,
									@PathVariable("aid") int aid){ 
		return accountService.updateAccount(acc, aid);
	}
	
	// url = http://localhost:8082/accounts/102
	@DeleteMapping("/accounts/{aid}")
	public String deleteAccount(	@PathVariable("aid") int aid){ 
		return accountService.deleteAccount(aid);
	}
	
	// url = http://localhost:8082/accounts/102
	@GetMapping("/accounts/{aid}")
	public Account getAccountById(@PathVariable("aid") int aid){ 
		return accountService.findAccountById(aid) ;
	}
	
	 @GetMapping("/accountsByCust/{cust}")
	  public List<Account> showByCustomer(@PathVariable String cust)  {
		 return accountService.getAccountsByCustomer(cust) ;
	  }
	 

	 @GetMapping("/accountsByBalance/{minbal}/{maxbal}")
	  public List<Account> showByBalanceRange(@PathVariable double minbal,
			  		@PathVariable double maxbal) {
		 return accountService.getAccountsByBalanceRange(minbal, maxbal);
	  }
	 
	
}









