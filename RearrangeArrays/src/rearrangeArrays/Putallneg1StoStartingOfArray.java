package rearrangeArrays;

import java.util.Scanner;

public class Putallneg1StoStartingOfArray {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		rearrange(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	static void rearrange(int []ar)
	{
		int i=ar.length-1,j=ar.length-1;
		while(i>=0)
		{
			if(ar[i]==-1)
			{
				i--;
			}
			else 
			{
				ar[j--]=ar[i--];
				//j--;
				//i--;
			}
		}
		while(j>=0)
		{
			ar[j--]=-1;
			//j--;
			
		}
	}

}
