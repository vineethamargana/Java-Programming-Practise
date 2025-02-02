package sortedArrays;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int v=largestRepeating(a);
		System.out.println(v);
	}
	static int largestRepeating(int[] a)
	{
		for(int i=a.length-1;i>=1;i--)
		{
			if(a[i]==a[i-1])
			{
				return a[i];
			}
		}
		return -1;
	}
	

}
