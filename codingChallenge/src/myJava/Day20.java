
/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 20 🚀

Question:
Write a program that checks if a given string is a palindrome or not.

Example:
String: "racecar"
Output: Palindrome
 */
 package myJava;

import java.util.Scanner;

public class Day20 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res=palindromecheck(s);
		System.out.println(res);
	}
	static String palindromecheck(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return "not palindrome";
			}
		}
		return "palindrome";
	}

}
