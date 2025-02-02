package dailydairy;

import java.util.Scanner;

public class MultiplesOf2Or3TillN {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		multiplesOf2Or3(n);	
	}
	static void multiplesOf2Or3(int k)
	{
		int c=0;
		for(int i=1;c<k;i++)
		{
			if(i%2==0 || i%3==0)
			{
			System.out.print(i+" ");
			c++;
			}
		}
	}

}
