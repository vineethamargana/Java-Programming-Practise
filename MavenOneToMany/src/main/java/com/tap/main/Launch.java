package com.tap.main;

import com.tap.entity.Author;
import com.tap.manager.HibernateManager;

public class Launch {

	public static void main(String[] args) {
/*
		Author a = new Author("Dennis Riche");
		
		Books b1 = new Books("c- zero to hero ");
		Books b2 = new Books("c- bootcamp ");
		Books b3 = new Books("c- mastreclass ");
		
		ArrayList<Books> bookList = new ArrayList<Books>();
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		b1.setAuthor(a);
		b2.setAuthor(a);
		b3.setAuthor(a);
		
		a.setBooks(bookList);
		
		HibernateManager hm = new HibernateManager();
		hm.add(a);
		System.out.println("data added");
*/
		
		HibernateManager hm = new HibernateManager();
		Author a = hm.fetch(2);
		System.out.println(a.getId()+" "+a.getName()+" "+a.getBooks());
		
		
	}
}
