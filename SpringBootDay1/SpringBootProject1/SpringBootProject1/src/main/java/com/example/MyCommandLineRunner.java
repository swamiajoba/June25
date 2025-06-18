package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.bean.Account;
import com.example.service.AccountService;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	AccountService accountService;
	
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner executed with arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("Inserting 2 dummy records in the list");
        accountService.save(new Account(101,"Ram",40000.00));
        accountService.save(new Account(102,"Sham",50000.00));
        
    }
}
