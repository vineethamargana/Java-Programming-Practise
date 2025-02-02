package subarrays;

import java.util.Scanner;

public class AllpossibleSubArrays {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 subArrays(a);
	 
	}

	static void subArrays(int[] a)
	{
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i;j<a.length;j++)
		   {
			   for(int k=i;k<=j;k++)
			   {
				   System.out.print(a[k]+" ");
			   }
			   System.out.println();
		   }
	   }
	}


}
