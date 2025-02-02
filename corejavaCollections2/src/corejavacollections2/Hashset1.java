/*
 *  ASSIGNMENT: check the methods present in arraylist,linkedlist,arraydeque,treeset are working for this or not.

  HASHSET:
 ---------
 bucket locations: locations that hold the data
 hastable: hashtable is something that is having 16 bucket locations.
 hashfunction: it is a complex mathematicl expression which decides the place where the value to be inserted. 
 Hashing:combination of hash function and hash table is called hashing
 
 1.internal data structure: hashing
 2.it doesnot preserves the order of insertion
 3.default capacity:16 
 4.load factor:0.75 ...if the 75% of the locations i.e 12 out of 16 is getting filled it 
               will double the locations or size i.e 32 
             SO THERE IS A LESS CHANCE FOR COLLISON
 5.it stores the homogeneous as well as heterogeneous data also.
 6.it doesnot stores duplicates ... set based classes do not store duplicates.
 7.hashset stores null.
 8.constructors:5 
    a.HashSet()
    b.HashSet(collection)
    c.HashSet(initial capacity,load factor)
    d.Hashset(initial capacity)
    e.HashSet(initial capacity,load factor,dummy)
 9.Methods: Assignment check the methods present in arraylist,linkedlist,arraydeque,treeset are working for this or not.
 10.no special methods in this.
 11.Accessibility:
   1.traditional for loop:not possible because there is no get method in treeset inbuilt or specialised methods.
   2.enhanced for loop:correct
   3.iterator :correct
   4.list iterator:no. it is a list iterator which is used for list type
   5.descending iterator:not correct
 12.hierarchy
 13.when to use?
    a.frequently inserting and removing .time complexity O(n).
    b.traverse only in forward direction
    c.no preserve order of insertion.
 14.Disadvantages:
    a.wastage of memory
    b.
 
 */


package corejavacollections2;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		hs.add(45.4);
		hs.add("hii");
		hs.add('j');
		hs.add('j');
		hs.add(null);
		System.out.println(hs);
		//Accessibility:
	    //traditional for loop
	    for(int i=0;i<hs.size();i++)
	    {
	    	//ts.get
	    }
	    
	    //enhanced for loop:
	    for(Object a:hs)
	    {
	    	System.out.println(a);
	    }
	    
	    //iterator
	    Iterator itr=hs.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    
	    //list iterator
	   // ListIterator li1=ts.listIterator();
	    
	    //descending iterator
	   /* Iterator it=hs.descendingIterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }*/
	}
		
	}


