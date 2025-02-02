/*
   internal data structure of array list:

   -------------------------------------
   it is in the form of array.
   
   In-built methods in java:
  --------------------------
  there are four add methods:
 1.add( _ ):
  ----------
   this takes one parameter that is data.
 2.add( _,_) :
 -------------
 this takes two parameters ...one is integer ,another one is data
 it shift and insert the values.
 3.addAll( _ ):
 --------------
 this takes one parameter.
 it is used to add  the dara of another object to the rare end of the object.
 
 
   
 */

package corejavacollections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
	    al.add(100);
	    al.add(200);
	    al.add(300);
	    al.add(400); //op: [100, 200, 300, 400]
	    al.add(1, 900); //op:[100, 900, 200, 300, 400]
	    System.out.println(al);
	    
	    ArrayList al1=new ArrayList();
	    al1.add(10);
	    al1.add(20);
	    al1.add(30);
	    al1.add(40);
	    System.out.println(al1);
	    
	    //al.add(al1);
	    //System.out.println(al);
	    
	    al.addAll(al1);
	    System.out.println(al);
	    
	    al.addAll(1, al1);
	    System.out.println(al);

	}

}
