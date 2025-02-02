package array;

import java.util.Scanner;

public class DivisibleElementsPrint {
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
		 divisibleElements(a);   
		 //System.out.print(v);
	}
		
   static void divisibleElements(int[] a)
	{
	   //int s=0;
		//System.out.print("the sum is:");
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]%2==0 && a[i]%3==0)
			  {
				System.out.print(a[i]+" ");
		      }

    }
	}
}
