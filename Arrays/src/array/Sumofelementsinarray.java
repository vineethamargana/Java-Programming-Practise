
//sum must be initialized to 0 because if 1 the output will 1 value more the real
//we can also give negative values as elements
//we can not give negative values for index

package array;

import java.util.Scanner;

public class Sumofelementsinarray {
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
		int v=sum(a);  
		System.out.print("the sum of elements is:" +v);
		
	}
		
   static int  sum(int[] a)
	{
		int s=0;
		for(int i=0;i<a.length;i++)
		    {
			  s=s+a[i];
         	}
         return s;
    }

}
