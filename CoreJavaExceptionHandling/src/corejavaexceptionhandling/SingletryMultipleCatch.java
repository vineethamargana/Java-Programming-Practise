package corejavaexceptionhandling;

import java.util.Scanner;

public class SingletryMultipleCatch {
	public static void main(String []args)
	{
		   try
		   {
			   Scanner sc=new Scanner(System.in);
			    System.out.println("enter the numerator:");
				int a=sc.nextInt();
				System.out.println("enter the denominator:");
				int b=sc.nextInt();
				int c=a/b;
				System.out.println(c);
		//--------------------------------------------------------------
			System.out.println("connection established");
			//Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of an array");
			int n=sc.nextInt();
			int []arr=new int[n]; 
			System.out.println("enter the data to be inserted");
			int data=sc.nextInt();
			System.out.println("enter the index where data to be inserted");
			int index=sc.nextInt();
			arr[index]=data;
			System.out.println(arr[index]);
			
		}
	     catch(Exception e)
		   {
		       System.out.println("handle it");
		   }
		   System.out.println("connection terminated");
  }

}
