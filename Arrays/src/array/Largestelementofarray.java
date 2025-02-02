
//two ways of initializing max is shown.

package array;

import java.util.Scanner;

public class Largestelementofarray {
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
		 int v=largestElement(a);  
		System.out.print("the smallest element is:" +v);
		  
	}
		
   static int largestElement(int[] a)
	{ 
	    int max=Integer.MIN_VALUE;
		//int max=a[0]; //we can not initialize it with 0 because if we give negative values output with be 0
		for(int i=0;i<a.length;i++)
		    {
			  if(a[i]>max)
			  {
				  max=a[i];
			  }
         	}
         return max;
    }

}
