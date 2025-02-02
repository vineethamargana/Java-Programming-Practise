package com.tap.main;

import com.tap.dao.EmployeeDAO;
import com.tap.daoimpl.EmployeeDAOImpl;
import com.tap.model.Employee;

public class Demo {
	public static void main(String[] args) {
		int empid=8,salary=40000;
		String empname="karthik" ,dpt="sales";
	
		Employee emp=new Employee(empid,empname,dpt,salary);
		EmployeeDAO empDAO=new EmployeeDAOImpl();
		System.out.println("Status:"+empDAO.insertEmp(emp));
		
	}

}
