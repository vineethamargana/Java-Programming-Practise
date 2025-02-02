package array;

import java.util.Scanner;

public class OddelementsSum {

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
		int v= oddElements(a);   
		System.out.print(v);
	}
		
   static int oddElements(int[] a)
	{
	   int s=0;
		System.out.print("the sum is:");
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]%2!=0)
			  {
				s=s+a[i];
		      }
         	}
		return s;

    }

}
