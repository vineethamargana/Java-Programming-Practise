//undirectional mapping

package com.tap.manager;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.entity.Customer;
import com.tap.entity.CustomerDetails;
import com.tap.entity.OrderTable;



public class HibernateManager {
	
	Session session=null;
	public HibernateManager()
	{
//		Configuration config = new Configuration();
//		config = config.configure();
//      config = config.addAnnotatedClass(Customer.class).addAnnotatedClass(CustomerDetails.class);
		
		
//		Configuration config = new Configuration().
//				               configure().addAnnotatedClass(Customer.class).
//				               addAnnotatedClass(CustomerDetails.class);
		session = new Configuration().
        configure().addAnnotatedClass(Customer.class).
        addAnnotatedClass(CustomerDetails.class).
        addAnnotatedClass(OrderTable.class).
        buildSessionFactory().openSession();	
	}

	//we are calling this Customer class but dont calling customerdetails class because in customer class we have added the details of customerdetails so need not to particularly create it.
	//for unidirectional
	public void add(Customer c) 
	{
		Transaction t =session.beginTransaction();
		session.persist(c);
		t.commit();
		System.out.println("Done");
	}

	//for bidirectional
	public void add(CustomerDetails cd)  // this method is created for undersatanding the concept of undirectinality ... otherwise it is not required beacuse it will only work with customer details but not customer
	{
		Transaction t =session.beginTransaction();
		session.persist(cd);
		t.commit();
		System.out.println("Done");
	}
	
	//for unidirectional
	public Customer getOnId(int id) 
	{
		Transaction t =session.beginTransaction();
		Customer c = session.get(Customer.class,id);
		if(c != null)
		{
		   return c;
		}
	  return null;
	}
	
	//for birectional
	public CustomerDetails getOnCDId(int cdid)
	{
		session.beginTransaction();
		CustomerDetails cd = session.get(CustomerDetails.class, cdid);
		return cd;
	}
	
	//for unidirectional
	public void update(int id,String name,String email)
	{
		Transaction t =session.beginTransaction();
		Customer c = session.get(Customer.class,id);
		if(c != null)
		{
		   c.setName(name);
		   c.getCd().setEmail(email);
		   session.update(c); 
		  //or session.merge(c);
		   t.commit();
		}
	    
	}
	
	//for unidirectional
	public void delete(int id)
	{
		Transaction t =session.beginTransaction();
		Customer c = session.get(Customer.class,id);
		if(c != null)
		{
			session.delete(c);
		}
		else
		{
			System.out.println("no such customer exists previously");
		}
		t.commit();
		
	}
	
	//for unidirectional
	public void getAll()
	{
		Transaction t =session.beginTransaction();
		String hql = "from Customer"; //the customer is not table name it is class name.
	    Query<Customer> query = session.createQuery(hql,Customer.class);
	    List<Customer> customers = query.list();
	    for(Customer cust: customers)
	    {
	    	System.out.println(cust.getCid()+" "+cust.getName()+" "+cust.getCd().getId()+" "+cust.getCd().getEmail()+" "+cust.getCd().getMobile());
	    }
		t.commit();
	}

	public void saveOrder(OrderTable o) {
		session.beginTransaction();
		session.persist(o);
		session.getTransaction().commit();
	}
	

}
