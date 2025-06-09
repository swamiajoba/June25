package com.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.model.Employee;
import com.service.*;
public class Demo {
	public static void main(String[] args) throws ParseException {
		  // code for inserting records
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

          Date doj=sdf.parse("21-05-2003 09:30:00");
        Employee e=new Employee(100,"king",24000.00,doj);
        
        EmployeeService service=new EmployeeServiceImpl();
        service.insertEmplyee(e);


	}

}
