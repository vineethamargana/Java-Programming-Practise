package consecutivesubarrays;

import java.util.Scanner;

public class LengthOfConsecutiveSubArrays {
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
		int length=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]==1)  
			{
				length++;
			}
			else
			{
				System.out.println(length+" ");
				length=1;
			}
		}
		System.out.print(length); 
	}


}
