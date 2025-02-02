/*
Question:

Write a program that takes an integer n as input and prints all the factors of n.

Example:
Input: 12
Output: 1, 2, 3, 4, 6, 12

Your Task:
Implement a program to find and print all factors of a given number, and share your code in the comments below!*/

package myJava;

import java.util.Scanner;

public class Day2 
  {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the num:");
		int n=sc.nextInt();
		factors(n);

  }
	static void factors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
  }

