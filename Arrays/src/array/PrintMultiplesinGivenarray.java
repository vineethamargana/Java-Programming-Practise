package array;

import java.util.Scanner;

public class PrintMultiplesinGivenarray {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of array:");
	int n=sc.nextInt();
	System.out.print("enter the numder to check multiples for it:");
	int k=sc.nextInt();
	int[] a=new int[n];
	System.out.print("enter the elements:");
	for(int i=0;i<a.length;i++)
	{   
		a[i]=sc.nextInt();
	}
	 multilpes(a,k);    
   }
	
   static void multilpes(int[] a,int k)
   {
	System.out.print("the elements are:");
	for(int i=0;i<a.length;i++)
	    {
		//  if(a[i]%2==0)
		 // if(a[i]%3==0)
		  if(a[i]%k==0)
		  {
			System.out.print(a[i]+" ");
	      }
   }

}

}
