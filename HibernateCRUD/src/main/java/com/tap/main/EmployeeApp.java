package com.tap.main;

import org.hibernate.Hibernate;

import com.tap.entity.Empolyee;
import com.tap.manager.HybernateManager;
public class EmployeeApp {
	public static void main(String[] args) {
		Empolyee e = new Empolyee(1,"Rahul","IT",30000);
		
		HybernateManager hm = new HybernateManager();
		hm.connect();
		hm.add(e);
		System.out.println("object added");
	}

}
