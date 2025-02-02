package dailydairy;

import java.util.Scanner;

public class FirstNMultiplesOf3Two {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		multiplesOf3(n);
	}
	static void multiplesOf3(int k)
	{
		for(int i=1;i<=k;i++)
		{
			System.out.print((3*i)+" ");
		}
	}

}
