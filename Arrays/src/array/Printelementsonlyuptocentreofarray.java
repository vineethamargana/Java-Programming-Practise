package array;

import java.util.Scanner;

public class Printelementsonlyuptocentreofarray {
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
		elementsuptocenter(a);    
	}
		
   static void elementsuptocenter(int[] a)
	{
		System.out.print("the elements are:");
		   // for(int i=0;i<a.length/2;i++)//if even use this
			for(int i=0;i<=a.length/2;i++) //if odd use this
		    {
				System.out.print(a[i]+" ");
         	}

    } 

}
