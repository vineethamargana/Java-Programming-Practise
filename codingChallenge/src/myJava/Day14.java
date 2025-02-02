/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 14 🚀


Question:
Write a program that prints the occurrences of all elements in a sorted array.

Example:
Array: [1, 1, 1, 2, 3, 3, 5, 5, 5, 6]
Occurrences:
1 - 3
2 - 1
3 - 2
5 - 3
6 - 1

Your Task:
Develop a program in your preferred programming language to print the occurrences of all elements in an array, and share your solution in the comments below!
 */
package myJava;

import java.util.Scanner;

public class Day14 {
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
				System.out.println(a[i]+" - "+c);
				c=1;
			}
		}
		System.out.println(a[a.length-1]+" - "+c);
		
	}

}
