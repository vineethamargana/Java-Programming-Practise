
/*
 * LINKED HASHSET:

 
  to get the correct order in which we have added the elements we have to use linked hashsets
 */

package programsonsets;

import java.util.LinkedHashSet;

public class LinkedHashSetsProgram1 {
	public static void main(String []args) 
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		for(Integer X:set)
		{
		   System.out.println(X);  //to print the set without the bracekets we have to make it as array
		}
	}
}
/*
output:
input:LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(50);
		set.add(75);
		set.add(20);
		set.add(100);
		for(Integer X:set)
		{
		   System.out.println(X);  //to print the set without the bracekets we have to make it as array
		}
op:
10
50
75
20
100
*/