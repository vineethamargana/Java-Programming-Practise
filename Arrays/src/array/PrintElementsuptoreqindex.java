package array;

import java.util.Scanner;

public class PrintElementsuptoreqindex {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number by which u want to decrease the array:");
		int k=sc.nextInt();
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		reqElements(a,k);    
	}
		
   static void reqElements(int[] a,int k)
	{
		System.out.print("the elements are:");
		for(int i=0;i<a.length-k;i++)
		    {
				System.out.print(a[i]+" ");
         	}

    } 
}
