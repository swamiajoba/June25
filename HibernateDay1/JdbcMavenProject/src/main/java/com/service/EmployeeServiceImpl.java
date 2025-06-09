package com.service;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDAO dao= new EmployeeDAOImpl();
	
	

	@Override
	public void insertEmplyee(Employee e) {
		dao.insertEmployee(e);
		
	}

}
