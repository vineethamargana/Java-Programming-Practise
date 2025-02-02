//backward reversal

package array;

import java.util.Scanner;

public class PrintingelementsinreverseOrder {
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
		reverseOrder(a);    
	}
		 
   static void reverseOrder(int[] a)
	{
		System.out.print("the elements are:");
			for(int i=a.length-1;i>=0;i--) // i should be initialized with a.length - 1  because the index starts from 0 and the length counts from 1
		    {
				System.out.print(a[i]+" ");
         	}

    } 

}
