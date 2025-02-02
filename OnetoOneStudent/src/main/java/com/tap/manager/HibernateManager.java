package com.tap.manager;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.tap.entity.Student;
import com.tap.entity.StudentDetails;

public class HibernateManager {

    Session session = null;

	public HibernateManager()
	{
		session = new Configuration().configure("hibernate.cfg.xml").
		addAnnotatedClass(Student.class).
		addAnnotatedClass(StudentDetails.class).buildSessionFactory().openSession();
	}
	
	public void add(Student s)
	{
		session.beginTransaction();
		session.persist(s);
		session.getTransaction().commit();
	}
}
