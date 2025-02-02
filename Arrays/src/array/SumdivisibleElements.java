//write a program to find the sum of elements which are divisible by 3 and 5
package array;

import java.util.Scanner;

public class SumdivisibleElements {
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
		int v= sumdivisibleElements(a);   
		System.out.print(v);
	}
		
   static int sumdivisibleElements(int[] a)
	{
	   int s=0;
		System.out.print("the sum is:");
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]%3==0 && a[i]%5==0)
			  {
				s=s+a[i];
		      }
         	}
		return s;

    }

}
