package sortedArrays;

import java.util.Scanner;

public class Occuranceofeachelement {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		occurance(a);
	}
	static void occurance(int[] a)
	{
		int c=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
			}
			else
			{
				System.out.println(a[i]+"-"+c);
				c=1;
			}
		}
		System.out.println(a[a.length-1]+"-"+c);
	}

}
