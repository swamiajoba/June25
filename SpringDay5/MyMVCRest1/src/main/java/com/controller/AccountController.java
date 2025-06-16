package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Account;

@RestController
public class AccountController {

	  @RequestMapping(path="myAccountData",
			  method = RequestMethod.GET, produces = { "application/json" })
	    public Account myAccount() {
	       	Account ob=new Account(103,"Krishna",66000.00);
	        return ob;
	    }
	  
	  @RequestMapping(path="myAccountData1/{aid}/{customer}/{balance}",
			  method = RequestMethod.GET, produces = { "application/json" })
	    public Account myAccount1(
	    			@PathVariable("aid")int aid,
	    			@PathVariable("customer") String customer,
	    			@PathVariable("balance")double balance
	    		) {
	       	Account ob=new Account(aid,customer,balance);
	        return ob;
	    }
	  
	  @RequestMapping(path="myAccountData2",
			  method = RequestMethod.POST, produces = { "application/json" })
	    public Account myAccount2(@RequestBody Account ac) {
		  System.out.println(ac);
		  return ac;
	    }
}
