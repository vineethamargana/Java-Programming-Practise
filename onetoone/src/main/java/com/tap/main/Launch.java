package com.tap.main;

import java.util.ArrayList;

import com.tap.entity.Customer;
import com.tap.entity.CustomerDetails;
import com.tap.entity.OrderTable;
import com.tap.manager.HibernateManager;

public class Launch {
     public static void main(String[] args) {
    	// HibernateManager hm = new HibernateManager(); //session will be created as it has constructor in that class
 
/*
    	//******************* adding or inserting data****************
      
         CustomerDetails cd = new CustomerDetails(5,"mahi@gmail.com",889909009);
      //   Customer c = new Customer(5,"mahi",cd); //for one to one mapping
         Customer c = new Customer(5,"mahi"); //for birectional mapping
   
         //unidirectional mapping
//         hm.add(c);
//         it will update the values both in the customer and customer details table
        
//        hm.add(cd);
//       it will only update the values in the customerdetails table as it is unidirectional.
//       if we remove the comment line for hm.add(c) and also hm.add(cd) then it will work ... but the same operation can be done by hm.add(c) independently. 

         
         // birectional mapping
         c.setCd(cd);
         cd.setCustomer(c);
         hm.add(cd);
   
*/
    	 
    	 
    	 //******************* fetching data on id or search specific data ****************
    	 //unidirectional
/*
           int id = 11;
           Customer c = hm.getOnId(id);
           if(c!= null) { 
           System.out.println(c.getCid());
           System.out.println(c.getName());
           System.out.println(c.getCd().getId()+" "+c.getCd().getEmail()+" "+c.getCd().getMobile()); // getting the details of the customer also from customertable using the customer details object creating in customer table using getters.
           }
           else
           {
        	   System.out.println("no record found");
           }  
 
*/
    	 //bidrectional
/*       CustomerDetails cd = hm.getOnCDId(4);
         System.out.println(cd.getId()+" "+cd.getEmail()+" "+cd.getMobile()
                            +" "+cd.getCustomer().getCid()+" "+cd.getCustomer().getName());
         
*/    	 
    	 
    	 
    	 //******************* updating data****************
    	 
         //unidirectional
/*    	 int id=1;
    	 String name = "Rohit";
    	 String email="rohit@gmail.com";
    	 hm.update(id, name, email);
*/
    	 
        
         
         
    	 //******************* deleting data*****************
/*   	 
    	 int id=1;
    	 hm.delete(id);
    	 
*/
    	 
    	 //******************* get all data****************
    	// hm.getAll();
    	 
    	 
    	 
    	 
    	 
    	 
//    	 //using ordertable from here
// 
//    	 HibernateManager hm = new HibernateManager();
//    	 Customer c = new Customer(7,"tohit");
//    	 CustomerDetails cd = new CustomerDetails(7,"tohit@gmail.com",99678899);
//    	 c.setCd(cd);
//    	 
//    	 OrderTable o1 = new OrderTable("vada",78,c);
//    	 OrderTable o2 = new OrderTable("masala",80,c);
//    	 OrderTable o3 = new OrderTable("gee",30,c);
//    	 
////    	 manytoone
////    	 o1.setCustomer(c);
////    	 o2.setCustomer(c);
////    	 o3.setCustomer(c);
////    	 
////    	 hm.saveOrder(o1);
////    	 hm.saveOrder(o2);
////    	 hm.saveOrder(o3);
//    	 
////      onetomany 	    	 
//    	 ArrayList<OrderTable> al= new ArrayList<OrderTable>();
//    	 al.add(o1);
//    	 al.add(o2);
//    	 al.add(o3);
//    	 
//    	 c.setOrders(al);
//    	 hm.add(c);
//    	 
//    	 System.out.println("************************/nDone");
//    	 
    	 HibernateManager hm = new HibernateManager();
    	 Customer c = hm.getOnId(4);
    	 System.out.println(c.getCid()+" "+c.getName()+" "+c.getCd().getEmail()
    			 +" "+ c.getCd().getMobile()+" "+c.getOrders());
    	 System.out.println("*************\nDone");
	}
   
}
