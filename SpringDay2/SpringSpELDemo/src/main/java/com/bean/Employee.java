package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empbean")
public class Employee {
    @Value("#{100 + 50}")
    private int eid;

    @Value("#{'Manjiri'.toUpperCase()}")
    private String ename;

    @Value("#{25000 + 5000}")
    private double salary;

    @Value("#{addrbean.city}")
    private String city;

    public int getEid() { return eid; }
    public String getEname() { return ename; }
    public double getSalary() { return salary; }
    public String getCity() { return city; }
    public void setEid(int eid) { this.eid = eid; }
    public void setEname(String ename) { this.ename = ename; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setCity(String city) { this.city = city; }

    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", city=" + city + "]";
    }
}