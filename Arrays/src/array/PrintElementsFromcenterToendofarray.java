package array;

import java.util.Scanner;

public class PrintElementsFromcenterToendofarray {
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
		centerToEnd(a);    
	}
		 
   static void centerToEnd(int[] a)
	{
		System.out.print("the elements are:");
			for(int i=a.length/2;i<a.length;i++) //don't use i>=0 or i>0 or i<=a.length in this it will give output but also it gives exception error i.e out of bounds
		    {
				System.out.print(a[i]+" ");
         	}

    } 

}
 