package array;

import java.util.Scanner;

public class SwappingindexinArray {
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
		indexSwap(a);
	}
	static void indexSwap(int[] a)
	{
		//for(int i=0;i<a.length-1;i++)
		for(int i=0;i<a.length-1;i+=2)

		{
			int t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
		}
		System.out.println("After Swapping:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
