/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 22 🚀

Question:
Write a program that removes all the special characters from a given string.

Example:
String: "Hello! @World#"
Output: "HelloWorld"

 */
package myJava;

import java.util.Scanner;

public class Day22 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    String res=vowels(s);
		System.out.println(res);
	}
	static String vowels(String s)
	{
		 String res="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
			{
				res=res+ch;
			}
		}
		return res;
		}

}
