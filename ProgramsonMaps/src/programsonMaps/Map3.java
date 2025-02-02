
/*
 * METHOD2
5
2 3 2 3 4
2
 */

package programsonMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Map3 {
	static void countOccurances(int[] ar)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++)
		{
				//int c=map.getOrDefault(ar[i],0);
				//map.put(ar[i],c+1);
			map.put(ar[i],map.getOrDefault(ar[i],0)+1);
		}
		int pairs=0;
		Collection<Integer> values=map.values();
		for(int value:values)
		{
			pairs=pairs+value/2;
		}
		System.out.println(pairs);
				
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i < ar.length; i++) 
        {
			ar[i]=sc.nextInt();
		}
		countOccurances(ar);
	}


}
