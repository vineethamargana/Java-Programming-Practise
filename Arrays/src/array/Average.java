package array;

import java.util.Scanner;

public class Average {
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
		float v=average(a);  
		System.out.printf("%.2f",v);
		
	}
		
   static float average(int[] a)
	{
	    float s=0;
		float avg =0.0f;
		for(int i=a.length-1;i>=0;i--)
		    {
			  s=s+a[i];
         	}
		avg=s/a.length;
         return avg;
    }


}
