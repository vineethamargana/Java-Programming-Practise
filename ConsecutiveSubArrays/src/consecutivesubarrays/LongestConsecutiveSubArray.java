package consecutivesubarrays;

import java.util.Scanner;

public class LongestConsecutiveSubArray {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		subArrays(a);
	}
	static void subArrays(int []a)
	{
		int length=1;
		int max=Integer.MIN_VALUE;
		int ei=0,si=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]==1)  
			{
				length++;
			}
			else
			{
				if(length>max)
				{
					max=length;
					ei=i;
				}
				length=1;
			}
		}
		if(length>max)
		{
			max=length;
			ei=a.length-1;
		}
		si=ei-max+1;
		for(int i=si;i<=ei;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}



}
