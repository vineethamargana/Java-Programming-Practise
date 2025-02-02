/*
 🚀 #30DaysCodeAtTAPAcademy Challenge - Day 23 🚀

Question:
Write a program that swaps the cases of characters in a given string.

Example:
String: "Hello World"
Output: "hELLO wORLD"
 */
package myJava;
import java.util.Scanner;


public class Day23 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 String res=swapCase(s);
		 System.out.println(res); 
	}
	
	 
	 static String swapCase(String s)
	 {
	 String r= "";
	 for(int i=0;i<s.length();i++)
	 {
	     char ch=s.charAt(i);
	     if(ch>='A' && ch<='Z') 
	       {
	          r=r+((char)(ch+32));
	       }
	     else if(ch>='a' && ch<='z')
	       {
	          r=r+((char)(ch-32));
	       }
	     else
	       {
	          r=r+ch;
	       }
   }
	 return r;
	 }

}
