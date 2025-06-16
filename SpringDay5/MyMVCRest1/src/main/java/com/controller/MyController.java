package com.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Account;

@Controller
public class MyController {
	
	  @RequestMapping("/hello")
	  @ResponseBody
	    public String myhello() {
	        String message= "Welcome and Hello to Spring MVC , Date is "
	        					+ LocalDateTime.now();
	        return message;
	    }
	  
	  @RequestMapping(path="myAccount",
			  method = RequestMethod.GET, produces = { "application/json" })
	  @ResponseBody
	    public Account myAccount() {
	       	Account ob=new Account(101,"Ram",55000.00);
	        return ob;
	    }
	  
	  @RequestMapping(path="myAccount1",
			  method = RequestMethod.GET, produces = { "application/xml" })
	  @ResponseBody
	    public Account myAccount1() {
	       	Account ob=new Account(102,"Sham",55000.00);
	        return ob;
	    }


}
