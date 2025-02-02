/*
 *ASSIGNMENT: check whether the methods in arraylist,linkeddlist,arraydeque are working for the treeset or not.
 *            check the access.
  Treeset:
  --------
  *.default capacity:0
  1.it gives the output in sorted order.
  -->.add method is used to add the data into the set 
  2.internal data structure:balanced binary tree.
  -->.treeset uses inorder traversal mechanism.
  -->.it places lvr at every values and sorts the set(lvr- left value right)
  3.it stores only homogeneous data ...beacuse it compares the values while executing .so heterogeous not allowed.
  4.Duplicates are not allowed.-->if we give true,false,true,false it print the output as false,true.
  5. we can not able to store null.
  6. it doesnot preserves the order of insertion
  7. In-built methods...ASSIGNMENT: check whether the methods in arraylist,linkeddlist,arraydeque are working for the treeset or not. 
  8. special methods:
     ----------------
     a.ceiling method:
       . if we give a random value it round off the value to the nearest highest value in the
        list and copy that value and print it .it doesnot delete the value in the list.
       . we the value give by us is not nearer to any value then it prints null  
       . if the given value is already present in the set then it prints the value as it is.
     b.higher method:
       . it is same as ceiling method but if the given value is already present in the data it will not print the same data
         instead it round of the value to the highest value and print.
         ex: if we give 100 ...it is already present in the set
             but it doesnot give 100 as output instead it prints 125. 
    c.floor():
       . if we give a random value it round off the value to the nearest  value in the
        list and copy that value and print it .it doesnot delete the value in the list.
       . we the value give by us is not nearer to any value then it prints null  
       . if the given value is already present in the set then it prints the value as it is. 
    d.lower():
       . it is same as floor method but if the given value is already present in the data it will not print the same data
         instead it round of the value to the lowest value and print.
       ex: if we give 100 ...it is already present in the set
             but it doesnot give 100 as output instead it prints 75.  
    e.headSet():
        . it gives the subset less than that element in the treeset
        .it is excluded means it gives the subset less than that value.
    f.tailset():
        . it gives the subset greater than or equal to that element in the treeset
        .it is included means it gives the subset greater than that value and including that value.
    g.first():
        .it gives the first or lowest element in the set
    h.last():
        .it gives the last or highest element in the set
        
9.constructors:
    a.TreeSet(Navigatablemap)
    b.TreeSet()
    c.TreeSet(comparator)
    d.Treeset(Collection)
    e.Treeset(SortedSet)
10.Accessibility:
   1.traditional for loop: not possible because there is no get method in treeset inbuilt or specialised methods.
   2.enhanced for loop:correct
   3.iterator :correct
   4.list iterator: it is a list iterator which is used for list type
   5.descending iterator:correct
11.when to use?
   a.sorted order applications or operations
   b.best for range operations because
     it is having:
      .headSet()
      .tailSet()
      .subset()
12.disadvantages:
   a.time complexity to insert or delete the data is O(log(n)).
   b.not preserves the order of insertion(prop not disadv)
   
         
 */

package corejavacollections2;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		//special methods:
		//ceiling method
		System.out.println(ts.ceiling(126));//150
		System.out.println(ts);
		
		//higher method
		System.out.println(ts.higher(100));//125
		System.out.println(ts);
		
		//floor method
		System.out.println(ts.floor(110));//100
		System.out.println(ts);
		
		//lower method
		System.out.println(ts.lower(100));//75
		System.out.println(ts);
		
		//headSet()
		System.out.println(ts.headSet(100));
		System.out.println(ts);
		
		//tailSet()
		System.out.println(ts.tailSet(100));
	    System.out.println(ts);
	    
	    //first()
	    System.out.println(ts.first());
	    
	   //last()
	    System.out.println(ts.last());
	    
	//Accessibility:
	    //traditional for loop
	    for(int i=0;i<ts.size();i++)
	    {
	    	//ts.get
	    }
	    
	    //enhanced for loop:
	    for(Object a:ts)
	    {
	    	System.out.println(a);
	    }
	    
	    //iterator
	    Iterator itr=ts.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	    
	    //list iterator
	   // ListIterator li1=ts.listIterator();
	    
	    //descending iterator
	    Iterator it=ts.descendingIterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	} 
}
