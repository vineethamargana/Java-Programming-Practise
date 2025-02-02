/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 18 🚀


Question:
Write a program that prints the largest sub array whose sum is equal to k.

Example:
Array: [1, 2, 3, 4, 5]
Target Sum: 9
Largest Sub array with Sum 9: [2, 3, 4]
 */
package myJava;

import java.util.Scanner;

public class Day18 {
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
	   for(int i=a.length;i>0;i--)
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
			      return;
				}
		   }
	   }
	}

}
