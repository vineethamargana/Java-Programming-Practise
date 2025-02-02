/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 15 🚀

Question:
Write a program that prints the unique elements in a sorted array.

Example:
Sorted Array: [1, 2, 2, 3, 4, 5, 5, 5]
Unique Elements: 1, 3, 4

Your Task:
Develop a program to print the unique elements in a sorted array, and share your solution in the comments below!
 */
package myJava;

import java.util.Scanner;

public class Day15 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 occurances(a);
	}

	static void occurances(int[] a) 
	{
		int c=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
			}
			else
			{
				if(c==1)
				{
				System.out.print(a[i]+" ");
				}
				c=1;
			}
		}
		if(c==1)
		{
		System.out.print(a[a.length-1]);
		}
		
	}

}
