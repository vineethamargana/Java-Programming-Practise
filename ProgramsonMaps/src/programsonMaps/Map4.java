/*
 * leads to conflit leads leads to
leads                                                                           
 */

package programsonMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Map4 {
	static void count(String s)
	{
		String[] ar=s.split(" ");
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(int i=0;i<ar.length;i++)
		{
			map.put(ar[i],map.getOrDefault(ar[i],0)+1);
		}
		Set<Entry<String,Integer>> entrys=map.entrySet();
		for(Entry<String,Integer> e:entrys)
		{
			if(e.getValue()>2)
			{
			   System.out.println(e.getKey());
			}
		}		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		count(s);
	}


}
