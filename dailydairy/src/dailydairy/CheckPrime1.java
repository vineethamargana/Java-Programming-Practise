package dailydairy;

import java.util.Scanner;

public class CheckPrime1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 String s=primeCheck(n);
		 System.out.print(s);
		

	}
	static String primeCheck(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			
			if(n%i==0)
			{
				count++;
			}
		}
		   // System.out.print((count==2)?"prime":"not prime");
		return ((count==2)?"prime":"not prime");
        }
	}


