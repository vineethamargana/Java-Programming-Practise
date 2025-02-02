/*
   LEGACY CLASSES AND INTERFACES: in the memory these are there but we should not touch it and use it. to support the projects that are created before the java 1.2 they are in the memory but we should not use them now.
   ------------------------------
   the difference between legacy class and collectionsframework is that the legacy class is synchronised where the 
   collectionsframework is not synchronised.
   performance wise the collectionsframework is the best 
   
   1.vector:
   ----------
    works like arraylist before the java 1.2 the people used to use this class.
    we should not use the vector whuch is legacy class instead we should use the arraylist 
    which is collectionsFramework. beacuse there is a great difference between the legacy class and collectionsframework in the implementation.
    
   2.hashtable:
   ------------
   it works same as the hashmap ... but we should not use the hashtable
   hashtable is outdated class where hashmap is the updated class
   
   3.stack:
   ----------
     this is not working as the stack so we should not use it instead we have to use arraydeque class
     the difference between stack and arraydeque 
   4.enumeration:(cursor) it is used for accessing the data and it is the interface
  ----------------
   it works same as the iterator in the collectionsframework but it doesnot work for the collectionsframework classes.
   it has the hasMoreElements() works like the hasNext() method 
   and the nextElement() works like the next() method   
   
   5.dictionary
 */


package corejavacollections2;

import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class LegacyClassesandInterfaces {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(30.4);
		v.add("tap");
		v.add(true);
		System.out.println(v);
		
		Stack s=new Stack(); // this is not working as the stack so we should not use it 
		s.push(100);
		s.push(200);
		s.push(300);
		System.out.println(s);
		//see the difference between stack and arraydeque
		ArrayDeque a=new ArrayDeque();
		a.push(100);
		a.push(200);
		a.push(300);
		System.out.println(a);
		
		Hashtable h=new Hashtable();
		h.put(7, "ronaldo");
		h.put(10, "messi");
		h.put(11, "suni");
		System.out.println(h);
		//observe the difference between the hashtable and hashmap
		HashMap h1=new HashMap();
		h1.put(7, "ronaldo");
		h1.put(10, "messi");
		h1.put(11, "suni");
		System.out.println(h1);
		
		
		//accessing vector elements.
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
