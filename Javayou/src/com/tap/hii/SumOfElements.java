package com.tap.hii;

import java.util.Scanner;

public class SumOfElements {
	static int sumOfElements(int []ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int res=sumOfElements(ar);
		System.out.println(res);
	}

}
