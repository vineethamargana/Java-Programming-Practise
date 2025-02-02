/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 8 🚀

Question:
Write a program that calculates the sum of all elements present in an array.

Example:
Array: [1, 2, 3, 4, 5]
Sum: 15

Your Task:
Develop a program to compute the sum of all elements present in an array, and share your solution in the comments below!
 */
package myJava;
import java.util.Scanner;

public class Day8 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no of elements:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("the elements are:"+" ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sum(a);
	}
		static void sum(int[] a)
		{
		System.out.println("sum of elements is:");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
			System.out.print(sum);
		}
		
		
	}


