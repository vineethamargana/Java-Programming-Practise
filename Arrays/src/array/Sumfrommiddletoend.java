package array;

import java.util.Scanner;

public class Sumfrommiddletoend {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<a.length;i++)
		{ 
			a[i]=sc.nextInt();
		}
		int v=sum(a);  
		System.out.print("the sum of elements is:" +v);
		
	}
		
   static int  sum(int[] a)
	{
		int s=0;
		for(int i=a.length/2;i<a.length;i++)
		    {
			  s=s+a[i];
         	}
         return s;
    }

}
