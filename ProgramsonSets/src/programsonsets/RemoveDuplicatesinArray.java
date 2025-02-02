package programsonsets;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicatesinArray {
	 static void removeDuplicates(int[] a)
	{
		//HashSet<Character> set=new HashSet<Character>();
		//LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int X:a)
		{
			set.add(X);
		}
		for(int X:set)
		{
			System.out.println(X);
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		removeDuplicates(a);
		
	}

}
