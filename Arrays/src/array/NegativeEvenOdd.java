package array;

import java.util.Scanner;

public class NegativeEvenOdd {
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
		negevenoddElements(a);   
	}
		
   static void negevenoddElements(int[] a)
	{
	   for(int i=0;i<a.length;i++)
	    {
		  if(a[i]<0)
		  {
		    System.out.print(a[i]+" ");
	      }
    	}
	   System.out.println();
	   for(int i=0;i<a.length;i++)
	    {
		  if(a[i]%2==0 && a[i]>0)
		  {
		    System.out.print(a[i]+" ");
	      }
     	}
	   System.out.println();
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]%2!=0 && a[i]>0)
			  {
			    System.out.print(a[i]+" ");
		      }
         	}

}
}
