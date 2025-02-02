package com.tap.hii;

import java.util.Scanner;

public class MrBean {
	static void sizeofBeam(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%3==1)
			{
				System.out.println("Mr.Beam is Small");
			}
			else if(ar[i]%3==2)
			{
				System.out.println("Mr.Beam is Normal");
			}
			else if(ar[i]%3==0)
			{
				System.out.println("Mr.Beam is Huge");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++) 
		{
			ar[i]=sc.nextInt();
		}
		sizeofBeam(ar);
	}
}
