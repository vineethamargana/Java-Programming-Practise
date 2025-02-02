/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 10 🚀

Question:
Write a program that counts the occurrences of an element in an array.

Example:
Array: [1, 2, 3, 2, 2, 4, 5]
Element to Count: 2
Occurrences: 3
 */
package myJava;

import java.util.Scanner;

public class Day10 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] a=new int[n];
	 System.out.print("Array:");
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 System.out.print("Element to Count:");
	 int c=sc.nextInt();
	 int v=occurance(a,c);
	 System.out.println("Occurances:"+v);
	}

	 static int occurance(int[] a,int c) 
	 {
		 int count=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==c)
			 {
				 count++;
			 }
		 }
		return count;
	}

}
