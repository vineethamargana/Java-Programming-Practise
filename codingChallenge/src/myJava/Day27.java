/*
  🚀 #30DaysCodeAtTAPAcademy Challenge - Day 27 🚀

Question:
Write a program that prints all the substrings of a given string.

Example:
String: "abc"
Substrings: "a", "ab", "abc", "b", "bc", "c"

 */

package myJava;

import java.util.Scanner;

public class Day27 {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	//int size=sc.nextInt();
	subStrings(s);
   }
   static void subStrings(String s)
   {
	   String res= "";
	   for(int i=0;i<s.length();i++)
	   {
		   for(int j=i;j<s.length();j++ )
		   {
			   for(int k=i;k<=j;k++)
			   {
				   res=res+s.charAt(k);
			    //System.out.print(s.charAt(k));
			   }
		       System.out.println(res);
		       res= "";
		   }
	   }
		   
	   }
   }

