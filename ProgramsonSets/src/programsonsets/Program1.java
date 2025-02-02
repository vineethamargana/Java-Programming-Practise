
/*
 hashset 

 */

package programsonsets;

import java.util.HashSet;

public class Program1 {
	public static void main(String []args) 
	{
		HashSet set=new HashSet();
		set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		set.add(25);
		set.add(125);
		set.add(150);

		System.out.println(set);
		set.remove(150);
		System.out.println(set);
		System.out.println(set.contains(75));
		System.out.println(set.contains(175));
		set.clear();
		System.out.println(set);
	}

}

/*
  output 1: without adding duplicates:
  input:
        set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		set.add(25);
		set.add(125);
		set.add(150);  
  op: [50, 20, 100, 150, 25, 10, 75, 125]
  
  output2: after adding duplicates:
  input:
        set.add(10);
		set.add(50);
		set.add(75);
		set.add(75);
		set.add(20);
		set.add(100);
		set.add(75);
		set.add(25);
		set.add(100);
		set.add(125);
		set.add(150);
		set.add(100);
  op:[50, 20, 100, 150, 25, 10, 75, 125]
  
  output3: using remove method ...it remove what we give
  input:set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		set.add(25);
		set.add(125);
		set.add(150);

		System.out.println(set);
		set.remove(150);
		System.out.println(set);
		
  op:
      [50, 20, 100, 150, 25, 10, 75, 125]
      [50, 20, 100, 25, 10, 75, 125]
      
  output4: using contains method...it gives true or false as output
  input:HashSet set=new HashSet();
		set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		set.add(25);
		set.add(125);
		set.add(150);
		
		set.contains(75);
		set.contains(175);
		
  op:
true
false

ouput5: using clear method ...it removes all the elements in the set
input:  set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		set.add(25);
		set.add(125);
		set.add(150);
		
		set.clear();
		System.out.println(set);
op: []
  
 */
