package com.tap.main;

import com.tap.entity.Employee;
import com.tap.manager.HibernateManager;

public class EmployeeApp {
	
	public static void main(String[] args) {
		Employee e= new Employee(1,"rahul","IT",300000);
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.add(e);
		System.out.println("object added");
	}

}
