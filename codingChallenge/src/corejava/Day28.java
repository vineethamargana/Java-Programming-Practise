/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 28 🚀

Question:
Write a program that checks whether two strings are equal without using any inbuilt methods.

Example:
String 1: "hello"
String 2: "hello"
Output: Equal

 */

package corejava;

import java.util.Scanner;

public class Day28 {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	//int size=sc.nextInt();
	subStrings(s1,s2);
	}
   static void subStrings(String s1,String s2)
   {
	   int i=0,j=0;
	   int count=0;
	   boolean b=false;
	   while(i<s1.length() && i<s2.length())
	   {
		   if(s1.charAt(i)==s2.charAt(j))
		   {
			  b=true;
			  i++;
			  j++;
		   }
		   else
		   {
			   return;
		   }
	   }
	   if(b==false)
	   {
		   System.out.println("not equal");
	   }
	   else
	   {
		   System.out.println("equal");
	   }
	}
}
