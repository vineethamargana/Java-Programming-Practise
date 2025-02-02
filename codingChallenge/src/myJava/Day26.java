/*
 "🚀 #30DaysCodeAtTAPAcademy Challenge - Day 26 🚀

Question:
Write a program that prints the last index of a given character in a given string.

Example:
String: ""hello world""
Character: 'o'
Last Index: 7

 */

package myJava;

import java.util.Scanner;

public class Day26 {
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
	   for(int index=s.length()-1;index>=0;index--)
	   {
	     if(s.charAt(index)==ch)
	     {
	    	 return index; 
	     }
       }
	   return -1;
   }

}
