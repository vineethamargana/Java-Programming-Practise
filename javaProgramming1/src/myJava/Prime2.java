package myJava;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		primeCheck(n);
		

	}
	static void primeCheck(int n)
	{
		int count=0;
		//if(n==1)
		//{
			//	System.out.print("not prime");
		//}
		for(int i=2;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.print((count==0)?"prime":"not prime");
}
}
