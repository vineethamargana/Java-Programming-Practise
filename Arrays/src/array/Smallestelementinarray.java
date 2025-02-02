package array;

import java.util.Scanner;

public class Smallestelementinarray {
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
		 int v=smallestElement(a);  
		System.out.print("the smallest element is:" +v);
		
	}
		 
   static int smallestElement(int[] a)
	{
	    int min=Integer.MAX_VALUE;
		//int min=a[0]; //if we initialize with 0 the output will be 0 as it is the smallest element.
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]<min)
			  {
				  min=a[i];
			  }
         	}
         return min;
    }

}
