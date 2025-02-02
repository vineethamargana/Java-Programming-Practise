package dailydairy;

import java.util.Scanner;

public class FirstNOddNumbers1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		oddNumbers(n);
	}
	static void oddNumbers(int k)
	{
		for(int i=1;i<=k;i++)
		{
			System.out.print(((2*i)-1)+" ");
		}
	}

}
