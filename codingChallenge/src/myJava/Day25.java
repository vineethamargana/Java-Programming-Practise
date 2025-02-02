/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 25 🚀


Question:
Write a program that prints the index of a given character in a given string.

Example:
String: "hello"
Character: 'o'
Index: 4

 */
package myJava;

import java.util.Scanner;

public class Day25 {
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	char ch=sc.next().charAt(0);
	int res=printindex(s,ch);
	System.out.println(res);
   }
   static int printindex(String s,char ch)
   {
	   for(int index=0;index<s.length();index++)
	   {
	     if(s.charAt(index)==ch)
	     {
	    	 return index; 
	     }
       }
	   return -1;
   }
}
