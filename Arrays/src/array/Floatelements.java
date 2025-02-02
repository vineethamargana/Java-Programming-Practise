package array;

import java.util.Scanner;

public class Floatelements {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		float[] a=new float[n];
		System.out.print("enter the elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextFloat();
		} 
		 printFloat(a);
	}
		
   static void printFloat(float[] a)
	{
		System.out.print("the elements are:");
		for(int i=0;i<a.length;i++)
		//for(int i=0;i!=a.length;i++)
		    {
				System.out.print(a[i]+" ");
			}
	}
		

}
