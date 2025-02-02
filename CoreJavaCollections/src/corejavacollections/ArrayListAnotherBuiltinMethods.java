/*
  removeAll(_):
  ------------
  it compares and removes all the duplicate values.
  
  retainAll(_):
  ------------
   it compares and retains all the dupliactes from the lists.
   
  remove(_):
  ---------
  it takes one parameter that is index integer
  
  get(_);
  -------
  it gets the value at that particular index. it takes one parameter.
  it works like ar[i].
  
  set(_,_):
  -------
  it is used to set the data at the required index,it delete and insert the data
  
  contains():
  -----------
  it takes one parameter i.e data ...and gives the outout as true or false.
  it checks whether the given data is there or not in the list
  
  isEmpty():
  ----------
  it checks whether the list is empty or not.
  it gives the output as true or false.
  
  getClass():
  -----------
  it give the content of the class .
  ex:class java.util.ArrayList
  
  size():
  -------
  it gives the length of the list ... we should not use length keyword or method to get the length
  we have to use size method.
  it gives the output as integer.
 */

package corejavacollections;

import java.util.ArrayList;

public class ArrayListAnotherBuiltinMethods {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	    al.add(10);
	    al.add(20);
	    al.add(300);
	    al.add(40); 
	    
	 //    remove():
	 //    --------
	     // al.remove(1); //op:10,300,40
	     //System.out.println(al);
	    
     //    get():
	 //   ------ 
	     //System.out.println(al.get(3)); //40
	    
	 //    set():
	    System.out.println(al);
	    al.set(2, 290);
	    System.out.println(al);
	
	 //    contains():   
	   System.out.println( al.contains(10));
	   
	//   isEmpty():
	   System.out.println(al.isEmpty());
	    
	//   getClass(): 
	   System.out.println(al.getClass());
	   
    //   size():
	   System.out.println(al.size());
	   
    
	    
	    ArrayList al1=new ArrayList();
	    al1.add(10);
	    al1.add(20);
	    al1.add(30);
	    al1.add(40);
	    System.out.println(al1);
	    
	   // al.removeAll(al1); //op:300
	    al.retainAll(al1); // op:10,20,30
	    System.out.println(al);
	    
	    
	}
}
