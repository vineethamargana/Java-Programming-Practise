/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 7 🚀

Question:
Write a program that takes an integer n as input and checks if it is a palindrome number.

Example:
Input: 12321
Output: Palindrome

Your Task:
Develop a program determine whether a given number is a palindrome or not, and share your solution in the comments below!
Don't forget to use the hashtag #30DaysCodeAtTAPAcademy
 */
package myJava;
import java.util.Scanner;

public class Day7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();	
		int v=palindromeCheck(n);
		System.out.println((n==v)?"palindrome":"not palindrome");
		
	}
	 static int palindromeCheck(int n)
	{
		
		int s=0,r;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;	
		}
		return s;
		}

}
