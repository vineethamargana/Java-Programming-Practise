package rearrangeArrays;

import java.util.Scanner;

public class PutallZerostoEndofArray {
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
		int i=0,j=0;
		while(i<ar.length)
		{
			if(ar[i]==0)
			{
				i++;
			}
			else 
			{
				ar[j++]=ar[i++];
				//j--;
				//i--;
			}
		}
		while(j<ar.length)
		{
			ar[j++]=0;
			//j--;
			
		}
	}


}
