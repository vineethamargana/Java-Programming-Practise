// we must consider long instead of int type because if we give big values as input output we get will be negative and wrong
// p should be initialized to 1 because if it is 0 the whole product will be 0
//we can also give negative values as elements
//we can not give negative values for index

package array;

import java.util.Scanner;

public class Productofelementsinarray {
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
		for(int i=a.length-1;i>=0;i--)
		    {
			  p=p*a[i];
         	}
         return p;
    }
}
