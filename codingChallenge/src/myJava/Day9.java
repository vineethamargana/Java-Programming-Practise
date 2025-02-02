/*
 🚀 #30DaysCodeAtTAP Challenge - Day 9 🚀

Question:
Write a program that finds the largest element present in an array.

Example:
Array: [5, 10, 3, 8, 15]
Largest Element: 15

Your Task:
Develop a program to determine the largest element present in an array, and share your solution in the comments below!
 */
package myJava;
import java.util.Scanner;

public class Day9 {
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.print("enter the elements:"+" ");
	for(int i=0;i<a.length;i++)
	  {
	 		a[i]=sc.nextInt();	
	  }
	int v=largest(a);
	System.out.println(v);
  }
  static int largest(int []a)
	{
      int max=Integer.MIN_VALUE;
      for (int i = 1; i < a.length; i++) 
      {
          if (a[i] > max)
          {
              max = a[i];
          }
      }
      return max;
}
}

