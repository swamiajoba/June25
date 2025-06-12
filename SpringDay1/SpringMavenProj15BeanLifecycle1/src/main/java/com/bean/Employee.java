package com.bean;

import java.time.LocalDateTime;

public class Employee {
    private int eid;
    private String ename;
    private double salary;
    private LocalDateTime doj;

    public Employee() {
    }

    public void customInit() {
        System.out.println("Custom initialization");
        doj=LocalDateTime.now();
    }
    public void customDestroy() {
        System.out.println("Custom destroy");
        doj=null;
    }
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getDob() {
        return doj;
    }

    public void setDob(LocalDateTime doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", doj=" + doj +
                '}';
    }
}
