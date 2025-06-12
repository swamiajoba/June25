package com.gp.service;

public interface CalculatorService {
    public double calculateDbr(double monthlyIncome,double monthlyexpenses );
    public void showDbr(double dbr);
    public double caltax(double amount) throws Exception;
}
