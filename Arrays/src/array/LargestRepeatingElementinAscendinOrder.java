package array;

import java.util.Scanner;

public class LargestRepeatingElementinAscendinOrder {
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
		 int v= LargestElement(a);  
		 System.out.print("the largest repeating element is:" +v);
		
	}
		 
   static int LargestElement(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		 {
				if(a[i]==a[i+1])
				{
					return a[i];
				}
		 }
		return -1;
	}		 

}
