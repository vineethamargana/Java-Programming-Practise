package dailydairy;

import java.util.Scanner;

public class MultiplesOfaGivenNum 
 {
	public static void main(String []args) 
	{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int n=sc.nextInt();
	multiples(x,n);
	}
	static void multiples(int x,int n)
	{ 
		int c=0;
		for(int i=1;c<x;i++)
		{
			if(i%n==0)
			{
				System.out.print(i+" ");
				c++;
			}
		}
	}
 }