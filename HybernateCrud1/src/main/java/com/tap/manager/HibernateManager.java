package com.tap.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.entity.Employee;

public class HibernateManager {
//	public static void main(String[] args) {
//		Configuration config = new Configuration();
//		config.configure();
//		config.addAnnotatedClass(Employee.class);
//	    SessionFactory sf=config.buildSessionFactory();
//	    Session session=sf.openSession();
//	    Transaction t=session.beginTransaction();
//	    Employee e=new Employee(1,"Alex","hr",900000);
//	    session.save(e);
//	    t.commit();
//	}
	Session session=null;
     public void connect()
     {
 	    session =new Configuration().configure().buildSessionFactory().openSession(); 
     }
     
     public void add(Employee e)
     {
    	Transaction t=session.beginTransaction();
    	session.persist(e);   
    	t.commit();
     }
}
