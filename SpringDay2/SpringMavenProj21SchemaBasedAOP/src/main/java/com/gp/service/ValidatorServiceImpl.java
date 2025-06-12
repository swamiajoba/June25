package com.gp.service;

import org.apache.log4j.Logger;

public class ValidatorServiceImpl implements ValidatorService{

    //get log4j handler
 //   private static final Logger logger = Logger.getLogger(ValidatorService.class);
    public boolean validate(String value,String pattern) {
   //     logger.info("==> Validating value = "+value+"  with pattern "+pattern);
        return value.matches(pattern);
    }
    public void m1() {
     //   logger.info("Executing m1 method");
        System.out.println("Method m1");
    }
    public void m2() {
       // logger.info("Executing m2 method");
        System.out.println("Method m2");
    }
}
