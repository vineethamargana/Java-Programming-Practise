package array;

import java.util.Scanner;

public class Productfrommiddletoend {
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
		 long v=product(a);  
		System.out.print("the product of elements is:" +v);
		
	}
		
   static long product(int[] a)
	{
		long p=1; // p should be initialized to 1 because if it is 0 the whole product will be 0
		for(int i=a.length/2;i<a.length;i++)
		    {
			  p=p*a[i];
         	}
         return p;
    }


}
