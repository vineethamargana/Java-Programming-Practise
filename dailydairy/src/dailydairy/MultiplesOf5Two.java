package dailydairy;

import java.util.Scanner;

public class MultiplesOf5Two {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		multiplesOf5(n);	
	}
	static void multiplesOf5(int k)
	{
		int c=0;
		for(int i=1;c<k;i++)
		{
			if(i%5==0)
			{
			System.out.print(i+" ");
		     c++;
			}
		}
	}
}
