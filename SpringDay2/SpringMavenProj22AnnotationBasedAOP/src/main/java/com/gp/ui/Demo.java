package com.gp.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.service.CalculatorService;
import com.gp.service.ValidatorService;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
     
        ValidatorService v=(ValidatorService) context.getBean("validatorService");
        //calling validate method
        boolean ch=v.validate("9898989494","\\d{10}");
        System.out.println("Mobile valid "+ch);
        System.out.println("------------------------------------");
       // calling method name staring with m
        v.m1();
        v.m2();

        System.out.println("------------------------------------");
        CalculatorService cs=(CalculatorService) context.getBean("calculatorService");
        // calling dbr related method
        double dbramnt=cs.calculateDbr(100000,50000);
        cs.showDbr(dbramnt);

        System.out.println("------------------------------------");
        //calling tax method
        double tax=0.0;

        try {
          //  tax=cs.caltax(20000);
            tax=cs.caltax(9000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Tax is "+ tax);


    }
}
