package array;

import java.util.Scanner;

public class PrinttheindexofK {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size of array:");
	int n=sc.nextInt();
	System.out.print("enter the number to check the index for it:");
	int k=sc.nextInt();
	int[] a=new int[n];
	System.out.print("enter the elements:");
	for(int i=0;i<a.length;i++)
	{   
		a[i]=sc.nextInt();
	}
	 index(a,k);    
   }
	
   static void index(int[] a,int k)
   {
	System.out.print("the elements are:");
	for(int i=0;i<a.length;i++)
	    {
		  if(a[i]==k)
		  {
			System.out.print(i+" ");
	      }
   }

}

}
