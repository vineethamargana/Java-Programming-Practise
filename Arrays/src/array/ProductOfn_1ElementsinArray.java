package array;

import java.util.Scanner;

public class ProductOfn_1ElementsinArray {
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
	int r[]=product(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(r[i]+" ");
	}
	}
	static int[] product(int[] a)
	{
		int p=1;
		int[] v=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			p=p*a[i];
		}
		for(int i=0;i<a.length;i++)
				{
					v[i]=p/a[i];	
				}
	     return v;
    }
}
