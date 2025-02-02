/*
 * Question:
Write a program that takes two integers, n1 and n2, as input and prints the common factors of n1 and n2.

Example:
Input: n1 = 12, n2 = 18
Output: 1, 2, 3, 6

Your Task:
Develop a program in your preferred programming language to find and print the common factors of n1 and n2, and share your solution in the comments below!
 */

package myJava;

import java.util.Scanner;

public class Day4 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nums:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		factors(n1,n2);

  }
	static void factors(int n1,int n2)
	{
		int k=n1<n2?n1:n2;
		for(int i=1;i<=k;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
