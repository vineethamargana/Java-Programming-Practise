/*
 * interview : difference between arraydeque and arraylist
 *             difference between arraydeque and linkedlist
 * 
 * queue:first in first out.fifo or lilo
 * stack:first in last out.filo or lifo
  ARRAYDEQUE:
  ------------
 1. arraydeque doesnot have indexs like arraylist and linkedlist
 2. it can store both homogeneous and heterogeneous data.
 3. it can store duplictaes.
 4. it cannot store null.
 5. it preserves the order of insertion.
 6. constructors:
    a.ArrayDeque()
    {
    
    }
    b.ArrayDeque(int)
    {
    
    }
    c.ArrayDeque(collections)
    {
    
    }
 7.default capacity:16 ...32 is the extended capacity..i.e current capacity*2
 8.internal data structure: Double ended queue ...we can insert data from start or end.
 9.inbuit methods:
   --------------- 
   1.add(): only one get is there
     a.addFirst()
     b.addLast()
   2.addAll()
   3.remove()
     a.removeFirst()
     b.removeLast()
   4.get() ...only get is not there ...it has 
     a.getFirst()
     b.getLast()
   5.peek(),peekFirst(),peekLast()
   6.poll(),pollFirst(),pollLast()
   7.offer().
  10.Accessibility:
     1.traditional for loop not possible becauxe there is no indexs.
     2.enhanced for loop.*
     3.iterator*
     4.list iterator:not possible because of no indexs
     5.descendingiterator*
  11. if we want to use the arraydeque like a stack we have to use push() instead of add()
      pop() is used to get the value at the last index. and the data will be deleted
  12. when to use:
       --->when we want to implement stack and queue we have to use arraydeque
       --->inserting data at rear end 
   13.disadvantages:
        a.inserting data at frontend takes time O(n).
        b.impossible to insert the data at random locations
 */

package corejavacollections2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDequeIntro {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque(); //constructor
		//ArrayDeque ad=new ArrayDeque(10); //constructor with int
		ad.add(10);
		ad.add(10);
		ad.add(20.8);
		ad.add(true);
		ad.addFirst(19);

		//ad.add(null);//nullpointerexception ocurs
		
		System.out.println(ad);
		
		//accesing 
		//enhanced for loop
		for(Object a:ad)
		{
			System.out.println(a);
		}
		//using iterator
	    Iterator itr=ad.iterator(); //cursor ... move(hasnext()),double click(next())
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    //descending iterator
	    Iterator itr1=ad.descendingIterator();
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());
	    }
		//collection constructor 
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		ArrayDeque ad1=new ArrayDeque(al);
		System.out.println(ad1);
		
		
		//stack
		ArrayDeque ad2=new ArrayDeque();
		ad2.push(10);
	    ad2.push(20);
		ad2.push(30);
		System.out.println(ad2.pop());
		System.out.println(ad2);
	}
}
