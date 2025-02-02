package com.tap.main;

import com.tap.entity.Student;
import com.tap.entity.StudentDetails;
import com.tap.manager.HibernateManager;

public class Launch {
	public static void main(String[] args) {
		HibernateManager hm = new HibernateManager();
		
		Student s = new Student("Rahul","Dravid"); //using constructor adding name
		StudentDetails sd = new StudentDetails("rahul@gmail.com","2233455666",43.5f);
		
		s.setStudentDetail(sd); //using setter adding student details
		hm.add(s);
	}

}
