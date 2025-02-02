/* Question:

Write a program that takes an integer n as input and checks whether it is a prime number or not.

Example:
Input: 7
Output: Prime

Your Task:
Implement a program to determine whether a given number is prime or not, and share your code in the comments below!
 */




package myJava;

import java.util.Scanner;

public class Day3 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String s=primeCheck(n);
	 System.out.print(s);
	

}
static String primeCheck(int n)
{
	if(n==1)
	{
		return "not prime";
	}
	for(int i=2;i*i<=n;i++)//i<=root n
	{
		
		if(n%i==0)
		{
			return "not prime";
		}
	}
	return "prime";
    }

}
