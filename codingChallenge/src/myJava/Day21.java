/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 21 🚀

Question:
Write a program that prints the number of vowels in a given string.

Example:
String: "Hello World"
Number of Vowels: 3
 */
package myJava;

import java.util.Scanner;

public class Day21 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int res=vowels(s);
		System.out.println(res);
	}
	static int vowels(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
						|| ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					c++;
				}
			}
		}
		return c;
    }

}
