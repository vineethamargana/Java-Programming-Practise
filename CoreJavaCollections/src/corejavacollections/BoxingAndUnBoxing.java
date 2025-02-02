/*
  Wrapper class:
  ------------
  Integer class
  Float
  Boolean
  Long
  Double
  Char
  
  
  
  Boxing:
  ------
  the process of converting primitive data type to an object using Wrapper class is called Boxing.
  
  Auto Boxing:
  -----------
  
  
  Unboxing:
  ---------
  
  
  Auto Unboxing:
  --------------
  
  
  
  DIFFERENCE BETWEEN ARRAY AND ARRAYLIST:
  ---------------------------------------
  
  ARRAY:
  -----
  1.size: it is fixed
  2.memory Wastage: no wastage 
  3.performance: insertion at rare end and any random location he is the best .Accessing:O(1)
  4.Insertion at random location: delete the previous and insert.
  5.Flexibility: can store primitive datatypes and objects
  6.In built methods: less number of methods,but he can use methods from Arrays(utility class)
  7.it can store only Homogeneous data.
  8.toString method: inherited
  
  ARRAYLIST:
 ----------
 1.size: it is dynamic
 2.memory wastage: chances of memory wastage
 3.performance:insertion at any rare end he is the best(O(1)). Accessing:O(1)
 4.Insertion at random location: shift the previous and insert.
 5.Flexibility: can store only objects
 6.In built methods: more number of methods ,but he cn use methods from collections
 7.it can store both Homogeneous and heterogenous data.
 8.toString method: overriden
 */


package corejavacollections;

import java.util.ArrayList;
class Dog
{
	
}

public class BoxingAndUnBoxing {
	public static void main(String args[])
	{
		int a=10;
		
		//boxing
		Integer i=new Integer(a);
		System.out.println(i); //10---object 
		System.out.println(a); //10---primitive data type
		
		//auto boxing
		Integer j=a;
		System.out.println(j); //10
		System.out.println(a); //10
		
		//unboxing
		Integer k=new Integer(20);
		int b=k.intValue();
		System.out.println(k);
		System.out.println(b);
		
		//auto unboxing
		Integer l=new Integer(30);
		int c=l;
		System.out.println(l);
		System.out.println(c);
		
		
		//boxing arraylist
		ArrayList al=new ArrayList();
		 al.add(new Integer(100)); 
		 System.out.println(al);
		/*
		  Integer x=new Integer(100);
		  al.add(x); 
		  System.out.println(al);
		 */
		
		 
		 //autoboxing
		 ArrayList al1=new ArrayList();
		 Dog d=new Dog();
		 al1.add(10);
		 al1.add(17.17);
		 al1.add(d);
		 al1.add(new Thread());
		 al1.add(new Exception());
		 System.out.println(al1);
		 
		
	}

}
