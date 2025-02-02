/*
  8.Accessing the list values:

  --------------------------
  1.traditional for loop
  2.enhanced fo loop
  3.using iterator(it is called as iterator) //only in forward direction nrml order
  4.using list itertor (it enables to access data in both normal order and reverse order).
  
9. Time complexity of ArrayList:
  -----------------------------
  the time complexity for inserting one element is 1ns...therefore the time complexity can be given as O(1).
 
10.internal data structure of arraylist is array
  Advantages:
  -----------
  1.inserting data at the rare end it takes less time complexity i.e O(1).
  2.accessing the data is best using array list 
  
  Disadvantages:
  --------------
  1.chances of memory wastage
  2.when we have to insert the data at any other location except at the rare end the time complexity is more i.e O(n).
  
  

  ARRAYLIST STORES ONLY OBJECTS.
 */

package corejavacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListCount {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40); 
	    
	    //traditional for loop:
	    for(int i=0;i<al.size();i++)
	    {
	    	//System.out.println(al.get(i));
	    }
	    
	    //enhanced for loop.
	    
	    for(Object a:al)
	    {
	    	//System.out.println(a);
	    }
	    
	    //using iterator
	  //we can not use iterator and list iterator oin same class
	  /*  Iterator itr=al.iterator();
	    while(itr.hasNext())
	    {
	    	//System.out.println(itr.next());
	    }
	    */
	    
	    //using ListIterator
	    ListIterator li=al.listIterator();
	    while(li.hasNext())
	    {
	    	System.out.println(li.next());
	    }
	    
	    //to access in reverse order
	    ListIterator li1=al.listIterator(al.size());
	    while(li1.hasPrevious())
	    {
	    	System.out.println(li1.previous());
	    }
	     
	}

}
