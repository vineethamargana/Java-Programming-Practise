/*
  Collections class: the methods in this class can be used by any of the collectionsframework class
 -------------------\
  we need not have to create object we can use it directly by importing.
  
  methods:
  --------
 1. sort():
  it has sort method which is used to sort the elements without using treeset 
  
 2. max():
   it will print the largest element in the arraylist.
 
 3.min():
  it will print the smallest element in the arraylist. 
  
 4.frequnecy(_,_):
  it gives the occurance of the element in the arraylist.
  
 5.shuffle():
  as the arraylist preserves the order of insertion this method is used to change the order 
  
 6.replaceAll(_,_,_):
  it replaces the before element with the new element in the list.
 */

package corejavacollections2;

import java.util.ArrayList;
import java.util.Collections;

public class Collect {
  public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(79);
	a.add(78);
	a.add(45);
	System.out.println(a);
	// we can sort the elements in the without using the treeset by using the Collections class and its sort method
	Collections.sort(a);
	System.out.println(a);
	
	//largest element
	System.out.println(Collections.max(a));
	
	
	//smallest element
    System.out.println(Collections.min(a));
    
    //frequency of the element
    System.out.println(Collections.frequency(a, 20));
    
    //shuffle
    Collections.shuffle(a);
    System.out.println(a);
    
    //replace all
    Collections.replaceAll(a, 20, 200);
    System.out.println(a);
	
	
}
}
