/*#30DaysCodeAtTAPAcademy Challenge - Day 24 🚀

Question:
Write a program that converts a given string according to the following rules and prints the output:

Place '#' before vowels in the string.
Example:
Input: "Tap Academy"
Output: "T#ap #Ac#ad#emy"

Your Task:
Develop a program to convert the given string based on the provided rules and print the output, and share your solution in the comments below! 
Don't forget to use the hashtag #30DaysCodeAtTAPAcademy.

Let's convert the string according to the rules! 💻✨*/



package myJava;

import java.util.Scanner;

public class Day24 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res=vowels(s);
		System.out.println(res);
	}
	static String vowels(String s)
	{
		//int c=0;
		String r="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
						|| ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					r=r+'#'+s.charAt(i);
				}
				else
				{
					r=r+s.charAt(i);
				}
	    }
		return r;
    }

}
