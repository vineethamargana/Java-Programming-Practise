
/*Question:
Write a program that takes two integers, n1 and n2, as input and prints the first y common multiples of n1 and n2.

Example:
Input: n1 = 3, n2 = 5, y = 4
Output: 15, 30, 45, 60

Your Task:
Develop a program in to find and print the first y common multiples of n1 and n2, and share your code in the comments below!
*/


package myJava;

import java.util.Scanner;

public class Day5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nums:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int y=sc.nextInt();
		multiples(n1,n2,y);
	}
	static void multiples(int n1,int n2,int y)
	{
		int c=0;
		for(int i=1;c < y;i++)
		{
			if(i%n1==0 && i%n2==0)
			{
				System.out.print(i+" ");
				c++;
			}
		}
	}
	

}
