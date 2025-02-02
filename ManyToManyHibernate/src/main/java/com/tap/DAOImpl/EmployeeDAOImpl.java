package com.tap.DAOImpl;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.tap.DAO.EmployeeDAO;
import com.tap.entity.Employee;
import com.tap.entity.Projects;

public class EmployeeDAOImpl implements EmployeeDAO{

	private Session session;
	public EmployeeDAOImpl()
	{
		session = new Configuration().configure().
		addAnnotatedClass(Employee.class).
		addAnnotatedClass(Projects.class).
		buildSessionFactory().
		openSession();
	}
	@Override
	public void add(Employee e) 
	{
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		System.out.println("data added");
		
	}

}
