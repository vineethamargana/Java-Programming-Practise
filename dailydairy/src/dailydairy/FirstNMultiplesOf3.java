package dailydairy;

import java.util.Scanner;

public class FirstNMultiplesOf3 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		multiplesOf3(n);	
	}
	static void multiplesOf3(int k)
	{
		int c=0;
		for(int i=1;c<k;i++)
		{
			if(i%3==0)
			{
			System.out.print(i+" ");
		     c++;
			}
		}
	}
}
