package dailydairy;

import java.util.Scanner;

public class MultiplesofNtillX {
	public static void main(String []args) 
	{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();//till x
	int n=sc.nextInt();//multiples of this number
	multiples(x,n);
	}
	static void multiples(int x,int n)
	{int c=0;
		for(int i=1;i<=x;i++)
		{
			if(i%n==0)
			{
				System.out.print(i+" ");
				c++;
			}
		}
		System.out.println();
		System.out.print(c);
	}
 }
