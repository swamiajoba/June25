package com.gp.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("calculatorService")
public class CalculatorServiceImpl implements CalculatorService{
  //  private static final Logger logger = Logger.getLogger(CalculatorService.class);
    public double calculateDbr(double monthlyIncome,double monthlyexpenses ) {
    //    logger.info("--> method calculateDbr == parameters monthlyIncome "+ monthlyIncome + " , monthlyExpenses = "+monthlyexpenses);
        if(monthlyIncome<=0.0 || monthlyexpenses <= 0.0 ){
      //      logger.error("Arguments can not be zero 0.0 ");
            throw new IllegalArgumentException("Invalid arguments");
        }
        return monthlyIncome/monthlyexpenses;
    }

    public void showDbr(double dbr) {
        System.out.println("============>DBR is "+dbr);
    }

    public double caltax(double amount) throws Exception
    {
        System.out.println("executing caltax method");
        //logger.info("==>calTax method , amount="+amount);
        double tax=0.0;
        if(amount>=10000.00)
        {
            tax=amount*0.10;
        }
        else
        {
            tax=0.0;
          //  logger.error("Tax is not applicable for amount "+amount);
            throw new Exception("Tax is not applicable");
        }
        return tax;
    }
}
