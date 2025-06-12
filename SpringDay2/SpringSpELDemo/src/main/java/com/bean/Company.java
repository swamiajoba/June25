package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component("company")
public class Company {

    @Value("#{ {'HR','Finance','IT','Sales'} }")
    private List<String> departments;

    @Value("#{ {1:'India', 2:'USA', 3:'UK'} }")
    private Map<Integer, String> countryCodes;

    @Value("#{ {'Manjiri', 'Meena', 'Amit', 'Arun'}.?[startsWith('M')] }")
    private List<String> namesStartingWithM;

    @Override
    public String toString() {
        return "Departments: " + departments +
               "\nCountry Codes: " + countryCodes +
               "\nFiltered Names: " + namesStartingWithM;
    }
}