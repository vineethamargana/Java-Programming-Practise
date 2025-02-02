/*Question:
Write a program that takes an integer `n` as input and performs the following actions:
- If `n` is a multiple of 3, print 'TAP'.
- If `n` is a multiple of 5, print 'ACAD'.
- If `n` is a multiple of both 3 and 5, print 'FULLSTACK'.
- Otherwise, print the number itself.

Example:
Input: 5 
Output: ACAD

Your Task:
Write a program to solve the above problem and share your code in the comments below!
*/



package myJava;

import java.util.Scanner;

public class Day1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the num:");
		int n=sc.nextInt();
		multiples(n);
	}
	static void multiples(int n)
	{
			if(n%3==0 && n%5==0)
			{
				System.out.println("FULLSTACK");
			}
			else if(n%3==0)
			{
				System.out.println("TAP");
			}
			else if(n%5==0)
			{
				System.out.println("ACAD");
			}
		}
	}


