package array;

import java.util.Scanner;

public class SumPositiveNegative {
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
	        sumpositivenegative(a);    
	}
		
   static void  sumpositivenegative(int[] a)
	{
	   int s=0,n=0;
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]>=0)
			  {
				s=s+a[i];
		      }
         	}
		System.out.println("the positvie sum is :"+s);
		for(int i=0;i<a.length;i++)
	    {
		  if(a[i]<0)
		  {
			n=n+a[i];
	      }
     	}
		System.out.println("the negative sum is :"+n);


    }

}
