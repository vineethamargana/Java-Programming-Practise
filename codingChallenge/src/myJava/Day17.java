/*
 Question:
Write a program that prints the sum of all sub arrays whose sum is equal to k.
Example:
Array: [5, 2, 3, 4, 1]
Target Sum: 10
Sub arrays with Sum8:
[5, 2, 3]
[2, 3, 4, 1]
 */
package myJava;

import java.util.Scanner;

public class Day17 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 int ts=sc.nextInt();
	 subArrays(a,ts);
	 
	}

	static void subArrays(int[] a,int ts)
	{
		//int s=0;
	  /* for(int i=0;i<a.length;i++)
	   {
		   for(int j=i;j<a.length;j++)
		   {
			   int s=0;
			   for(int k=i;k<=j;k++)
			   {
				   s=s+a[k];
			   }
			   if(s==ts)
				{
				   for(int k=i;k<=j;k++)
				   {
				   System.out.print(a[k]+" ");
				   }
			       System.out.println();
				}
		   }
	   }*/
		 for(int i=1;i<=a.length;i++)
		   {
			   for(int j=0;j<=a.length-i;j++)
			   {
				   int s=0;
				   for(int k=j;k<j+i;k++)
				   {
					   s=s+a[k];
				   }
				   if(s==ts)
					{
					   for(int k=j;k<j+i;k++)
					   {
					   System.out.print(a[k]+" ");
					   }
				       System.out.println();
					}
			   }
		   }
	}
}
