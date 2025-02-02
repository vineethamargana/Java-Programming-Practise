package arraypairs;

import java.util.Scanner;

public class Sumisprimeprintpairs {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	// int n=sc.nextInt();
	 System.out.print("enter the size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<a.length;i++)		
		{
			a[i]=sc.nextInt();
		}
	 printPairs(a,n);
	

}
static boolean primeCheck(int n)
{
	if(n<=1)
	{
		return false;
	}
	for(int i=2;i*i<=n;i++)//i<=root n
	{
		
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
    }
static void printPairs(int[] a,int n)
{
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			int s=a[i]+a[j];
			if(primeCheck(s))
			{
			System.out.println(a[i]+"  "+a[j]);
		    }
	    }
    }
}

}
