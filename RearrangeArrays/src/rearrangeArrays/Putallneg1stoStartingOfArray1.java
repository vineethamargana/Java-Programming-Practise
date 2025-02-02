package rearrangeArrays;

import java.util.Scanner;

public class Putallneg1stoStartingOfArray1 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int v[]=rearrange(ar);
		for(int i=0;i<v.length;i++)
		{
			System.out.print(v[i]+" ");
		}
		
	}
	static int[] rearrange(int []ar)
	{
		int b[]=new int[ar.length];
		int k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==-1)
			{
			   b[k++]=ar[i];
			   i++;
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=-1) 
			{
				b[k++]=ar[i];
			}
		}
		return b;
	}

}
