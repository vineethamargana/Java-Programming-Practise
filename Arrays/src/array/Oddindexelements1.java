package array;

import java.util.Scanner;

public class Oddindexelements1 {
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
		 printOddIndexElements(a);     
	}
		
   static void printOddIndexElements(int[] a)  
	{
		System.out.print("the elements are:");
		//for(int i=1;i<a.length;i++,i++)
		for(int i=1;i<a.length;i=i+2)
		    {
				System.out.print(a[i]+" ");
			}
	}


}
