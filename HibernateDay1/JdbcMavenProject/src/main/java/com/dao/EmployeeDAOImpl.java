package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.model.Employee;
import com.util.DBConnection;

public class EmployeeDAOImpl implements EmployeeDAO {
	private Connection con;
	
	public EmployeeDAOImpl() {
		try {
			con=DBConnection.getConnection();
			System.out.println("Connected ");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public void insertEmployee(Employee e) {
		String query="insert into emp(e_id,ename,salary,doj) values(?,?,?,?)";
		try(PreparedStatement pst=con.prepareStatement(query))  {
			pst.setInt(1, e.getEid());
			pst.setString(2, e.getEname());
			pst.setDouble(3, e.getSalary());
			java.sql.Date mydoj=new java.sql.Date(e.getDoj().getTime());
			pst.setDate(4, mydoj);
			int i=pst.executeUpdate();
			System.out.println("Inserted "+i +" record");
		}
		
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// update emp set ename=?,salary=?,doj=? where e_id=?
		
	}

	@Override
	public void deleteEmployee(int eid) {
		// delete from emp where e_id=?
		
	}

	@Override
	public Employee getEmployeeById(int eid) {
		// select * from emp where e_id=?
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// select * from emp;
		return null;
	}

}
