package com.tap.main;

import java.util.ArrayList;

import com.tap.DAOImpl.EmployeeDAOImpl;
import com.tap.entity.Employee;
import com.tap.entity.Projects;

public class EmployeeApp {
    public static void main(String[] args) {
    	
		Employee e1 = new Employee("Rahul","Rahul@gmail.com");
		Employee e2 = new Employee("Rohit","Rohit@gmail.com");
		Employee e3 = new Employee("vijay","vijay@gmail.com");
		
		Projects p1 = new Projects("Video edit",789990.0f);
		Projects p2 = new Projects("Image Procesing",898648.0f);
		
		ArrayList<Projects> projlist1 = new ArrayList<Projects>();
		projlist1.add(p1);
		
		ArrayList<Projects> projlist2 = new ArrayList<Projects>();
		projlist2.add(p1);
		projlist2.add(p2);
	
		ArrayList<Employee> emplist1 = new ArrayList<Employee>();
		emplist1.add(e1);
		emplist1.add(e2);
		emplist1.add(e3);
		
		ArrayList<Employee> emplist2 = new ArrayList<Employee>();
		emplist2.add(e2);
		emplist2.add(e3);
		
		e1.setProjects(projlist1);
		e2.setProjects(projlist2);
		e3.setProjects(projlist2);
		
		p1.setEmp(emplist1);
		p2.setEmp(emplist2);
		
		EmployeeDAOImpl edaoi = new EmployeeDAOImpl();
		edaoi.add(e1);
		edaoi.add(e2);
		edaoi.add(e3);
		
		System.out.println("done");
		

	}
}
