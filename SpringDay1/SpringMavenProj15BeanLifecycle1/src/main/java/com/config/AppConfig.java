package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Employee;

@Configuration
public class AppConfig {

    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public Employee empbean() {
        Employee e=new Employee();
        e.setEid(101);
        e.setEname("Sham");
        e.setSalary(33000);
        return e;
    }
}
