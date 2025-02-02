package com.tap.manager;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.tap.entity.Author;
import com.tap.entity.Books;

public class HibernateManager {
	
	private Session session;

	public HibernateManager()
	{
		session = new Configuration().configure("hib.cfg.xml").
				addAnnotatedClass(Author.class).
				addAnnotatedClass(Books.class).
				buildSessionFactory().
				openSession();
	}
    public void add(Author a)
    {
    	session.beginTransaction();
    	session.persist(a);
    	session.getTransaction().commit();
    }
	
	public Author fetch(int id) 
	{
    	session.beginTransaction();
    	Author a = session.get(Author.class, id);
    	return a;
    	
	}
}
