package consecutivesubarrays;

import java.util.Scanner;

public class ConsecutiveSubArrays1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		subArrays(a);
	}
	static void subArrays(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]==1)
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
				System.out.println();
			}
		}
		System.out.print(a[a.length-1]);
	}

}
