package dailydairy;

import java.util.Scanner;

public class MultiplesOf5One {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		multiplesOf5(n);
	}
	static void multiplesOf5(int k)
	{
		for(int i=1;i<=k;i++)
		{
			System.out.print((5*i)+" ");
		}
	}


}
