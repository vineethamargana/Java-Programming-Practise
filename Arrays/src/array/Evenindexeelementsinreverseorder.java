package array;

import java.util.Scanner;

public class Evenindexeelementsinreverseorder {
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
		reverseevenindexlements(a);    
	}
		
   static void  reverseevenindexlements(int[] a)
	{
		System.out.print("the elements are:");
		for(int i=a.length-1;i>=0;i--)
		    {
			  if(i%2==0)
			  {
				System.out.print(a[i]+" ");
		      }
         	}

    }

}
