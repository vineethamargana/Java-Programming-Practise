package array;

import java.util.Scanner;

public class MaxandMinProductOfn_1Elements {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<a.length;i++)		
		{
			a[i]=sc.nextInt();
		}
		int k=product(a);
		int l=largest(a);
		int s=smallest(a);
		System.out.println("min sum of n-1 elements:"+(k/l));
		System.out.println("max sum of n-1 elements:"+(k/s));
		
		
	}
	static int product(int[] a)
	{
		int p=1;
		for(int i=0;i<a.length;i++)
		{
			p=p*a[i];
		}
		return p;
	}
	static int largest(int[] a)
	{
		int l=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>l)
			{
				l=a[i];
			}
		}
		return l;
	}
	static int smallest(int []a)
	{
		int s=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s)
			{
				s=a[i];
			}
		}
		return s;
	}

}  

