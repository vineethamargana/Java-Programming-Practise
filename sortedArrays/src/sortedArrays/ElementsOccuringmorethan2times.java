package sortedArrays;

import java.util.Scanner;

public class ElementsOccuringmorethan2times {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		occurance(a);
	}
	static void occurance(int[] a)
	{
		int c=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
			}
			else
			{
				if(c>2)
				{
				System.out.print(a[i]+" "); // for the last iteration if count is less than 2 then c remains 2 and loop terminates and checks the if condition 
				}
				c=1;
			}
		}
		if(c>2)
		{
		System.out.println(a[a.length-1]);
		}
	}

}
