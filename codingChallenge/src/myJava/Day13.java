/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 13 
🚀

Question:
Write a program that prints the largest repeating element in a sorted array.

Example:
Input:
Array: [1, 1, 1, 2, 3, 3, 5, 5, 5]
Output:
5
 */
package myJava;

import java.util.Scanner;

public class Day13 {
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
		int r=largestElement(a); 
		System.out.print(r);
	}
		
   static int  largestElement(int[] a)
	{
		System.out.print("the largest repeating element is:");
		for(int i=a.length-2;i>=0;i--)
	      {
		    if(a[i]==a[i+1])
			  {
				return a[i];
		      }
          }
		return -1;

    }


}
