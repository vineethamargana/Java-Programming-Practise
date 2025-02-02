/*
 Question:🚀 #30DaysCodeAtTAPAcademy Challenge - Day 6 🚀

Question:
Write a program to find the Highest Common Factor (HCF) of two numbers.

Example:
Numbers: 24, 36
HCF: 12

Your Task:
Develop a program to calculate the Highest Common Factor (HCF) of two given numbers, and share your solution in the comments below!
Don't forget to use the hashtag #30DaysCodeAtTAPAcademy.

Let's find the HCF! 💻✨
 */
package myJava;

import java.util.Scanner;

public class Day6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nums:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int hcf=hcf(n1,n2);
		System.out.println(hcf);
	}

	public static int hcf(int n1, int n2) 
	{
		int k=n1<n2?n1:n2;
		for(int i=k;i>=0;i--)
		{
		    if(n1%i==0 && n2%i==0)
		    {
		         return i;
		    }
		}
		return 0;
	}
	

}
