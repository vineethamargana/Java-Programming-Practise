package dailydairy;

import java.util.Scanner;

public class MultiplesOf2TillN {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		multiplesOf2(n);	
	}
	static void multiplesOf2(int k)
	{
		for(int i=1;i<=k;i++)
		{
			if(i%2==0)
			{
			System.out.print(i+" ");
			}
		}
	}
	

}
