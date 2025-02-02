package com.tap.DAOImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.DAO.StudentDAO;
import com.tap.entity.Student;

public class StudentDAOImpl implements StudentDAO{
	
	Session session;
	private Transaction t;
	
	public StudentDAOImpl()
	{
		session = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
	}

	@Override
	public int register(Student s) {
		t = session.beginTransaction();
		session.persist(s);
		t.commit();
		return 1;
	}

}
