package array;

import java.util.Scanner;

public class Evenelementsinanarray {
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
		 evenlements(a);    
	}
		
   static void evenlements(int[] a)
	{
		System.out.print("the elements are:");
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]%2==0)
			  {
				System.out.print(a[i]+" ");
		      }
         	}

    }

}
