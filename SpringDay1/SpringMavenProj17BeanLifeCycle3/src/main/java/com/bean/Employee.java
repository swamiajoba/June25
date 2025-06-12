package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDateTime;

public class Employee implements InitializingBean, DisposableBean {
    private int eid;
    private String ename;
    private double salary;
    private LocalDateTime doj;

    public Employee() {
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

    //DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("Custom destroy of DisposableBean");
        doj=null;
    }

    //InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Property Set of InitializingBean");
        doj=LocalDateTime.now();
    }
}






