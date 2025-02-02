package sortedArrays;

import java.util.Scanner;

public class SmallestRepeatingElement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int v=Repeating(a);
		System.out.println(v);
	}
	static int Repeating(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				return a[i];
			}
		}
		return -1;
	}
}
