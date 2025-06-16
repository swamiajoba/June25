
			package com.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.User;

import javax.validation.Valid;
import java.util.ArrayList;


@Scope("session")
@Controller
@RequestMapping(value="user")
public class UserController {
	
	ArrayList<String> cityList;
	ArrayList<String> skillList;
	
	
	@RequestMapping(value="/showRegister")
	public String prepareRegister(Model model)
	{
		cityList =new ArrayList<String>();
		
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Chennai");
		cityList.add("Delhi");
		
		skillList =new ArrayList<String>();
		
		skillList.add("Java");
		skillList.add("Struts");
		skillList.add("Spring");
		skillList.add("Hibernate");
		
		model.addAttribute("cityList",cityList);
		model.addAttribute("skillList",skillList);
		
		model.addAttribute("user",new User());
	    return "register";	
	}
	
	@RequestMapping(value="/checkRegister")
	public String checkRegister(
			@ModelAttribute("user")@Valid User user, 
			BindingResult result, 
			Model model)
	{
		 if(result.hasErrors())
		 {
			 System.out.println("Error");
			 model.addAttribute("cityList",cityList);
    		 model.addAttribute("skillList",skillList);

			 return "register";
		 }
		 else
		 {
          model.addAttribute("user",user);  
          System.out.println("Valid  dd");
	  	  return "registerSuccess";	
		 }
	}
	 
	

}
