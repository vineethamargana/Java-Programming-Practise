/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 12 🚀

Question:
Write a program that prints all pairs from an array whose difference is equal to k.

Example:
Array: [9, 5, 6, 1, 2]
Difference: 4
Pairs: (9, 5), (5, 1), (6, 2)

 */
package myJava;

import java.util.Scanner;

public class Day12 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 int d=sc.nextInt();
	 printAllPairs(a,d);
	}
	static void printAllPairs(int[] a,int d)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]-a[j])==d || (a[j]-a[i])==d)
				{
				     System.out.print("("+a[i]+","+a[j]+")"+" ");
					/*
				     if(i<a.length-2)
					{
				     System.out.print("("+a[i]+","+a[j]+")"+", ");
					}
					else
					{
					     System.out.print("("+a[i]+","+a[j]+")");
					}*/
				}
			}
				
		}
	}


}
