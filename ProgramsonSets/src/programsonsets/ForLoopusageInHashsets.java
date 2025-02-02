
/*
   as there are two types of for loops to print arrays
1.traditional for loop
   for(int i=0;i<ar.length;i++)
   {
      s.o.p(ar[i]);
   }
 2. Enhanced for loop or for each loop
     for(int x:ar)
     {
         s.o.p(x); 
     }
      
     AS INDEXS ARE NOT THERE IN SETS WE HAVE TO USE ENHANCED FOR LOOPS
*/

package programsonsets;

import java.util.HashSet;

public class ForLoopusageInHashsets {
	public static void main(String []args) 
	{
		HashSet<Integer> set=new HashSet<Integer>();
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
