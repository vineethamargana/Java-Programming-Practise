/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 16 🚀


Question:
Write a program that prints all the sub arrays of an array.

Example:
Array: [1, 2, 3]
Sub arrays:
[1]
[1, 2]
[1, 2, 3]
[2]
[2, 3]
[3]

Your Task:
Develop a program to print all the sub arrays of a given array, and share your solution in the comments below!
 */
package myJava;

import java.util.Scanner;

public class Day16{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 subArrays(a);
	 
	}

	static void subArrays(int[] a)
	{
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i;j<a.length;j++)
		   {
			   for(int k=i;k<=j;k++)
			   {
				   System.out.print(a[k]+" ");
			   }
			   System.out.println();
		   }
	   }
	}

}
