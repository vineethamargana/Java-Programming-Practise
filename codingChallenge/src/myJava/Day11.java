/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 11
 🚀

Question:
Write a program that prints all the pairs in an array.

Example:
Array: [1, 2, 3, 4, 5]
Pairs: (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5), (4, 5)
 */
package myJava;

import java.util.Scanner;

public class Day11 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
		 printAllPairs(a);
	}
	static void printAllPairs(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(i<a.length-2)
				{
				   System.out.print("("+a[i]+","+a[j]+")"+",");
				}
				else
				{
				   System.out.print("("+a[i]+","+a[j]+")");
				}
			}
				
		}
	}

}
