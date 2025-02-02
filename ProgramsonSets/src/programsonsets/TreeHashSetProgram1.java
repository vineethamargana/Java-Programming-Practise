
/*
  TREE SET: note: not tree hashset it is tree set 
  
  if we want to print them in the sorted order we have to use tree sets
 */

package programsonsets;

import java.util.TreeSet;

public class TreeHashSetProgram1 {
	public static void main(String []args) 
	{
	    TreeSet<Integer> set=new TreeSet<Integer>();
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
