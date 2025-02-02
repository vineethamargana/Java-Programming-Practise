package subarrays;

import java.util.Scanner;

public class SubArraysWhoseSumISEqualToK {
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int []a=new int[n];
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=scanner.nextInt();	
	}
	int s=scanner.nextInt();
	int k=scanner.nextInt();
	countoccurance(a,s,k);
}

 static void countoccurance(int[] a,int s,int k)
  {
	 //int sum=0;
   for(int i=0;i<=a.length-s;i++)
   {
	   int sum=0;
	   for(int j=i;j<i+s;j++)
	   {
		   sum=sum+a[j];
	   }
	   if(sum==k)
	   {
		   for(int j=i;j<i+s;j++)
		   {
	         System.out.print(a[j]+" ");
		   }
		   System.out.println();
       }
	  // System.out.println();
  }
  }

}
