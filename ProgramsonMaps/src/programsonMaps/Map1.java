package programsonMaps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Map1 {
	static void countOccurances(String s)
	{
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				int c=map.get(ch);
				map.put(ch, c+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		Set<Entry<Character,Integer>> entrys=map.entrySet();
		String t="";
		for(Entry<Character,Integer> e:entrys)
		{
			t=t+e.getKey()+e.getValue();
		}
		System.out.println(t);
		
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		countOccurances(s);
	}
}
/*
missisiipi
m1i5s3p1
 */
