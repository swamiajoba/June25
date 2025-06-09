package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	public void insertEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int eid);
	public Employee getEmployeeById(int eid);
	public List<Employee> getAllEmployees();
	
}
