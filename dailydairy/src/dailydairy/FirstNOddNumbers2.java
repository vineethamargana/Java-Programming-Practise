package dailydairy;

import java.util.Scanner;

public class FirstNOddNumbers2 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		oddNumbers(n);	
	}
	static void oddNumbers(int k)
	{
		int c=0;
		for(int i=1;c<k;i++)
		{
			if(i%2!=0)
			{
			System.out.print(i+" ");
		     c++;
			}
			//c++; // it will give up to given number
			
		}
		//c++; // it will continue giving outputs as c<k and for loop continues
	}
}
