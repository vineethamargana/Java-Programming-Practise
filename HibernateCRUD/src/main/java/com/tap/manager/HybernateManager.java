package com.tap.manager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.entity.Empolyee;

public class HybernateManager {	
	Session session=null;

	//	Configuration config = new Configuration().configure();
	//	config = config.configure();
	//	SessionFactory sf = config.buildSessionFactory();
	//	SessionFactory sf = new Configuration().configure().buildSessionFactory();
        
		public void connect()
		{
			session =  new Configuration().configure().buildSessionFactory().openSession();
			System.out.println(session);
		
		}
		
		public void add(Empolyee e)
		{
			Transaction t = session.getTransaction();
			session.persist(e);
			t.commit();
			
		}

}
