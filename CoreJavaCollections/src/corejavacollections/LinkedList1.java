/*
 *
 *COLLECTIONS IS THE DATA STRUCTURES OF JAVA.
 *
  LINKED LIST:
  -----------
  THREE TYPES:
  1.SINGLE : only forword ..linked in only forward direction
  2.Doubly : both forward and backward...linked in both forward and backward directions
  3.circular : lat to first and first to last.
  
  
  PROPERTIES:(in linkend list the node nums are called indexs)
  -----------
  1.how to use it?... use it using add method
  2.it can store both homogeneous and heterogeneous data.
  3.it can store duplicates
  4.it csn store null.
  5. it preserves the order of insertion i.e in which order we insert the data in the same order it will give the output.
  6.constructors:(2)
    --->1.LinkedList()
         {
         }
    ---->2.LinkedList(collection)
         {
         }
  7.in -built methods:
     1.add(obj)
        special methods:
        a.addFirst()
        b.addLast()
        
     2.add(int,obj) //shifting not happen 
     3.addAll(_)
     4.addAll(_,_)
     5.removeAll()
       special methods:
       a.removeFirst()
       b.removeLast()
       
     6.retainAll()
     7.set()
     8.get()
       special methods:
       a.getFirst()
       b.getLast()
       
     9.contains()
     
     special methods :
     ----------------
     1.peek():
         the peek returns the first element in the array (version 1.5) .we have
         a.peekFirst()
         b.peekLast()
     2.Poll():
       it removes the first element.
       a.pollFirst()
       b.pollLast()
     3.offer():
       the offer method and add method both are same but the add method insert the data 
       no matter what the space is there or not it will insert by optimising the space.
       the offer method checks the space if the space is there it will insert otherwise it will not.
       ex:going to relatives home for dinner on festival day and nrml day.
       a.offerFirst()
       b.offerLast()
       
       
8.Accesing the LinkedList:
  1.traditional for loop
  2.enhanced fo loop
  3.using iterator(it is called as iterator) //only in forward direction nrml order
  4.using list itertor (it enables to access data in both normal order and reverse order).
  
9. initial capacity of linked list is zero
10.internal data structure of doubly linked list 
11.the time complexity is O(1) when inserting at te rare end and also at any random location and also at the starting because shifting doesnot happen.

Disadvantages of linked list:
-----------------------------
1.accessing the data is complex because the list values are linked to one another .
2.to store the data it consume more space.
  
 Advantages:
 -----------
 1.inserting at te rare end and also at any random location and also at the starting because shifting doesnot happen.
 2.no wastage of memory
     
 */

package corejavacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList li=new LinkedList(); //doubly linked list
		li.add(10);
		li.add(10);
		li.add(500);
		li.add("bii");
		li.add(67.89);
		li.add(true);
		li.add(null);
		
		System.out.println(li);
		//offer method:
		  
		
		
		//peek method:
		System.out.println(li.peek());
		//poll methid:
		System.out.println(li.poll());
		System.out.println(li);
		
		
		
		
		//linked list using collection constructor
		
		ArrayList al=new ArrayList();
		al.add(90);
		al.add(80);
		al.add(70);
		
		LinkedList lk=new LinkedList(al);//we can do it for arraylist also in vice versa
		System.out.println(lk); 
		
		
		
	//ACCESING LINKED LIST:
		 //traditional for loop:
	    for(int i=0;i<li.size();i++)
	    {
	    	//System.out.println(li.get(i));
	    }
	    
        //enhanced for loop.
	    for(Object b:li)
	    {
	    	//System.out.println(b);
	    }
	    
	    //using iterator
	    //we can not use iterator and list iterator oin same class
	    /*Iterator itr=li.iterator(); //cursor ... move(hasnext()),double click(next())
	    while(itr.hasNext())
	    {
	    	//System.out.println(itr.next());
	    }*/
	    
	    //using ListIterator
	    ListIterator lii=li.listIterator();
	    while(lii.hasNext())
	    {
	    	System.out.println(lii.next());
	    }
		
	  //to access in reverse order
	    ListIterator li1=li.listIterator(li.size());
	    while(li1.hasPrevious())
	    {
	    	System.out.println(li1.previous());
	    }
		
	}

}
