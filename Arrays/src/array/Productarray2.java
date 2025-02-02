package array;

import java.util.Scanner;

public class Productarray2 {
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
	product(a);

}
	static void product(int[] a)
	{
		int p=1;
		int[] v=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			p=p*a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(p/a[i]+" ");
		}
	}

}
