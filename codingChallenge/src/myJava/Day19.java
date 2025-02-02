/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 19 🚀

Question:
Write a program that reverses a given string.

Example:
Input: ""hello""
Output: ""olleh""
 */
package myJava;

import java.util.Scanner;

public class Day19 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res=reverse(s);
		System.out.println(res);
	}
	static String reverse(String s)
	{
		String res="";
		//char ch=s.charAt(0);
		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
			//res=res+ch;
		}
		return res;
	}

}
