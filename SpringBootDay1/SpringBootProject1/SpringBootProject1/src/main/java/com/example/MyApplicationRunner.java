package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner executed with options:");
        args.getOptionNames().forEach(option ->
                System.out.println(option + "=" 
                		+ args.getOptionValues(option))
        );
    }
}